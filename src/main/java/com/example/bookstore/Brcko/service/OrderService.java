package com.example.bookstore.Brcko.service;

import com.example.bookstore.Brcko.domain.*;

public interface OrderService {
    Order createOrder(ShoppingCart shoppingCart,
                          ShippingAddress shippingAddress,
                          BillingAddress billingAddress,
                          Payment payment,
                      String shippingMethod,
                      User user);

    Order findOne(Long id);
}
