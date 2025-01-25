package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@OpenAPIDefinition(info = @Info(title = "Farmatodo API", version = "1.0", description = "API para gestión de usuarios y tickets"), security = @SecurityRequirement(name = "bearerAuth"))
//@SecurityScheme(name = "bearerAuth", scheme = "bearer", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class PruebaDoubleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaDoubleApplication.class, args);
	}

}
