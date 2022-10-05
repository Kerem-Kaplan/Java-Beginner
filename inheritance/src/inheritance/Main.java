package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer kerem = new IndividualCustomer();
		kerem.customerNumber = "12345";

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.customerNumber = "67890";

		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "9999";

		CustomerManager customerManager = new CustomerManager();
		Customer[] customers = { kerem, abc, corporateCustomer };
		customerManager.addMultiplr(customers);
	}

}
