package com.poryadok.VoiceAuthService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.poryadok.VoiceAuthService.service.RoleService;

@SpringBootTest
public class ApplicationTests {

    @Autowired
    private RoleService roleService;

    @Test
    public void testInitRoles() {
        roleService.init();
    }
}