package singleton;

public class TestClass {
    public static void main(String[] args) {
        SingletonClass singletonInstance1 = SingletonClass.getSingletonInstance();
        SingletonClass singletonInstance2 = SingletonClass.getSingletonInstance();

        System.out.println("Address of singleton instance 1: " + singletonInstance1);
        System.out.println("Address of singleton instance 2: " + singletonInstance2);
        System.out.println(singletonInstance1 == singletonInstance2);

    }
}
