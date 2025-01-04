package com.rv.microservices.order.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI orderServiceAPI() {
        return new OpenAPI()
                .info(new io.swagger.v3.oas.models.info.Info()
                    .title("Order Service API")
                    .description("Order Service API for managing orders")
                    .version("v1.0")
                    .termsOfService("http://swagger.io/terms/")
                    .license(new io.swagger.v3.oas.models.info.License()
                            .name("Apache 2.0")
                            .url("http://springdoc.org")
                    )
                );
    }
}
