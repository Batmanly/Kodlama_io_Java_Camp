public class Student extends User{
    private int ownedCourse;
    private int collectionCount;

    public int getOwnedCourse() {
        return ownedCourse;
    }

    public void setOwnedCourse(int ownedCourse) {
        this.ownedCourse = ownedCourse;
    }

    public int getCollectionCount() {
        return collectionCount;
    }

    public void setCollectionCount(int collectionCount) {
        this.collectionCount = collectionCount;
    }

    public Student(int ownedCourse, int  collectionCount,int courseCount,int id,String name,String surname,String telephone,String city) {
        this.ownedCourse = ownedCourse;
        this.collectionCount = collectionCount;
        this.setCity(city);
        this.setId(id);
        this.setName(name);
        this.setSurname(surname);
        this.setTelephone(telephone);
    }
}
