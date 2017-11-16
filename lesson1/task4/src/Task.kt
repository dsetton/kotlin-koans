// o objetivo desse exercício era trocar a declaração da função "foo" para usar o argumento "default" da propriedade "number"

fun foo(name: String, number: Int = 42, toUpperCase: Boolean) =
        (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
        foo("a", false),
        foo("b", 1, false),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
)
