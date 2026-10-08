package br.com.senai.infob.backend.projeto_mercado.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Supermercado Souza API",
        version = "1.0",
        description = "API para teste das requisições do Supermercado Souza"
    )
)
public class Swagger {

}