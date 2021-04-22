public class Main {

    public static void main(String[] args) {
	// write your code here
        String mesaj = "  Bugun hava cok guzel";
        System.out.println(mesaj);
/*
        System.out.println("Eleman Sayisi : " +mesaj.length() );//length eleman sayisini veriri.
        System.out.println("5. eleman :" + mesaj.charAt(4));//4.indexteki 5.elemani getir
        System.out.println(mesaj.concat(" Yasasin"));//birlesitiriyor sonra kullanmak istersek atama yapmaliyiz..
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("B"));//B ile basliyorsa True baslamiyorsa False doner.
        System.out.println(mesaj.endsWith("."));//false yada true doner.. java case sensetive bir dildir..
        char[] karakterler = new char[5];
        mesaj.getChars(0,4,karakterler,0);//karakterlere ata 0 dan itibaren ata , diger dizinin 5 karakterini getir 0 dan 5 e kadar.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));//mesajin kacinci index oldugunu  bize doner
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf('e'));//aramaya sondan baslsar*/

        System.out.println(mesaj.replace("a","b"));//ilgili metindeki krk leri vs degistirmeye yarar
        System.out.println(mesaj);
        System.out.println(mesaj.substring(2));//belli bir indkten sonra alir , return oalrak esitlersek ayni degeri alabilriz..
        System.out.println(mesaj);
        System.out.println(mesaj.substring(2,5));
        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.split(" "));//belli bir krk veya krk dizinine gore parcalar
        System.out.println(mesaj.toLowerCase());//kucuk harfe cevirir.
        System.out.println(mesaj.toUpperCase());//buyuk harfe cevirir
        System.out.println(mesaj.strip());
    }
}
