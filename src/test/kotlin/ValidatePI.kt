
fun validatePalindromeLetter(letter:String): Boolean{
    val b:CharArray=letter.toLowerCase().toCharArray()
    var flag=true
    for(i in 0..b.size-1)//Valida si uno de elementos es diferente, comparando el primero con el ultimo etc.
    {
        if(b[i]!=b[b.size-1-i]){
            flag=false
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
    while(num!=0)//Revertir el numero
    {
        digit=num%10
        reve=(reve*10)+digit
        num=num/10
    }
    if(reve==number){
        return true
    }
    return false
}