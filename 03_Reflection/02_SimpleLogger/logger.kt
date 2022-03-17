import kotlin.reflect.full.memberProperties

fun log(obj : Any) {
	
	val klass = obj.javaClass.kotlin  // should be: obj::class
	
	println("${klass.simpleName} {")
	klass.memberProperties.forEach { prop ->
		println("   ${ prop.name }: ${ prop.get(obj) }")
  }
	println("}")	
}

data class Item(val num : Int, var name : String)

fun main() {
	log("ALPHA")
	log(Item(1234, "ISEL"))
}
