public class Main {

    public static void main(String[] args) {
	    // write your code here
        //For
        for (int i = 0; i <10;i++)
        {
            System.out.println(i);
        }
        System.out.println("Dongu Bitti");

        int i =0;
        while(i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("Bitti");
        //infinite loop > Sonsuz dongu...

        //Do While > Sart saglanmasa bile bir defa donguye girer.
        i=0;
        do {
            System.out.println(i);
            i+=2;
        }while(i<10);
    }
}
