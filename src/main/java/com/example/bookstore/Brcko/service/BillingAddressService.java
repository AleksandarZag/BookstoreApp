package com.example.bookstore.Brcko.service;

import com.example.bookstore.Brcko.domain.BillingAddress;
import com.example.bookstore.Brcko.domain.UserBilling;

public interface BillingAddressService {
    BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
