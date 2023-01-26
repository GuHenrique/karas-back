package com.karas.karasback;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.karas.karasback.model.Empresa;
import com.karas.karasback.repository.EmpresaRepository;

@SpringBootApplication
public class KarasBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarasBackApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(EmpresaRepository empresaRepository) {
		return args -> {
			empresaRepository.deleteAll();
			Empresa e = new Empresa();
			e.setRazaoSocial("Cara de Formiga");
			e.setNomeFantasia("Aramis Center Vale");
			e.setCnpj("123489273829");
			empresaRepository.save((e));
		};
	}

}
