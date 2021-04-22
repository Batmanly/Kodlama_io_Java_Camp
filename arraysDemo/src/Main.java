public class Main {

    public static void main(String[] args) {
	// write your code here
        String ogrenci1 = "engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------------------------------");
        // Diziler Bize genel olarak ayni tipteki degerli tutar.

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Demorig";
        ogrenciler[2] = "Mehmet";
        ogrenciler[3] = "Derin";

        for (int i = 0; i <ogrenciler.length; i++)
        {
            System.out.println(ogrenciler[i]);
        }

        for (String ogreci : ogrenciler){
           System.out.println(ogreci);
        }
    }
}
