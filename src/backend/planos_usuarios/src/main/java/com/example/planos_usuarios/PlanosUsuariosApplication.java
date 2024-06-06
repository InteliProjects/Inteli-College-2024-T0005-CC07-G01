package com.example.planos_usuarios;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlanosUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanosUsuariosApplication.class, args);
	}

	/**
     * The port on which the server is running.
     */
	@Value("${server.port}")
	private int port;

}
