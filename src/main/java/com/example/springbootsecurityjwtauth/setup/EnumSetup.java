package com.example.springbootsecurityjwtauth.setup;

import com.example.springbootsecurityjwtauth.models.ERole;
import com.example.springbootsecurityjwtauth.models.Role;
import com.example.springbootsecurityjwtauth.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class EnumSetup implements ApplicationRunner {

    private final RoleRepository roleRepository;

    @Autowired
    public EnumSetup(RoleRepository roleRepository){
        this.roleRepository = roleRepository;

    }

    public void run(ApplicationArguments args) throws IOException {
        Role userRole = new Role(ERole.ROLE_USER);
        Role adminRole = new Role(ERole.ROLE_ADMIN);
        Role moderatorRole = new Role(ERole.ROLE_MODERATOR);
        roleRepository.save(userRole);
        roleRepository.save(adminRole);
        roleRepository.save(moderatorRole);
    }

}
