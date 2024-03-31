package solid.Adapter;

public class TestClass {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println("Weight: " + weightMachineAdapter.weightInKg());
    }
}
