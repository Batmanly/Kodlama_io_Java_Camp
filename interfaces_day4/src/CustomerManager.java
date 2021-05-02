import javax.xml.crypto.Data;

public class CustomerManager {
    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    private Logger[] loggers;
    //loosly - tightly couples(gevsek-kati bagli)
    public void add(Customer customer){
        System.out.println("Musteri eklendi " + customer.getName());
        Utils.runLoggers(loggers,customer.getName());
    }
    public void delete(Customer customer){
        System.out.println("Musteri silindi " + customer.getName());
        Utils.runLoggers(loggers,customer.getName());

    }

}
