// Scanner serve para entrada de dados
import java.util.Scanner
fun main(){
    val scanner = Scanner(System.`in`)
    var numero:Int

    println("Digite um número (0 para sair)")
    numero = scanner.nextInt()

    while(numero != 0){
        println("Você digitou: $numero")
        println("Digite outro número(0 para sair")
        numero = scanner.nextInt()
    }
    println("Programa encerrado")
}