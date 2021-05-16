package br.com.zup

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import javax.transaction.Transactional
import javax.validation.Valid

@Controller("/autores")
class BuscaAutoresController(val autorRepository: AutorRepository){


    @Get
    @Transactional
    fun lista(@QueryValue(defaultValue = "") email: String): HttpResponse<Any> {
        if (email.isBlank()) {
            val autores = autorRepository.findAll()
            val resposta = autores.map { autor -> DetalhesDoAutor(autor) }

            return HttpResponse.ok(resposta)
        }

        val possivelAutor = autorRepository.buscarPorEmail(email)
        if (possivelAutor.isEmpty) {
            return HttpResponse.notFound()

        }
        val autor = possivelAutor.get()
        return HttpResponse.ok(DetalhesDoAutor(autor))

    }
}




