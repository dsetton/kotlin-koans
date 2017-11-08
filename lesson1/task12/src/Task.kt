import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    //Collections.sort(arrayList, { x, y -> y.compareTo(x) }) //também funciona
    Collections.sort(arrayList, { x, y -> y - x }) // solução nova
    return arrayList
}