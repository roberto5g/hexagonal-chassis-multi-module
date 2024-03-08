package com.robertogs.mystaks.boardservice.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoardServiceApplication {

	public static void main(String[] args) {
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
