package br.com.zup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/DeletarAutorController;", "", "autorRepository", "Lbr/com/zup/AutorRepository;", "(Lbr/com/zup/AutorRepository;)V", "getAutorRepository", "()Lbr/com/zup/AutorRepository;", "deleta", "Lio/micronaut/http/HttpResponse;", "id", "", "nossa-casa-codigo"})
@io.micronaut.http.annotation.Controller(value = "/deletaAutor/{id}")
public class DeletarAutorController {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.AutorRepository autorRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Delete()
    @javax.transaction.Transactional()
    public io.micronaut.http.HttpResponse<java.lang.Object> deleta(@io.micronaut.http.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zup.AutorRepository getAutorRepository() {
        return null;
    }
    
    public DeletarAutorController(@org.jetbrains.annotations.NotNull()
    br.com.zup.AutorRepository autorRepository) {
        super();
    }
}