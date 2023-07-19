package br.com.guigb9.hyperxpressconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HyperxpressConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyperxpressConfigServerApplication.class, args);
	}

}
