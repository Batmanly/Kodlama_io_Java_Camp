public class Main {

    public static void main(String[] args) {

        //Verilerin Turu
        Product product1 = new Product(1,"Lenovo 18",1500,"16 GB Ram",10); // ornek olustmar - instance , referans olusturmak ,class olusturmak

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Lenoveo 15");
        product2.setDetail("16 GB Ram");
        product2.setDiscount(10);
        product2.setUnitPrice(15000);
        System.out.println(product2.getUnitPriceAfterDiscount());
        Product product3 = new Product();

        /*Product[] products = new Product[]{product1, product2, product3, product4};//Product 1 procuts turunde oludugunden onu listeye ekledik..
        System.out.println(products.length);

        for (Product product : products) {//Dongude gezerken ayni tipi veriyoruz.. //Cogul kulaniyorsak dizi veya collection's tir.
            System.out.println(product.name);
        }

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Laptop";

        Category category3 = new Category();
        category3.id = 1;
        category3.name = "Araba";

        Category category2 = new Category();
        category2.id = 1;
        category2.name = "Bahce";


        ProductManager productManager = new ProductManager();
        productManager.addToCart(product4);//MNethod dataya ihtiyac duyuyrsa bunu parametre oalrak yollayabiliyoruz..
        productManager.addToCart(product2);//Producten bellek adresini yolluyoruz burda.
        productManager.addToCart(product3);
        productManager.addToCart(product1);*/

        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Icecek");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Yiyecek");


        System.out.println(category1.getName());
        System.out.println(category2.getName());

    }
}
