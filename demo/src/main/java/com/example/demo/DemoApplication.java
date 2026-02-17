package com.example.demo;

import com.example.demo.ControlBeanConfig.PaymentService;
import com.example.demo.ControlBeanConfig.RazorpayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	private PaymentService paymentService;

	public DemoApplication(PaymentService paymentService){
		this.paymentService = paymentService;
	}

	// field enjection
	@Autowired
	HelloWorld printName;

// Two ways to Inject the DI

//  Contructor DI
//	DemoApplication(HelloWorld hello){
//		this.printName = hello;
//	}

//	@Override
	public void run(String... args) throws Exception {
		printName.printName();
	}
}
