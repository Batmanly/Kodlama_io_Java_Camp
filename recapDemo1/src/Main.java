public class Main {

    public static void main(String[] args) {
	// write your code here
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;
        int enbuyuk = sayi1;

        if(enbuyuk < sayi2){
            enbuyuk = sayi2;
        }else if (enbuyuk < sayi3){
            enbuyuk = sayi3;
        }
        System.out.println(enbuyuk);

    }
}
