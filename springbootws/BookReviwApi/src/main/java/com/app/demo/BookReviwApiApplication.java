package com.app.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BookReviwApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookReviwApiApplication.class, args);
	}
	List<VendorExtension> vendorExtensions = new ArrayList<VendorExtension>();
	Contact contact = new Contact("Abhijeet", "https://testyantra.com", "abhias119999977@gmail.com");

	ApiInfo apiInfo = new ApiInfo("Movie Review API",
			"API's to to save movie reviews and get the data form the database as per user request", "Snapshoot 0.0.1",
			"https//testyantragobal.com", contact, "www.ty.com", "Terms and condition", vendorExtensions);

	@Bean
	public Docket myDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.app.demo"))
				.build().apiInfo(apiInfo);

	}

}
