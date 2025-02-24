//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val filmes = arrayOf("A lagoa azul", "Harry Potter", "Centopeia Humana", "Vingadores", "Invocação do Mal", "A Freira 2", "Annabelle", "Carros")

    println(filmes[2])
    println("O tamanho do array é: "+filmes.size)
    if("Carros" in filmes){
        println("Filme Encontrado")
    }else{
        println("Filme Não Encontrado")
    }
    for(filme in filmes){
        println(filme)
    }

}