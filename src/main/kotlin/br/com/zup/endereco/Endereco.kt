package br.com.zup.endereco

import javax.persistence.Embeddable
import javax.persistence.Embedded

@Embeddable
class Endereco(
    enderecoClient: EnderecoResponseClient,
    val numero: String
) {
    val cep: String = enderecoClient.cep
    val logradouro = enderecoClient.logradouro
    val complemento = enderecoClient.complemento
    val bairro = enderecoClient.bairro
    val localidade = enderecoClient.localidade
    val uf = enderecoClient.uf
}
