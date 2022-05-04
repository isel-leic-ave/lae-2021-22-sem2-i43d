import java.util.Date

interface Holder<T> {
	fun getData() : T
}

class StringHolder(private val value : String) : Holder<String>
{
	override fun getData() : String {
		return value
	}
}

class DateHolder(private val value : Date) : Holder<Date> 
{
	override fun getData() : Date {
		return value
	}
}

open class ValueHolder<T>(private val value : T) : Holder<T> {
	override fun getData() : T {
		return value
	}
}

fun main() {

	//val strHolder : Holder<String> = ValueHolder<String>("LAE/LEIC43D")
	//val strHolder : StringHolder = StringHolder("LAE/LEIC43D")
	val strHolder : Holder<String> = StringHolder("LAE/LEIC43D")

	//val dateHolder : Holder<Date> = ValueHolder<Date>(Date())
	//val dateHolder : DateHolder  = DateHolder(Date())
	val dateHolder : Holder<Date>  = DateHolder(Date())
	
	val str : String = strHolder.getData()
	val date : Date = dateHolder.getData()
	
	println(str)
	println(date)
}
