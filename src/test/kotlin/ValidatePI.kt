
fun validatePalindromeLetter(a:String): Boolean{
    val b : CharArray = a.toLowerCase().toCharArray()
    var flag = true
    for(i in 0..b.size - 1){
        if(b[i] != b[b.size-1-i]){
            flag = false
        }
    }
    if(flag){
        return true
    }
    return false
}