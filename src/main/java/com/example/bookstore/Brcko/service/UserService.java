package com.example.bookstore.Brcko.service;

import com.example.bookstore.Brcko.domain.User;
import com.example.bookstore.Brcko.domain.UserBilling;
import com.example.bookstore.Brcko.domain.UserPayment;
import com.example.bookstore.Brcko.domain.UserShipping;
import com.example.bookstore.Brcko.domain.security.PasswordResetToken;
import com.example.bookstore.Brcko.domain.security.UserRole;

import java.util.Set;



public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
	
	User findByUsername(String username);
	
	User findByEmail (String email);

	User findById(Long id);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
	
	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);
	
	void updateUserShipping(UserShipping userShipping, User user);
	
	void setUserDefaultPayment(Long userPaymentId, User user);
	
	void setUserDefaultShipping(Long userShippingId, User user);
}
