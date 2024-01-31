package com.epam.task1.services;

import com.epam.task1.entities.Payment;

public interface PaypalService {
	Payment executePayment(String paymentId, String payerId);
}
