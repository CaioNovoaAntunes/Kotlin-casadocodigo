package br.com.zup.autores

import br.com.zup.endereco.Endereco
import br.com.zup.endereco.EnderecoResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
internal class BuscaAutoresControllerTest {

    @field:Inject
    @field:Client("/")
    lateinit var httpClient: HttpClient

    @field:Inject
    lateinit var autorRepository: AutorRepository

    lateinit var autor: Autor

    @BeforeEach
    fun setup() {
        val responseClient = EnderecoResponse("1112314", "XXXX", "", "XXX do campo", "pg", "sp")
        autor = Autor(
            "caionovoa", "caio@email.com", "um grande XXX",
            Endereco(responseClient, "813")
        )

        autorRepository.save(autor)
    }

    @AfterEach
    internal fun cleanBD() {

        autorRepository.deleteAll()
    }


    @Test
    internal fun `deve retornar autor com base no email`() {

        val respose =
            httpClient.toBlocking().exchange("/autores?email=${autor.email}", DetalhesDoAutor::class.java)

        Assertions.assertNotNull(respose.body())
        Assertions.assertEquals(HttpStatus.OK, respose.status)
        Assertions.assertEquals("caionovoa", respose.body()!!.nome)
        Assertions.assertEquals("caio@email.com", respose.body()!!.email)
        Assertions.assertEquals("um XXXX lutador", respose.body()!!.descricao)

    }
}