package com.shiblee.demoswagger;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@OpenAPIDefinition(
		info = @Info(
				title = "This is the end"
		)

)

@SpringBootApplication
public class DemoSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSwaggerApplication.class, args);
	}

}
