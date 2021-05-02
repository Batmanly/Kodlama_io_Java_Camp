public class Main {

    public static void main(String[] args) {
	// write your code here
        Logger[] loggers = new Logger[]{new SmsLogger(),new EmailLogger(),new DatabaseLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);
        Customer engin = new Customer(1,"engin","demorig");

        customerManager.add(engin);
    }
}
