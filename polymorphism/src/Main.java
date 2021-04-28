public class Main {

    public static void main(String[] args) {
        // write your code here
        EmailLogger logger = new EmailLogger();
        logger.log("Loglandi");
        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log("Databse Loglandi");

        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
        for (BaseLogger logger1 : loggers) {
            logger1.log("log Mesaj");
        }
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.Add();
    }
}
