package br.com.zup.validacaocustomizada;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0017\u00a8\u0006\u0007"}, d2 = {"Lbr/com/zup/validacaocustomizada/Controller;", "", "()V", "cadastrar", "Lio/micronaut/http/HttpResponse;", "carroRequest", "Lbr/com/zup/validacaocustomizada/CarroRequest;", "nossa-casa-codigo"})
@io.micronaut.validation.Validated()
@io.micronaut.http.annotation.Controller(value = "/carros")
public class Controller {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post()
    public io.micronaut.http.HttpResponse<java.lang.Object> cadastrar(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    @javax.validation.Valid()
    br.com.zup.validacaocustomizada.CarroRequest carroRequest) {
        return null;
    }
    
    public Controller() {
        super();
    }
}