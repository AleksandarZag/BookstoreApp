package com.example.bookstore.Brcko.repository;

import com.example.bookstore.Brcko.domain.CartItem;
import com.example.bookstore.Brcko.domain.Order;
import com.example.bookstore.Brcko.domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Long>{
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

	List<CartItem> findByOrder(Order order);

}
