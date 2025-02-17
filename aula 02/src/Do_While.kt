import java.util.Scanner
fun main(){
    val scanner = Scanner(System.`in`)
    var nome:String

    do{
        println("Digite um nome (Sair para sair)")
        nome = scanner.nextLine()

        if(nome != "Sair"){
            println("Você digitou o nome: $nome")

        }
    }while(nome != "Sair")
    println("Programa encerrado")
    
}