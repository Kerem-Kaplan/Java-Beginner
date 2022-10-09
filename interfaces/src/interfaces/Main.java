package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers= {new SmsLogger(),new DatabaseLogger(),new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);

		Customer kerem = new Customer(1, "Kerem", "Kaplan");
		customerManager.add(kerem);
		
	}

}
