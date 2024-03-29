package solid.BuilderOld;

public class EnggStudentBuilder {
    int rollNo;
    String name;
    String address;
    String email;

    public int getRollNo() {
        return rollNo;
    }

    public EnggStudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public String getName() {
        return name;
    }

    public EnggStudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public EnggStudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public EnggStudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public EnggStudent build() {
        return new EnggStudent(this);
    }
}
