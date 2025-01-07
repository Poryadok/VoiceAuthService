package com.poryadok.VoiceAuthService;

import com.poryadok.VoiceAuthService.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VoiceAuthServiceApplication implements CommandLineRunner {

	@Autowired
	RoleService roleService;

	public static void main(String[] args) {
		SpringApplication.run(VoiceAuthServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Вызовите метод инициализации ролей
		roleService.init();
	}
}
