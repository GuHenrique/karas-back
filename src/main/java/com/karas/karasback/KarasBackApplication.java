package com.karas.karasback;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.karas.karasback.model.Cargo;
import com.karas.karasback.model.Colaborador;
import com.karas.karasback.model.Empresa;
import com.karas.karasback.repository.CargoRepository;
import com.karas.karasback.repository.ColaboradorRepository;
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
			e.setCnpj("20851226000103");
			empresaRepository.save((e));

		};
	}

	@Bean
	CommandLineRunner initDataBase(CargoRepository cargoRepository, ColaboradorRepository colaboradorRepository) {
		return args -> {
			cargoRepository.deleteAll();
			Cargo c = new Cargo();
			c.setDescricao("Vendedor");
			c.setEmpresa("Aramis Center Vale");
			c.setSalario(1500.20);
			cargoRepository.save((c));
			colaboradorRepository.deleteAll();
			Colaborador co = new Colaborador();
			co.setNome("João da Siva");
			co.setCargo("Vedendor");
			co.setEmpresa("Aramis Center Vale");
			co.setSalario(1500.20);
			colaboradorRepository.save((co));

		};

	}

}
