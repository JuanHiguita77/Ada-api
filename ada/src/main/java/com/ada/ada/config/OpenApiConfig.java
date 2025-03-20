package com.ada.ada.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

//Notacion para darle configs a los beans
@Configuration
//Config inicial de swagger
@OpenAPIDefinition(
    info = @Info(title = "API Companies creation",
                version = "1.0",
                description = "Api Created for online Companies Administrator using Java + SpringBoot and JPA With DTO MapStruct")
)
public class OpenApiConfig 
{
    //Ruta: /api/swagger-ui/index.html   
}
