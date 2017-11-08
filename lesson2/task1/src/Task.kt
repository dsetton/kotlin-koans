data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(objetoData : MyDate) =
            // "=" ~= return "just for one"

        when{
            year != objetoData.year -> year - objetoData.year
            month != objetoData.month -> month - objetoData.month
            else -> dayOfMonth - objetoData.dayOfMonth
        }

    /*
    when { //sem (atributo)
        x.isOdd() -> print("x is odd")
        x.isEven() -> print("x is even")
        else -> print("x is funny")
    }*/


}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
/*
//Não conssegui resolver sozinho

//Idéia ---> In rangee/MyDate.kt:

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate>{
    override fun compareTo(other: MyDate): Int{
        if(year != other.year) return year - other.year
        if(month != other.month) return month - other.month
        return dayOfMonth - other.dayOfMonth
    }
}
* */