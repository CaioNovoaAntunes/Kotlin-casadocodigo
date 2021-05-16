package br.com.zup

import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import javax.persistence.*


@Entity
class Autor(
    var  nome: String,
    var email: String,
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




