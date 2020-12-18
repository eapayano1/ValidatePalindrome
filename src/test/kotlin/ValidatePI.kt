
fun validatePalidromeLetter(letter:String):Boolean{
    val substring:CharArray=letter.toLowerCase().toCharArray()
    var flag=true
    for(i in 0..substring.size-1){
        if(substring[i]!=substring[substring.size-1-i])//Se comprueba si uno de elementos es diferente comparando el primero con el ultimo etc.
        {
            flag=false
        }
    }
    if(flag){
        return true
    }
    return false

}