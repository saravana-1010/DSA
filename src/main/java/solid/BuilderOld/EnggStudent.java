package solid.BuilderOld;

public class EnggStudent {
    int rollNo;
    String name;
    String address;
    String email;
    public EnggStudent(EnggStudentBuilder enggStudentBuilder) {
        this.name = enggStudentBuilder.name;
        this.rollNo = enggStudentBuilder.rollNo;
        this.address = enggStudentBuilder.address;
        this.email = enggStudentBuilder.email;
    }
}
