package br.com.zup.autores

import br.com.zup.endereco.EnderecoClient
import br.com.zup.endereco.EnderecoResponse
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import io.micronaut.http.uri.UriBuilder

import javax.validation.Valid

@Controller("/autores")
class CadastraAutorController(
     val autorRepository: AutorRepository,
     val enderecoClient: EnderecoClient
) {
    @Post
    fun salvaAutor(@Body @Valid autorRequest: NovoAutorRequest): HttpResponse<Any>{

        //fazer uma requisicao para um servico externo
        val enderecoResponse:HttpResponse<EnderecoResponse> = enderecoClient.consultar(autorRequest.cep)

        val autor = autorRequest.toAutor(enderecoResponse.body()!!)

        autorRepository.save(autor)

       val uri = UriBuilder.of("/autores/{id}")
           .expand(mutableMapOf(Pair("id",autor.id)))

        return HttpResponse.created(uri)

    }
        }




