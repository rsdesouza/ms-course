package com.desuperior.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.desuperior.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	public Payment getPayment(long workerId, int days) {
		return new Payment ("Rodolfo", 900.0, days);
	}

}
