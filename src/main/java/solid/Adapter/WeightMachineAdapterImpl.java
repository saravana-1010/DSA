package solid.Adapter;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    WeightMachine weightMachine;
    WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double weightInKg() {
        return weightMachine.weightInPound() * 0.5;
    }
}
