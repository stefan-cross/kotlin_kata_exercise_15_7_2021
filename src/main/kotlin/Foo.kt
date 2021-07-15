class Foo { val someVal = "someValue" }

fun fooFunction(var1: Int, var2: Int, operation: (Int, Int) -> Int): Int = operation(var1, var2)