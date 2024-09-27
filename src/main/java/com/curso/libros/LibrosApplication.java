package com.curso.libros;

import com.curso.libros.vista.LibroForm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;

@SpringBootApplication
public class LibrosApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contextSpring = new SpringApplicationBuilder(LibrosApplication.class)
				.headless(false)
				.web(WebApplicationType.NONE)
				.run(args);
		EventQueue.invokeLater(()->{
			LibroForm libroForm = contextSpring.getBean(LibroForm.class);
			libroForm.setVisible(true);
		});
	}

}
