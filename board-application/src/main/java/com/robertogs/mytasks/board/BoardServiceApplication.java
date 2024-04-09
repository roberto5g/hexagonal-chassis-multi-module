package com.robertogs.mytasks.board;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {
		"com.robertogs.mytasks.board"
})
public class BoardServiceApplication {

	public static void main(String[] args) {
		log.info("Starting the application");
		SpringApplication.run(BoardServiceApplication.class, args);
	}

	/*
	api controller chama um service em domain.
	esse service chama um usecase em domain
	esse use case chama uma interface provider(repository) no domain
	a implementação desse provider fica no repository
	a implementação faz a chamada a pi externa
	 */
}
