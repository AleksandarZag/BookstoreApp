package com.example.bookstore.Brcko.service.impl;

import com.example.bookstore.Brcko.domain.UserPayment;
import com.example.bookstore.Brcko.repository.UserPaymentRepository;
import com.example.bookstore.Brcko.service.UserPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserPaymentServiceImpl implements UserPaymentService {

    @Autowired
    private UserPaymentRepository userPaymentRepository;

    public UserPayment findById(Long id) {
        return userPaymentRepository.findById(id).get();
    }

    public void removeById(Long id) {
        userPaymentRepository.deleteById(id);
    }
}

