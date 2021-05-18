package br.com.zup.autores

import br.com.zup.endereco.EnderecoClient
import br.com.zup.endereco.EnderecoResponse
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import javax.inject.Inject

@MicronautTest
internal class CriaAutorTest {

    @field:Inject
    lateinit var enderecoClient: EnderecoClient

    lateinit var enderecoResponse: EnderecoResponse

    @field:Inject
    @field:Client("/")
    lateinit var client: HttpClient

    lateinit var novoAutor: NovoAutorRequest

    @BeforeEach
    fun setUp() {
        novoAutor = NovoAutorRequest("CaioNovo", "caionovoa", "hjihui brasileiro",
            "54546", "87877")

        enderecoClient = Mockito.mock(EnderecoClient::class.java)

        enderecoResponse = EnderecoResponse(novoAutor.cep, "Rua das Laranjeiras", "",
            "Boqueirao", "Praia Grande", "SP")
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    internal fun `deve salvar um autor`() {
        //Cenario
        Mockito.`when`(enderecoClient.consultar(novoAutor.cep)).thenReturn(HttpResponse.ok(enderecoResponse))


        //Acao
        val response = client.toBlocking().exchange(HttpRequest.POST("/autores", novoAutor), HttpResponse::class.java)

        //Verificacao
        assertEquals(HttpStatus.CREATED, response.status)
        assertTrue(response.headers.contains("Location"))
        assertTrue(response.header("Location")!!.matches("/autores/\\d".toRegex()))


    }
}