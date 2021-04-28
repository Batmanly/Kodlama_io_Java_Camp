public class Main {

    public static void main(String[] args) {
        // write your code here
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();

    }

    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1, 2, 3, 4, 6};//[] sinir kosullari , {} sayilar degerler yazilir..
        int aranacak = 5;
        boolean varmi = false;
        for (int i = 0; i < sayilar.length; i++) {
            if (aranacak == sayilar[i])
                varmi = true;
        }
        if (varmi) {
            mesajVer("Sayi mevcuttur: " + aranacak);
        } else
            mesajVer("Sayi mevcut Degildir : " + aranacak);

    }

    public static void mesajVer(String aranacak){
        System.out.println("Sayi mevcuttur: " + aranacak);
    }
}
