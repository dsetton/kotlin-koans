fun renderProductTable(): String {
    return html {
        table {
            tr /* TODO */{

                //colorir???

                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()

            var _prod: Product

            for(_prod in products){
                println(_prod.description)
                println( _prod.popularity)
                println( _prod.price)
                println("-----------------------------")

            }
            /*
            * print cactus
            * print cake
            * print camera
            * print car
            * ...
            * */
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) %2 == 0) "#dce4ff" else "#eff2ff"
