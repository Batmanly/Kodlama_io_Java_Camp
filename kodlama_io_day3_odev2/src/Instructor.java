public class Instructor extends User{
    private String programming_language_teaching;
    private int courseCount;

    public String getProgramming_language_teaching() {
        return programming_language_teaching;
    }

    public void setProgramming_language_teaching(String programming_language_teaching) {
        this.programming_language_teaching = programming_language_teaching;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public void setCourseCount(int courseCount) {
        this.courseCount = courseCount;
    }

    public Instructor(String programming_language_teaching, int courseCount,int id,String name,String surname,String telephone,String city) {
        this.programming_language_teaching = programming_language_teaching;
        this.courseCount = courseCount;
        this.setCity(city);
        this.setId(id);
        this.setName(name);
        this.setSurname(surname);
        this.setTelephone(telephone);

    }
}
