package com.example.demo.swagger ;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration

@OpenAPIDefinition(
        info = @Info(
                title = "Projeto Validade",
                description = "Projeto para validação de datas de validade para lojas",
                contact = @Contact(
                        name = "Pedro Ranéa",
                        url = "https://github.com/pedroraneafreitas",
                        email = "pedro.freitas@sptech.school"
                ),
                license = @License(name = "Swagger Validade"),
                version = "1.0.0"
        )
)

public class OpenApiConfig {

}