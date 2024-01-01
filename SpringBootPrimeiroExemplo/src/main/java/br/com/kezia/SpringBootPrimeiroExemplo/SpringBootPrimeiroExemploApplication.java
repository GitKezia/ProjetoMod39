package br.com.kezia.SpringBootPrimeiroExemplo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.kezia.domain.Cliente;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.kezia.repository")
@EntityScan("br.com.kezia.*")  
@ComponentScan(basePackages = "br.com.kezia")
public class SpringBootPrimeiroExemploApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPrimeiroExemploApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");
		Cliente cliente = createCliente();
		repository.save(cliente);
		
	}

}
