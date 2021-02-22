package com.example.bookstore.Brcko.repository;

import com.example.bookstore.Brcko.domain.BookToCartItem;
import com.example.bookstore.Brcko.domain.CartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BookToCartItemRepository extends CrudRepository<BookToCartItem,Long> {
  void deleteByCartItem(CartItem cartItem);
}
