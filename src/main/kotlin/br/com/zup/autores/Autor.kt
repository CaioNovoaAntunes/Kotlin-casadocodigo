package br.com.zup.autores

import br.com.zup.endereco.Endereco
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import javax.persistence.*


@Entity
class Autor(
    val  nome: String,
    val email: String,
    var descricao: String,
    @Embedded
    var endereco: Endereco
){


    @Id
    @GeneratedValue
    var id: Long? = null
    @CreationTimestamp
    val creatAT: LocalDateTime = LocalDateTime.now()
}




