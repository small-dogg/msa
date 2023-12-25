package com.smalldogg.presentation.controller;

import com.smalldogg.application.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("/api/v1/payment")
public class PaymentController {

    private final PaymentService paymentService;
}
