package com.example.bookstore.Brcko.service.impl;

import com.example.bookstore.Brcko.domain.UserShipping;
import com.example.bookstore.Brcko.repository.UserShippingRepository;
import com.example.bookstore.Brcko.service.UserShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserShippingServiceImpl implements UserShippingService {

    @Autowired
    private UserShippingRepository userShippingRepository;

    public UserShipping findById(Long id) {
        return userShippingRepository.findById(id).get();
    }

    public void removeById(Long id) {
        userShippingRepository.deleteById(id);
    }
}
