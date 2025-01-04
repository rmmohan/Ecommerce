package com.rv.microservices.product.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI productServiceAPI() {
        return new OpenAPI()
                .info(new io.swagger.v3.oas.models.info.Info()
                    .title("Product Service API")
                    .description("Product Service API for managing products")
                    .version("v1.0")
                    .termsOfService("http://swagger.io/terms/")
                    .license(new io.swagger.v3.oas.models.info.License()
                            .name("Apache 2.0")
                            .url("http://springdoc.org")
                    )
                );
    }
}
