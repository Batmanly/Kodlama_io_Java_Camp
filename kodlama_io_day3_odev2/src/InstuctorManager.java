public class InstuctorManager extends UserManager{
    public void addCourse(Instructor instructor){
        System.out.println("Kurs eklendi" + instructor.getName() + " " + instructor.getSurname());
    }

    public  void getMoney(Instructor instructor){
        System.out.println("Para cekildi");
    }
}
