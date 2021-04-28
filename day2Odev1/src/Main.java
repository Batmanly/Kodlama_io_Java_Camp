public class Main {

    public static void main(String[] args) {
        // write your code here
        Course course1 = new Course(22, "C#", "Engin", "http://youtube.com");
        Course course2 = new Course(11, "C#", "Engin", "http://youtube.com");
        Course course3 = new Course(13, "C#", "Engin", "http://youtube.com");
        Course course4 = new Course(22, "C#", "Engin", "http://youtube.com");
        Course[] courses = new Course[]{course1, course2, course3, course4};

        CourseManager courseManager = new CourseManager();

        for (Course c : courses) {
            courseManager.showScreen(c);
            courseManager.yoklamaAl(c);
        }
    }
}
