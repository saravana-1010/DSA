package solid.Bridge;

public class TestClass {
    public static void main(String[] args) {
        Cat cat = new Cat(new LandBreatheImpl());
        Fish fish = new Fish(new WaterBreatheImpl());
        cat.breathe();
        fish.breathe();
    }
}
