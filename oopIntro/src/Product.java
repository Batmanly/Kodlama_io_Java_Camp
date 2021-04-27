public class Product {
    int id;
    String name;
    double unitPrice;
    String detail;
    Product(int id, String name, double unitPrice, String detail) {
        this();//Bu clasinin su anki orneginin parametresiz olanini calistir...
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        System.out.println("Conctructor Worked");
    }

    Product(){
        System.out.println("ilklendirildi");
    }


}
