package org.sid;

import org.sid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ProdactsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProdactsApplication.class, args);
	}
	@Bean
	CommandLineRunner start(RepositoryRestConfiguration restConfiguration) {
		
		return args ->{ restConfiguration.exposeIdsFor(Produit.class);};
	}
	

}
