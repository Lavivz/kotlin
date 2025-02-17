fun main(){

    val cars = arrayOf("Volvo","BMW","Ford","Mazda")

    println(cars[1])

    cars[0] = "Ferrari"

    println(cars[0])
    println(cars.size)

    if("Volvo" in cars){
        println("Existe")
    }else{
        println("Não existe")
    }
    for(car in cars){
        println(car)
    }
}