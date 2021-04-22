public class Main {

    public static void main(String[] args) {
        // write your code here
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mukemmel : Gectiniz ");
                break;
            case 'B':
                System.out.println("Normal gectiniz");
                break;
            case 'F':
                System.out.println("Malesef kaldiniz");
                break;
            default:
                System.out.println("Gecersiz Not giriniz");
        }


    }
}
