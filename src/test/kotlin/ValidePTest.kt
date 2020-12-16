import kotlin.test.Test
import kotlin.test.assertEquals

class SampleTest{
    @Test
    fun testValidatePalindromeLetter(){
        val actual=validatePalindromeLetter("reconocer")
        val expected=true
        assertEquals(expected,actual)
    }
    @Test
    fun testValidatePalindromeNumber(){
        val actual=validatePalindromeNumber(121)
        val expected=true
        assertEquals(expected,actual)
    }
}