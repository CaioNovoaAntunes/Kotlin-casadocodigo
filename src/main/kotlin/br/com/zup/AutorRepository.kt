package br.com.zup

import io.micronaut.data.annotation.Query
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface AutorRepository: JpaRepository<Autor, Long> {

    @Query("SELECT a From Autor a Where a.email = :email")
     fun buscarPorEmail(email: String):Optional<Autor>
}