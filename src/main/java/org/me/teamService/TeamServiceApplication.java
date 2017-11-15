package org.me.teamService;

import org.me.teamService.model.User;
import org.me.teamService.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class TeamServiceApplication {

	@Autowired
	private UserRepo userRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(TeamServiceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner init() {
		return args -> userRepo.save(new User("fname", "lname"));
	}
}
