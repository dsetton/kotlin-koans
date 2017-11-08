/* TODO */ data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

fun isLeapDay(date: MyDate): Boolean {

    val (year, month, dayOfMonth) = date

    // 29 February of a leap year
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}


/*
Let's say we need to return two things from a function. For example, a result object and a status of some sort. A compact way of doing this in Kotlin is to declare a data class and return its instance:

data class Result(val result: Int, val status: Status)
fun function(...): Result {
    // computations

    return Result(result, status)
}

// Now, to use this function:
val (result, status) = function(...)

Since data classes automatically declare componentN() functions, destructuring declarations work here.

NOTE: we could also use the standard class Pair and have function() return Pair<Int, Status>, but it's often better to have your data named properly.
*/