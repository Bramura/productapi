package com.bramura.productapi.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()

                .info(new Info()
                        .title("Product API")
                        .description("API REST para gerenciamento de produtos")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Brayan")
                                .email("miyamurabrayan@gmail.com")))

                .externalDocs(new ExternalDocumentation()
                        .description("GitHub do Projeto"));
    }
}