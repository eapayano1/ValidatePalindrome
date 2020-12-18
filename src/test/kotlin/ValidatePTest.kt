import kotlin.test.Test
import kotlin.test.assertEquals

class SampleTest{
    @Test
    fun testValidatePalindromeLetter(){
        val actual=validatePalidromeLetter("reconocer")
        val expected=true
        assertEquals(expected,actual)
    }
}