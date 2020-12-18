import kotlin.test.Test
import kotlin.test.assertEquals

class SampleTest{
    @Test
    fun testValidatePalindromeLetter(){
        val actual=validatePalindromeLetter("reconocer")
        val expected=true
        assertEquals(expected, actual)
    }
}