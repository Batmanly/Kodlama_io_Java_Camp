public class Main {

    public static void main(String[] args) {
	// write your code here
        Instructor instructor = new Instructor("C#",4,321,"Test233","test","43242342","Batman");
        Student student = new Student(4,5,10,11,"Recep","Test2","f31231231232","Batman2");

        InstuctorManager instructorManager = new InstuctorManager();
        StudentManager studentManager = new StudentManager();

        studentManager.login(student);
        instructorManager.login(instructor);

        studentManager.buyCourse(student);
        instructorManager.addCourse(instructor);
    }
}
