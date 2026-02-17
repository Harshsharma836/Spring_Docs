package com.example.demo.ControlBeanConfig;

import org.springframework.stereotype.Controller;

@Controller
public class RazorpayService implements PaymentService{
    @Override
    public String pay() {
        return "Hey from Razorpay";
    }
}
