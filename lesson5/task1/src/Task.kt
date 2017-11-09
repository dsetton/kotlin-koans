fun task(): List<Boolean> {
    val isEven: Int.() -> Boolean = { (this >= 300 || this < 0) }//return boolean | sem "->"
    val isOdd: Int.() -> Boolean = { ( this > 50 && this < 300) }//return boolean | sem "->"

    return listOf(42.isOdd()/*make false*/, 239.isOdd()/*make true*/, 294823098.isEven()/*make even*/)
}



/*
fun main(args: Array<String>) {
    var _numero: Int.(_a: Int) -> Int = {_a -> this * _a}
    println("${2._numero(5)}")

    //https://www.youtube.com/watch?v=VYkHxsz6lgc
}
*/