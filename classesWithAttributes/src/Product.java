public class Product {

    public Product(int id,String name,String description,double price,int stocAmount,String renk){
        System.out.println("Yapici method Calisr");
        this.id = id;
        this.renk = renk;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stocAmount = stocAmount;
    }
    public Product(){

    }

    //Attribute && Field
    private int id; // urunu tanimlayan essiz degerdir.
    private String name;
    private String description;
    private double price;
    private int stocAmount;
    private String renk;
    private String kod;

    //getter
    public int getId(){//burada baska islerde yapilabilir o yuzden onemli..bu  sadece id okuyabilir demek yazamaz.
        return id;
    }
    //setter
    public void setId(int id){//set edilen deger parametre olarak verilmeli //this bu class demek..
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStocAmount() {
        return stocAmount;
    }

    public void setStocAmount(int stocAmount) {
        this.stocAmount = stocAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + this.id;
    }

}
