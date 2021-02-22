package com.example.bookstore.Brcko.service;

import com.example.bookstore.Brcko.domain.ShippingAddress;
import com.example.bookstore.Brcko.domain.UserShipping;

public interface ShippingAddressService {
    ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
