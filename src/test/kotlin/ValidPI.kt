
fun validatePalindromeLetter(palindromLetter: String):Boolean{
    val b:CharArray=palindromLetter.toLowerCase().toCharArray()
    var flag=true
    for(i in 0..b.size-1){
        if(b[i]!=b[b.size-1-i]){
            flag=false
        }
    }
    if(flag){
        return true
    }
    return false
}

fun validatePalindromeNumber(palindromNumeber:Int):Boolean{
    var digit=0
    var reve=0
    var num=palindromNumeber

    while(num!=0){
        digit=num%10
        reve=(reve*10) + digit
        num=num/10
    }
    if(reve==palindromNumeber){
        return true
    }
    return false
}