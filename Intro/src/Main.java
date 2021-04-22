
public class Main {
	// Main Programin Calismaya baslangic Noktasi. >> Defaul degistirilebilir..
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//camelCase
		String internetSubeButonu = "String methodu >> camelCase";
		double dolarDun = 8.192;
		double dolarBugun = 8.192;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println("Merhaba");
		System.out.println(internetSubeButonu);
		System.out.println(dolarDun);
		System.out.println(vade);
		
		if(dolarDun<dolarBugun) {
			System.out.println("Dolar dustmu resmini goster");
		}
		else if(dolarDun==dolarBugun){
			System.out.println("dolar ayni resmini goster");
		}
		
		else {
			System.out.println("dolar yukseldi resmini goster");

		}
		
		String kredi1 = "Hizli kredi";
		String kredi2 = "Mutlu emekli kredi";
		String kredi3 = "Konut kredi1si";
		String kredi4 = "Cifti kredi";
		String kredi5 = "Msb Kredisi";
		String kredi6 = "Meb Kredisi";

		//Array >> Liste Tutucu
		String[] krediler = {"Hizli kredi","Mutlu emekli kredi","Konut Kredisi","Msb kredisi","Meb kredisi","Ciftci Kredisi"};

		// Foreach
		for(String kredi : krediler){
			System.out.println(kredi);
		}
		
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}

		//Value Type
		int sayi1 =10;
		int sayi2 = 20;
		sayi1 = sayi2;
		System.out.println(sayi1);
		
		//Reference Type
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = " anakara";
		String sehir2 = "Istanbul";
		sehir1 = sehir2;
		sehir2 = "izmir";
		System.out.println(sehir1);


	}

}
