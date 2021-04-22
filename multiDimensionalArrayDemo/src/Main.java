public class Main {

    public static void main(String[] args) {
	// write your code here
        String[][] sehirler = new String[3][3];
        sehirler[0][0] ="Istanbul";
        sehirler[1][0] = "Batman";
        sehirler[2][0] = " Telegram";
        sehirler[0][1] = "konya";
        sehirler[1][1] = "batman";
        sehirler[2][1] = "whatsapp";
        sehirler[0][2] = "batman 2";
        sehirler[1][2] = "ankara";
        sehirler[2][2] = "konya2";

        for (int i = 0; i <=2;i++)
        {
            for (int j = 0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
