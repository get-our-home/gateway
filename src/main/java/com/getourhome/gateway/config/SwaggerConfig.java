package com.getourhome.gateway.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi userServiceApi() {
        return GroupedOpenApi.builder()
                .group("users")
                .pathsToMatch("/api/users/**")
                .build();
    }

    @Bean
    public GroupedOpenApi agentServiceApi() {
        return GroupedOpenApi.builder()
                .group("agents")
                .pathsToMatch("/api/agents/**")
                .build();
    }

    @Bean
    public GroupedOpenApi propertyServiceApi() {
        return GroupedOpenApi.builder()
                .group("properties")
                .pathsToMatch("/api/properties/**")
                .build();
    }
}

