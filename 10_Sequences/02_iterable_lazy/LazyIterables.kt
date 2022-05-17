fun <T> Iterable<T>.inspect(inspector: (T) -> Unit) : Iterable<T> {
	return object : Iterable<T> {
		override fun iterator() : Iterator<T> {
			val input : Iterator<T> = this@inspect.iterator()
			return object : Iterator<T> {
				override fun hasNext() : Boolean = input.hasNext()
				override fun next() : T {
					val item = input.next()
					inspector(item)
					return item
				}
			}
		}
	}
}

fun <T> Iterable<T>.where(predicate : (T) -> Boolean) : Iterable<T> {
	return object : Iterable<T> {
		override fun iterator() : Iterator<T> {
			val input : Iterator<T> = this@where.iterator()
			return object : Iterator<T> {
				private var curr = advance()
				
				override fun hasNext() : Boolean = curr != null
				
				override fun next() : T {
					val res = curr
					if (res == null) throw Exception("No more elements")
					curr = advance()
					return res
				}
				
				private fun advance() : T? {
					while (input.hasNext()) {
						val item = input.next()
						if (predicate(item)) {
							return item
						}
					}
					return null
				}
			}
		}
	}
}

fun <T,R> Iterable<T>.select(mapper: (T) -> R) : Iterable<R> {
	return object : Iterable<R> {
		override fun iterator() : Iterator<R> {
			val input : Iterator<T> = this@select.iterator()
			return object : Iterator<R> {
				override fun hasNext() : Boolean = input.hasNext()
				override fun next() : R = mapper(input.next())
			}
		}
	}
}

fun <T> Iterable<T>.lookup(predicate: (T) -> Boolean) : T? {
	for (item in this) {
		if (predicate(item)) {
			return item
		}
	}
	return null
}

data class Person(val id: Int, val name: String, val birthYear: Int)

fun main() {
	val inputData = listOf(
		Person(10000, "Afonso Henriques", 1109),
		Person(11000, "Inês de Castro", 1325),
		Person(12000, "Nuno Álvares Pereira", 1360),
		Person(14000, "Luís de Camões", 1524),
		Person(13000, "Vasco da Gama", 1469),
		Person(16000, "Fernando Pessoa", 1888),
		Person(15000, "Josefa de Óbidos", 1630),
	)

	/*
	val outputData =
		inputData
			.filter { it.birthYear > 1500 }
			.map { it.name }
			.find { it[0] == 'L' }
	*/
	
	val outputData =
		inputData
			.inspect { println(">> $it") }
			.where { it.birthYear > 1500 }
			.select { it.name }
			.lookup { it[0] == 'L' }
	
	println(outputData)
}
