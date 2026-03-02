package com.example.demo;

import com.example.demo.ControlBeanConfig.PaymentService;
import com.example.demo.ControlBeanConfig.RazorpayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	private PaymentService paymentService;

	public DemoApplication(@Qualifier("razorpayService") PaymentService paymentService){
		this.paymentService = paymentService;
	}





	// Two ways to Inject the DI : // field enjection AND Contructor DI

	// field enjection

	@Autowired
	HelloWorld printName;

	@Override
	public void run(String... args) throws Exception {
		printName.printName();
		System.out.println(paymentService.pay());
	}


	//  Contructor DI

	//	DemoApplication(HelloWorld hello){
	//		this.printName = hello;
	//	}ef

	// Instead of mixing constructor + field injection, do this:

	/*ApplicationContext
		private final PaymentService paymentService;
		private final HelloWorld printName;

		public DemoApplication(
				@Qualifier("razorpayService") PaymentService paymentService,
				HelloWorld printName) {

			this.paymentService = paymentService;
			this.printName = printName;
		}
	*/
}
