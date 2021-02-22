package com.example.bookstore.Brcko.service.impl;

import com.example.bookstore.Brcko.domain.ShippingAddress;
import com.example.bookstore.Brcko.domain.UserShipping;
import com.example.bookstore.Brcko.service.ShippingAddressService;
import org.springframework.stereotype.Service;

@Service
public class ShippingAddressServiceImpl implements ShippingAddressService {

   public ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress){
       shippingAddress.setShippingAddressName(userShipping.getUserShippingName());
       shippingAddress.setShippingAddressStreet(userShipping.getUserShippingStreet());
       shippingAddress.setShippingAddressCity(userShipping.getUserShippingCity());
       shippingAddress.setShippingAddressZipcode(userShipping.getUserShippingZipcode());


       return shippingAddress;


   }

}
