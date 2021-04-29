public class CustomerManager {

    public void add(Logger logger){//Logger yerine digerleride gidilebilir , email,file,database logger.
        //musteri ekleme kodlari...
        System.out.println("Musteri eklendi");
        logger.log();
    }
}
