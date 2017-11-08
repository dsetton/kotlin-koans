fun foo(name: String, number: Int, toUpperCase: Boolean) =
        (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
        foo("a", 42, false),
        foo("b", 1, false),
        foo("c", number = 42, toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
)
