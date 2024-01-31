package com.epam.task1.serviceImpl;

import com.epam.task1.entities.Payment;
import com.paypal.api.payments.*;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PaypalServiceImpl implements PaypalService{

    
    private final APIContext apiContext;

    public Payment createPayment(
            Double total, 
            String currency, 
            String method,
            String intent,
            String description, 
            String cancelUrl, 
            String successUrl) {
        //create Paypal payment and return...
    }

    public Payment executePayment(String paymentId, String payerId) throws PayPalRESTException{
        //execute Paypal payment and return...
    }
}