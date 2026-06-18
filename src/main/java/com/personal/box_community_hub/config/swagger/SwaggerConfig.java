package com.personal.box_community_hub.config.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Value("${server.port}")
    private String port;

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("BoxCommunity Hub API")
                        .version("1.0")
                        .description("API para gestión de CrossFit boxes")
                        .contact(new Contact()
                                .name("Carlos Jesús Pérez Márquez")
                                .email("carlos@prueba.com")
                                .url("http://localhost:" + port + "/swagger-ui/index.html#/")));
    }
}
