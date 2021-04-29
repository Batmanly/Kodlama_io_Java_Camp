public class CustomerManager {
    public void add(Customer customer){ // extend ettigmiz icin , individual ve corporta customer yerine  kullanilabilir
        System.out.println(customer.customerNumber + " kayi edildi");
    }
    public void addMultiple(Customer[] customers){
        for(Customer customer : customers){
           add(customer);
        }
    }
}
