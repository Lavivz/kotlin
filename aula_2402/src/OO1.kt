/*Classe: Um molde para criação de objetos
          Uma "fábrica" de objetos

Objeto: Instância de uma classe
Atributos: Características dos objetos
Métodos: Ações
 */

fun main(){
    // Atributos
    // Inicializando
    class Vingadores{
        var name = ""
        var idade = 0
        var poder = ""
        var peso = 0.0
    }
    // Criação do objeto
    val homemDeFerro = Vingadores()
    homemDeFerro.name = "Tony Stark"
    homemDeFerro.idade = 48
    homemDeFerro.poder = "Riqueza"
    homemDeFerro.peso = 192.50

    //printa o edn de memoria do objeto

    println(homemDeFerro)
    println("")
    println(homemDeFerro.name)
    println(homemDeFerro.idade)
    println(homemDeFerro.poder)
    println(homemDeFerro.peso)

    val miranha = Vingadores()
    miranha.name = "Peter Parker"
    miranha.idade = 20
    miranha.poder = "Aranha"
    miranha.peso = 76.50

    println("")
    println(miranha.name)
    println(miranha.idade)
    println(miranha.poder)
    println(miranha.peso)
}