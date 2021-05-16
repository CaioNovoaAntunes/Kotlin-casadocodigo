package br.com.zup.autores

class DetalhesDoAutor(
    var nome:String? = "",
    var email: String? = "",
    var descricao:String?= ""


) {
    constructor(autor:Autor) : this() {
        nome = autor.nome
        email = autor.email
        descricao = autor.descricao
    }

}