For gradle : .\gradlew.bat bootRun
For Maven : .\mvnw spring-boot:run
For cleaner :  .\mvnw.cmd spring-boot:run


// Two ways to Inject the DI

//  Contructor DI:

	DemoApplication(HelloWorld hello){
		this.printName = hello;
	}


// field enjection:

@Autowired
HelloWorld printName;




| Constructor Injection        | Field Injection               |
| ---------------------------- | ----------------------------- |
| Injected through constructor | Injected directly into field  |
| Dependency is required       | Can be optional               |
| Immutable (can use `final`)  | Not immutable                 |
| Easy to unit test            | Harder to test                |
| Recommended                  | Not recommended in production |


/*

Using Autowired DI

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    @Qualifier("razorpayService")
    private PaymentService paymentService;

    @Autowired
    private HelloWorld printName;

    @Override
    public void run(String... args) {
        printName.printName();
        System.out.println(paymentService.pay());
    }
}

*/



/*

Using Contructor DI

private final PaymentService paymentService;
private final HelloWorld printName;

public DemoApplication(
        @Qualifier("razorpayService") PaymentService paymentService,
        HelloWorld printName) {

    this.paymentService = paymentService;
    this.printName = printName;
}

*/