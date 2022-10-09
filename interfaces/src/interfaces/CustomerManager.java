package interfaces;

public class CustomerManager {
	// Loosely - tightly coupled

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müşteri eklendi: " + customer.getFirstName());
		
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}

	public void delete(Customer customer) {
		Utils.runLoggers(loggers, customer.getLastName());
	}
}
