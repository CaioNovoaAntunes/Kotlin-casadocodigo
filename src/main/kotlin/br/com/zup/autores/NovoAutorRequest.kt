package br.com.zup.autores

import br.com.zup.endereco.Endereco
import br.com.zup.endereco.EnderecoResponse
import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Introspected
data class NovoAutorRequest(
        @field:NotBlank val nome:String,
        @field:NotBlank @field:Email val email: String,
        @field:NotBlank @field:Size(max = 400) val descricao: String,
        @field:NotBlank val cep:String,
        @field:NotBlank val numero:String) {

        fun toAutor(enderecoResponse: EnderecoResponse): Autor {
                val endereco = Endereco(enderecoResponse, numero)
                return Autor(nome = this.nome, email = this.email, descricao = this.descricao, endereco)
        }
}