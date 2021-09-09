package br.com.curitiba.fincar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.*;

@SpringBootApplication
public class FincarApplication {

	public static void main(String[] args) {

		SpringApplication.run(FincarApplication.class, args);
		out.println("Hello Amábilie, linda, desenvolvedora foda!");
	}
}