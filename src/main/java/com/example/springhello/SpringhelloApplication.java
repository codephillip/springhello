package com.example.springhello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
@ConfigurationPropertiesScan
//@RestController
public class SpringhelloApplication {
    private static final Logger log = LoggerFactory.getLogger(SpringhelloApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringhelloApplication.class);
    }

    @Bean
    @ConfigurationProperties(prefix = "droid")
    Droid createDroid() {
        return new Droid();
    }
//	@GetMapping("/hello")
//	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
//		return String.format("Helloevery %s!", name);
//	}

//	@Bean
//	public CommandLineRunner consoleCommands(CustomerRepository repository) {
//		return args -> {
//			log.debug("add customers");
//			repository.save(new Customer("John", "Jona"));
//			repository.save(new Customer("Mary", "Joker"));
//			repository.save(new Customer("Joana", "Joker"));
//
//			log.debug("get all customers");
//			for (Customer customer : repository.findAll()) {
//				log.debug(customer.toString());
//			}
//
//			log.debug("find by id");
//
//			Customer customer = repository.findById(1L);
//			log.debug(customer.toString());
//
//
//			repository.findByLastName("Joker").forEach(customer1 -> {
//				log.debug(customer1.toString());
//			});
//		};
//
//	}
}