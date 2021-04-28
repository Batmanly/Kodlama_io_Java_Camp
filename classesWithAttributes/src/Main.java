public class Main {

    public static void main(String[] args) {
	// write your code here
        Product product = new Product(1,"laptop","Asus",3000,2,"Siyah");

//        product.setName("Laptop");
//        product.setId(1);
//        product.setDescription("Asus Laptop");
//        product.setPrice(5000);
//        product.setStocAmount(3);

        //Gercek hayatta kullaniciya ekran veriyoruz , texbox vs gibi yerlerden bu degerleri aliyoruz...
        ProductManager productManager =  new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());




    }
}
