import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FooTest {

    @Test
    fun `some example test`() {
        assertEquals(Foo().someVal, "someValue")
    }

    @Test
    fun `testing fooFunction`() {
        val additionFun = { a: Int, b: Int -> a + b }
        assertEquals(fooFunction(5, 5, additionFun), 10)
    }
}