package br.com.zup.autores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0015\u001a\u00020\u0016H\u0001\u00a2\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\u0016H\u0001\u00a2\u0006\u0002\b\u0019J\b\u0010\u001a\u001a\u00020\u0016H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lbr/com/zup/autores/BuscaAutoresControllerTest;", "", "()V", "autor", "Lbr/com/zup/autores/Autor;", "getAutor", "()Lbr/com/zup/autores/Autor;", "setAutor", "(Lbr/com/zup/autores/Autor;)V", "autorRepository", "Lbr/com/zup/autores/AutorRepository;", "getAutorRepository", "()Lbr/com/zup/autores/AutorRepository;", "setAutorRepository", "(Lbr/com/zup/autores/AutorRepository;)V", "httpClient", "Lio/micronaut/http/client/HttpClient;", "getHttpClient", "()Lio/micronaut/http/client/HttpClient;", "setHttpClient", "(Lio/micronaut/http/client/HttpClient;)V", "cleanBD", "", "cleanBD$nossa_casa_codigo", "deve retornar autor com base no email", "deve retornar autor com base no email$nossa_casa_codigo", "setup", "nossa-casa-codigo"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest()
public final class BuscaAutoresControllerTest {
    @io.micronaut.http.client.annotation.Client(value = "/")
    @javax.inject.Inject()
    public io.micronaut.http.client.HttpClient httpClient;
    @javax.inject.Inject()
    public br.com.zup.autores.AutorRepository autorRepository;
    public br.com.zup.autores.Autor autor;
    
    @org.jetbrains.annotations.NotNull()
    public final io.micronaut.http.client.HttpClient getHttpClient() {
        return null;
    }
    
    public final void setHttpClient(@org.jetbrains.annotations.NotNull()
    io.micronaut.http.client.HttpClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.autores.AutorRepository getAutorRepository() {
        return null;
    }
    
    public final void setAutorRepository(@org.jetbrains.annotations.NotNull()
    br.com.zup.autores.AutorRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.autores.Autor getAutor() {
        return null;
    }
    
    public final void setAutor(@org.jetbrains.annotations.NotNull()
    br.com.zup.autores.Autor p0) {
    }
    
    @org.junit.jupiter.api.BeforeEach()
    public final void setup() {
    }
    
    @org.junit.jupiter.api.AfterEach()
    public final void cleanBD$nossa_casa_codigo() {
    }
    
    public BuscaAutoresControllerTest() {
        super();
    }
}