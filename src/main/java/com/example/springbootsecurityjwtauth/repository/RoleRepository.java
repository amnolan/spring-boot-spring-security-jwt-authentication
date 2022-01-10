package com.example.springbootsecurityjwtauth.repository;

import com.example.springbootsecurityjwtauth.models.ERole;
import com.example.springbootsecurityjwtauth.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
