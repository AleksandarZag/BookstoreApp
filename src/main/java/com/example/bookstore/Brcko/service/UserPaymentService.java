package com.example.bookstore.Brcko.service;


import com.example.bookstore.Brcko.domain.UserPayment;

public interface UserPaymentService {
	UserPayment findById(Long id);
	
	void removeById(Long id);
}
