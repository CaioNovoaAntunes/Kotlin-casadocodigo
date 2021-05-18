package br.com.zup.autores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u001b\u001a\u00020\u001cH\u0001\u00a2\u0006\u0002\b\u001dJ\b\u0010\u001e\u001a\u00020\u001cH\u0007J\b\u0010\u001f\u001a\u00020\u001cH\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006 "}, d2 = {"Lbr/com/zup/autores/CriaAutorTest;", "", "()V", "client", "Lio/micronaut/http/client/HttpClient;", "getClient", "()Lio/micronaut/http/client/HttpClient;", "setClient", "(Lio/micronaut/http/client/HttpClient;)V", "enderecoClient", "Lbr/com/zup/endereco/EnderecoClient;", "getEnderecoClient", "()Lbr/com/zup/endereco/EnderecoClient;", "setEnderecoClient", "(Lbr/com/zup/endereco/EnderecoClient;)V", "enderecoResponse", "Lbr/com/zup/endereco/EnderecoResponse;", "getEnderecoResponse", "()Lbr/com/zup/endereco/EnderecoResponse;", "setEnderecoResponse", "(Lbr/com/zup/endereco/EnderecoResponse;)V", "novoAutor", "Lbr/com/zup/autores/NovoAutorRequest;", "getNovoAutor", "()Lbr/com/zup/autores/NovoAutorRequest;", "setNovoAutor", "(Lbr/com/zup/autores/NovoAutorRequest;)V", "deve salvar um autor", "", "deve salvar um autor$nossa_casa_codigo", "setUp", "tearDown", "nossa-casa-codigo"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest()
public final class CriaAutorTest {
    @javax.inject.Inject()
    public br.com.zup.endereco.EnderecoClient enderecoClient;
    public br.com.zup.endereco.EnderecoResponse enderecoResponse;
    @io.micronaut.http.client.annotation.Client(value = "/")
    @javax.inject.Inject()
    public io.micronaut.http.client.HttpClient client;
    public br.com.zup.autores.NovoAutorRequest novoAutor;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.endereco.EnderecoClient getEnderecoClient() {
        return null;
    }
    
    public final void setEnderecoClient(@org.jetbrains.annotations.NotNull()
    br.com.zup.endereco.EnderecoClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.endereco.EnderecoResponse getEnderecoResponse() {
        return null;
    }
    
    public final void setEnderecoResponse(@org.jetbrains.annotations.NotNull()
    br.com.zup.endereco.EnderecoResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.micronaut.http.client.HttpClient getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    io.micronaut.http.client.HttpClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.autores.NovoAutorRequest getNovoAutor() {
        return null;
    }
    
    public final void setNovoAutor(@org.jetbrains.annotations.NotNull()
    br.com.zup.autores.NovoAutorRequest p0) {
    }
    
    @org.junit.jupiter.api.BeforeEach()
    public final void setUp() {
    }
    
    @org.junit.jupiter.api.AfterEach()
    public final void tearDown() {
    }
    
    public CriaAutorTest() {
        super();
    }
}