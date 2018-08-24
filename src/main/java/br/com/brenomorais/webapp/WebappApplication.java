package br.com.brenomorais.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
		System.out.println("..................");
		System.out.println(":: WebApp Start ::");
		System.out.println("..................");

	}
}
