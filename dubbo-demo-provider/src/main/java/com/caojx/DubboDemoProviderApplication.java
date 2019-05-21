package com.caojx;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:dubbo-demo-provider.xml")
@SpringBootApplication
public class DubboDemoProviderApplication implements CommandLineRunner {

	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(DubboDemoProviderApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.in.read();
	}


}
