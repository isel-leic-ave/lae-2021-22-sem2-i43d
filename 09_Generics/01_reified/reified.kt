import kotlin.reflect.*
import kotlin.reflect.full.*

/*
fun createObj(k : KClass<*>) : Any {
	return k.createInstance()
}
*/

fun <T : Any> createObj(k : KClass<T>) : T {
	return k.createInstance()
}

inline fun <reified T : Any> createObj() : T {
	return T::class.createInstance()
}

open class A
open class B : A()

fun main() {
	/*
	val obja = createObj(A::class) as A
	val objb = createObj(B::class) as B
	*/

	// --------

	val obja = createObj(A::class)
	val objb = createObj(B::class)
	println("> $obja")
	println("> $objb")

	val obja2 = createObj<A>()
	val objb2 : B = createObj()
	
	println("> $obja2")
	println("> $objb2")
}
