public class CustomerManager {
    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {//Bunu newleyince bize base logger verecek , buraya tum logger leri parametre olarak verebiliriz..
        this.baseLogger = baseLogger;
    }

    public void Add() {
        System.out.println("Musteri eklendi");
        this.baseLogger.log(" loglandi");


    }
}
