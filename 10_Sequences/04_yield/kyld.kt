
val seq = sequence {
	yield(1)
	yield(2)
	yield(3)
	yield(4)
	yield(5)
}

fun main() {
	println(seq.toList())
}
