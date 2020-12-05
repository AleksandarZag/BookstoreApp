package com.example.bookstore.Brcko;



import com.example.bookstore.Brcko.domain.User;
import com.example.bookstore.Brcko.domain.security.Role;
import com.example.bookstore.Brcko.domain.security.UserRole;
import com.example.bookstore.Brcko.service.impl.UserService;
import com.example.bookstore.Brcko.utility.SecurityUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BookstoreBrckoApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreBrckoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("Aleksandar");
		user1.setLastName("Zaganovic");
		user1.setUsername("a");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		user1.setEmail("aleksandarzaganovic5@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));
		userService.createUser(user1, userRoles);
	}

}
