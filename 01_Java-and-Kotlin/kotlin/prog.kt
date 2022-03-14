
private class D() {
	fun md() { println("D") }
}

fun main() {
	val a = A()
	val b = B()
	var c = C()
	var d = D()
	
	a.ma()
	b.mb()
	c.mc()
	d.md()
}
