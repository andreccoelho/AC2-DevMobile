fun main(){
    var heroi1 = Heroi("Homem Aranha", "Peter Parker", "Soltar teias",99 )
    var heroi2 = Heroi("Batman","Bruce Wayne", "Gadgets tecnológicos", 98 )

    heroi1.poder = "Sentido aranha"

}

class Heroi(val nome:String, val identidadeSecreta:String, var poder:String, var forca:Int)

class Equipe {
    var heroi1 = Heroi("Flash","Barry Allen","Super Velocidade",99)
    var heroi2 = Heroi("Thor","Thor", "Deus do Trovão",100)
    var heroi3 = Heroi("Hulk", "Bruce Banner", "Super Força", 100)


}


