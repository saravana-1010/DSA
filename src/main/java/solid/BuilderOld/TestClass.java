package solid.BuilderOld;

public class TestClass {
    public static void main(String[] args) {
        EnggStudent engineer1 = new EnggStudentBuilder().setAddress("Chennai").setRollNo(1).build();
        System.out.println(engineer1.address);
        System.out.println(engineer1.name);
    }
}
