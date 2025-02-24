class Vingadores(var name: String, var idade: Int, var poder: String, var peso: Double ) {

    // Método: Ação do objeto
    //Métodos são representados em funções DENTRO DA CLASSE
    fun soltarTeia() {
        println("pchiiiuu")
    }

    fun bater(name:String){
        println("$name: Morra. *boing*")
    }
}
fun main(){
    val miranha = Vingadores("Peter Parker", 16, "Aranha", 76.68)

    println("Nome: "+miranha.name)
    println("Idade: "+miranha.idade)
    println("Poder: "+miranha.poder)
    println("Peso: "+miranha.peso)
    miranha.soltarTeia()
    println("")

    val homiDeFero = Vingadores("Tony Stark", 48, "Riqueza", 102.43)

    println("Nome: "+homiDeFero.name)
    println("Idade: "+homiDeFero.idade)
    println("Poder: "+homiDeFero.poder)
    println("Peso: "+homiDeFero.peso)
}