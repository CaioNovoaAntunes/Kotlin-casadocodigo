package br.com.zup.endereco

import javax.persistence.Embeddable

@Embeddable
class Endereco(
    endereco: EnderecoResponse,
    val numero: String
) {
    val cep: String = endereco.cep
    val logradouro = endereco.logradouro
    val complemento = endereco.complemento
    val bairro = endereco.bairro
    val localidade = endereco.localidade
    val uf = endereco.uf
}
