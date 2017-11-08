fun Int.r(): RationalNumber = RationalNumber(numerator = this, denominator = 1)
//fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(numerator = first, denominator = second
//)

data class RationalNumber(val numerator: Int, val denominator: Int)
/*
import org.junit.Test
import org.junit.Assert

class TestExtensionFunctions() {
    @Test fun testIntExtension() {
        Assert.assertEquals("Rational number creation error: ", RationalNumber(4, 1), 4.r())
    }

    @Test fun testPairExtension() {
        Assert.assertEquals("Rational number creation error: ", RationalNumber(2, 3), Pair(2, 3).r())
    }
}
*/