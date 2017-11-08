data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(objetoData : MyDate){

    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
