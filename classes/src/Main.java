public class Main {

    public static void main(String[] args) {
	// write your code here

        //reference type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2; //customer 2 nin refrence numarsini alir.

        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        int sayi1 =10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        //Referenci tuttugunudan , 10 gelir buda.
        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,55555,3};

        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
    }

}
