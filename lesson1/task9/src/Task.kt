fun eval(expr: Expr): Int =
        when (expr) {
            //não usar "return"
            //java: função(), kotlin: função
            is Num ->  expr.value
            //sum -> expr, get{Left, Right}->{left, right}
            is Sum -> eval(expr.left) + eval(expr.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
