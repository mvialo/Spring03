package com.wildcodeschool.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChallengeApplication {

	@Autowired
	public void ChallengeApplication(FilmRepository filmRepository) {
		this.repository = filmRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);

	}

	private FilmRepository repository;

	@Bean
	public CommandLineRunner demo() {
		return (args) -> {
			Film filmIndiana = new Film("Indiana Jones", "Harrison Ford", "2023-06-14");
			Film deadPool = new Film("DeadPool", "Ryan Reynolds", "2018-02-14");
			Film logan = new Film("Logan", "Hugh Jackman", "2017-05-19");
			repository.save(filmIndiana);
			repository.save(deadPool);
			repository.save(logan);
		};
	}

}
