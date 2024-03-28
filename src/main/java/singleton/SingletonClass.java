package singleton;

public class SingletonClass {
    public static SingletonClass instance;

//    private SingletonClass() {
//
//    }

    public static SingletonClass getSingletonInstance() {
        if(instance == null) {
            instance = new SingletonClass();
            System.out.println("Inside condition");
        }

        return instance;
    }
}
