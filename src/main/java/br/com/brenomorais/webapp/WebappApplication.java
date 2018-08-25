package br.com.brenomorais.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class WebappApplication {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebappApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);

		System.out.println("..................");
		System.out.println(":: WebApp Start ::");
		System.out.println("..................");
	}

}
