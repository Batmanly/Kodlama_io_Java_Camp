public class Main {

    public static void main(String[] args) {

        //Verilerin Turu
        Product product1 = new Product(); // ornek olustmar - instance , referans olusturmak ,class olusturmak
        product1.name = "Lenovo v156";
        product1.id = 1;
        product1.unitPrice = 50000;
        product1.detail = "16 GB Ram";

        Product product3 = new Product();
        product3.name = "Lenovo v13";
        product3.id = 1;
        product3.unitPrice = 50000;
        product3.detail = "16 GB Ram";

        Product product2 = new Product();
        product2.name = "Lenovo v12";
        product2.id = 1;
        product2.unitPrice = 50000;
        product2.detail = "16 GB Ram";
        Product product4 = new Product(3, "Lenovo 20GB", 400, "Guzel bilgisayar");

        Product[] products = new Product[]{product1, product2, product3, product4};//Product 1 procuts turunde oludugunden onu listeye ekledik..
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
        productManager.addToCart(product1);


    }
}
