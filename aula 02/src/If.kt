fun main(){

    if(20>18){
        println("20 é maior que 18")
    }

    val x = 18
    val y = 19
    val z = 20

    if(x>y){
        println("X é maior que Y")
    }

    if(x>y && x>z){
        println("X é o maior elemento")
    }else if(y>x && y>z){
        println("Y é o maior elemento")
    }else{
        println("Z é o maior elemento")
    }

    val time = 1
    if(time < 0){
        println("Bom dia :)")
    }else if(time < 2) {
        println("Boa tarde :)")
    }else{
        println("Boa noite :)")
    }

    val time2 = 20
    val greeting = if (time2<20)"Good Morning! :)" else "Good Afternoon! ;)"
    println(greeting)
}