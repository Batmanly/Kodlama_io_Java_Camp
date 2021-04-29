public class Main {

    public static void main(String[] args) {
	// write your code here
        IndividualsCustomer individualsCustomer = new IndividualsCustomer();
        individualsCustomer.customerNumber = "12312";

        CorporateCustomer hepsiburada = new CorporateCustomer();
        hepsiburada.customerNumber = "21321";

        SendikaCustomer abc = new SendikaCustomer();
        abc.customerNumber = "321321";

        CustomerManager customerManager = new CustomerManager();
        customerManager.add(hepsiburada);
        customerManager.add(individualsCustomer);
        customerManager.add(abc);

        Customer[] customers = {individualsCustomer,abc,hepsiburada};
        customerManager.addMultiple(customers);

    }
}
