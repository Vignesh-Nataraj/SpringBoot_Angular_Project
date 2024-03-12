package com.vicky.spring.jpa.h2;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Tutorials App REST API Documentation",
				description = "Tutorials App REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Name to be provided",
						email = "Email to be provided",
						url = "https://email.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://email.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "Tutorials App REST API Documentation",
				url = "http://localhost:8095/swagger-ui/index.html"
		)
)
public class SpringBootJpaH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaH2Application.class, args);
	}

}
