package com.example.bookstore.Brcko.service;


import com.example.bookstore.Brcko.domain.UserShipping;

public interface UserShippingService {
	UserShipping findById(Long id);
	
	void removeById(Long id);
}
