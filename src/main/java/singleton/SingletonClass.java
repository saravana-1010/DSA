package singleton;

public class SingletonClass {
    private static volatile SingletonClass instance;

    private SingletonClass() {
    }

    public static SingletonClass getSingletonInstance() {
        if(instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                    System.out.println("Inside condition");
                }
            }
        }
        return instance;
    }
}
