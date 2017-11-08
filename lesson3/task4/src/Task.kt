// Return all products this customer has ordered
fun Customer.getOrderedProducts(): Set<Product> = orderedProducts

// Return all products that were ordered by at least one customer
fun Shop.getAllOrderedProducts(): Set<Product> = TODO()
