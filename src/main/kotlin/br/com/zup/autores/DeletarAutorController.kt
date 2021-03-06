package br.com.zup.autores

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.HttpResponse
import javax.transaction.Transactional

@Controller("/deletaAutor/{id}")
class DeletarAutorController(val autorRepository: AutorRepository)  {

    @Transactional
    @Delete
    fun deleta(@PathVariable id:Long): HttpResponse<Any>{
        val possivelAutor = autorRepository.findById(id)
        if (possivelAutor.isEmpty){
            return HttpResponse.notFound()
        }
        val autor = possivelAutor.get()
        autorRepository.delete(autor)
        return HttpResponse.ok()
    }
    }
