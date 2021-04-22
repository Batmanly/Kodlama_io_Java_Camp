public class Main {

    public static void main(String[] args) {
	// write your code here
        //6 --> 1,2,3
        //28 --> 1,2,3,4,5,6
        int number = 5;
        int total =0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                total +=i;
            }
        }
        if(total == number){

            System.out.println("Mukemmel Sayidir");
        }else
            System.out.println("Mukemmel sayi degildir");
    }
}
