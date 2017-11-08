operator fun MyDate.rangeTo(other: MyDate) = DateRange(MyDate(2013, 1, 11), MyDate(2017, 12, 12) )

class DateRange(override val start: MyDate, override val endInclusive: MyDate): ClosedRange<MyDate>

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}
