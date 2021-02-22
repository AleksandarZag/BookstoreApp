package com.example.bookstore.Brcko.service;

import com.example.bookstore.Brcko.domain.Payment;
import com.example.bookstore.Brcko.domain.UserPayment;

public interface PaymentService {
    Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
