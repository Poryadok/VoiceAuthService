package com.poryadok.VoiceAuthService.service;

import com.poryadok.VoiceAuthService.models.Role;
import com.poryadok.VoiceAuthService.repository.RoleRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @PostConstruct
    public void init() {
        System.out.println("Initializing roles...");
        // Проверка, существуют ли роли, и создание, если нет
        if (roleRepository.count() == 0) {
            Role adminRole = new Role();
            adminRole.setName("ADMIN");

            Role userRole = new Role();
            userRole.setName("USER");

            roleRepository.saveAll(Arrays.asList(adminRole, userRole));
        }
    }
}