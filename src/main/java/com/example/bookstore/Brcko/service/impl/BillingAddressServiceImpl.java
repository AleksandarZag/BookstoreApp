package com.example.bookstore.Brcko.service.impl;

import com.example.bookstore.Brcko.domain.BillingAddress;
import com.example.bookstore.Brcko.domain.UserBilling;
import com.example.bookstore.Brcko.service.BillingAddressService;
import org.springframework.stereotype.Service;

@Service
public class BillingAddressServiceImpl implements BillingAddressService {

    public BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress) {

        billingAddress.setBillingAddressName(userBilling.getUserBillingName());
        billingAddress.setBillingAddressStreet(userBilling.getUserBillingStreet());
        billingAddress.setBillingAddressCity(userBilling.getUserBillingCity());
        billingAddress.setBillingAddressZipcode(userBilling.getUserBillingZipcode());

     return billingAddress;
    }

}
