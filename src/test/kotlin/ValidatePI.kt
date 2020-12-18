
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