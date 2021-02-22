package com.example.bookstore.Brcko.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.bookstore.Brcko.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByName(String name);
}
