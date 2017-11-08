import java.util.Collections
import java.util.Comparator

fun getList(): List<Int> {//-------------------------
    val arrayList = arrayListOf(1, 5, 2)//           V
    Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(obj1: Int, obj2: Int): Int{
            //return if(obj1 <= obj2){ obj2 } else { obj1 } //ordem crescente

            //https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/compare-to.html

            //return obj2.compareTo(obj1) //também funciona
            return obj2 - obj1 // nova solução
        }
    })
    return arrayList
}
