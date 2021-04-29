public class UserManager {
    public void login(User user){
        System.out.println("Giris yapildi " + user.getName() + " " + user.getSurname());
    }

    public void exit(User user){
        System.out.println("Cikis yapildi " + user.getName() + " " + user.getSurname());
    }
}
