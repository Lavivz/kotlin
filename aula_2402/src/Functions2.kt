fun main() {
    var result = somaFunction(8)
    println("O resultado da soma é: "+result)

    var result2 = subtracaoFunction(10,2)
    println("O resultado da subtração é: "+result2)
}

fun somaFunction(x:Int):Int{
    return (x + 5)
}

fun subtracaoFunction(x:Int, y:Int):Int{
    return (x - y)
}