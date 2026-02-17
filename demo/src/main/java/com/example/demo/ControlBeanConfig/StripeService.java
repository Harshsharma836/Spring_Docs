package com.example.demo.ControlBeanConfig;

import org.springframework.stereotype.Controller;

@Controller
public class StripeService implements PaymentService{
    @Override
    public String pay() {
        return "Hello from Stripe";
    }
}
