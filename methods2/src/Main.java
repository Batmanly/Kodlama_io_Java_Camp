public class Main {

    public static void main(String[] args) {
	// write your code here
        ekle();
        sil();
        guncelle();
        String mesaj = "Bugun hava cok guzel";
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int sayi = topla(5,7);
        String sehir = sehirVer();
        System.out.println(sayi + " " + sehir);
        int toplam = topla2(3,5,6,7,8,9,9);
        System.out.println(toplam);
    }
    public static void ekle(){
        System.out.println("Eklendi");

    }
    public static void sil(){
        System.out.println("Silindi");
    }
    // Void Operations >> verilen operasyonlari yaparlar , deger dondurmezler..
    public static void guncelle(){
        System.out.println("guncellendi");

    }
    public static int topla(int sayi1,int sayi2){
        return sayi1 + sayi2;
    }
    public static String sehirVer(){
        return "Ankara";
    }
    public static int topla2(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam += sayi;
        }
        return toplam;
    }
}
