package dev.danvegaa.dccc;

import dev.danvegaa.dccc.model.Post;
import dev.danvegaa.dccc.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DcccApplication {

	public static void main(String[] args) {
		SpringApplication.run(DcccApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PostRepository posts){
		return args -> {
			// insert some data here
			posts.save(new Post(1,"Hello, World!","Welcome to my blog!"));
			posts.save(new Post(2,"Hello, JPA!","Intro to JPA"));
		};
	}

}
