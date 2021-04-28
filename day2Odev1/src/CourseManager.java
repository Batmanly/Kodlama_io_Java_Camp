public class CourseManager {
    public void showScreen(Course course) {
        System.out.println(course.kursAdi + " : " + course.egitment + " : " + course.videoUrl);
    }
    int saat = 0;
    public void yoklamaAl(Course course) {
        if(course.saat > 21 && course.saat < 24){
            System.out.println("yoklama alindi");
        }else {
            System.out.println("Yoklama Vakti Gecit");
        }
    }
}
