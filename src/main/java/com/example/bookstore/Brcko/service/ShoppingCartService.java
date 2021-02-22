package com.example.bookstore.Brcko.service;


import com.example.bookstore.Brcko.domain.ShoppingCart;

public interface ShoppingCartService {
	ShoppingCart updateShoppingCart(ShoppingCart shoppingCart);

	void clearShoppingCart(ShoppingCart shoppingCart);
}
