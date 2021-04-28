public class Main {

    public static void main(String[] args) {
	// write your code here
       /* OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        System.out.println(ogretmenKrediManager.hesapla(1000));
        */
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgretmenKrediManager(),new TarimKrediManager(),new OgrencKrediManager()};

        for(BaseKrediManager  kredi : krediManagers){
            System.out.println(kredi.hesapla(1000));
        }
    }
}
