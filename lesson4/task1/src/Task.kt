class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
    /*fun setProp(propertyWithCounter: Int?) : "void" {
        propertyWithCounter = this.propertyWithCounter
        this.counter++

    }*/
     set(valor: Int?){
         field = valor
         this.counter++
     }
}

//duvida
//"field" pode assumir a forma(variavel para outra variavel) de
//qualquer "var" da classe?
