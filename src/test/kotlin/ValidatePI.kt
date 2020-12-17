
fun validatePalindromeLetter(letter:String): Boolean{
    val arraychar : CharArray = letter.toLowerCase().toCharArray()
    var flag = true
    for(i in 0..arraychar.size - 1){
        if(arraychar[i] != arraychar[arraychar.size-1-i]){
            flag = false
        }
    }
    if(flag){
        return true
    }
    return false
}

fun validatePalindromeNumber(number:Int):Boolean{
    var digit=0
    var reve=0
    var num=number
    while(num!=0){
        digit=num%10
        reve=(reve*10)+digit
        num=num/10
    }
    if(reve==number){
        return true
    }
    return false
}