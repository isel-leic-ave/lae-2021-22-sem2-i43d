import kotlin.reflect.*
import kotlin.reflect.full.*

class Logger {

	private interface ObjLogger {
		fun log(obj : Any)
	}

	fun log(obj : Any?) {

		if (obj == null) {
			println("null")
			return
		}

		findLoggerFor(obj::class).log(obj)
	}

	companion object {
	
		private class ClassLogger(private val klass : KClass<*>) : ObjLogger {
			val name = findName()
			val props = findProperties()
		
			public override fun log(obj : Any) {
				println("${name} {")
				
				props.forEach { prop->
					println("   ${ prop.name }: ${ prop.get(obj) }")
				}

				println("}")
			}
		
			private fun findName() : String? {
				val altName = klass.findAnnotation<AltName>()
				return altName?.aka ?: klass.simpleName
			}
			
			@Suppress("UNCHECKED_CAST")
			private fun findProperties() =
				klass.memberProperties
			     .filter {
			        prop -> prop.visibility == KVisibility.PUBLIC
							&&
							!prop.hasAnnotation<NoLog>()
			     }
			     as List<KProperty1<Any, Any?>>
		}
		
		private fun createLogger(klass : KClass<*>) =
			if (klass.hasAnnotation<NoLog>())
				object : ObjLogger {
					public override fun log(obj : Any) { }
				}
			else
				ClassLogger(klass)

		private val loggers : MutableMap<KClass<*>, ObjLogger> =
			mutableMapOf()
	
		private fun findLoggerFor(klass : KClass<*>) =
			loggers.computeIfAbsent(klass, ::createLogger)
	}
}
