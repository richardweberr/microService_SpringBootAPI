package com.cars.api;

//import io.swagger.annotations.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@SwaggerDefinition(
////        info = @Info(
////                description = "demo for microServices on SpringBoot",
////                version = "V0.0.1",
////                title = "Title",
////                termsOfService = "noService",
////                contact = @Contact(
////                        name = "-",
////                        email = "-",
////                        url = "-"
////                ),
////                license = @License(
////                        name = "best",
////                        url = "-"
////                )
////        ),
////        consumes = {"application/json", "application/xml"},
////        produces = {"application/json", "application/xml"},
////        schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS},
////        tags = {
////                @Tag(name = "Private", description = "Tag used to denote operations as private")
////        },
////        externalDocs = @ExternalDocs(value = "Meteorology", url = "http://theweatherapi.io/meteorology.html")
////)

//http://localhost:8075/v2/api-docs
//http://localhost:8075/swagger-ui.html
@SpringBootApplication
@EnableSwagger2
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
