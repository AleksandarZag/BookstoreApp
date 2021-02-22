package com.example.bookstore.Brcko.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.bookstore.Brcko.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);

	User findByEmail(String email);
}
