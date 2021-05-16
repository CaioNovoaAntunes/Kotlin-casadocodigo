package br.com.zup

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import io.micronaut.http.uri.UriBuilder

import javax.validation.Valid

@Controller("/autores")
class CadastraAutorController(
     val autorRepository: AutorRepository
) {
    @Post
    fun salvaAutor(@Body @Valid autorRequest: NovoAutorRequest): HttpResponse<Any>{

        //fazer uma requisicao para um servico externo


        val autor = autorRequest.paraAutor()
        autorRepository.save(autor)

       val uri = UriBuilder.of("/autores/{id}")
           .expand(mutableMapOf(Pair("id",autor.id)))

        return HttpResponse.created(uri)

    }
        }




