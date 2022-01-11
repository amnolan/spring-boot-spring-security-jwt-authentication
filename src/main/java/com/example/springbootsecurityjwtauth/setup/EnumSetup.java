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

    public void run(ApplicationArguments args) {
        if(roleRepository.countRoles()==0){
            roleRepository.save(new Role(ERole.ROLE_USER));
            roleRepository.save(new Role(ERole.ROLE_ADMIN));
            roleRepository.save(new Role(ERole.ROLE_MODERATOR));
        }
    }

}
