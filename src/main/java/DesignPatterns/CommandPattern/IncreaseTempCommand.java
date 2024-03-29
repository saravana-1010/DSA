package DesignPatterns.CommandPattern;

public class IncreaseTempCommand implements Command {
    AirConditioner ac;
    public IncreaseTempCommand(AirConditioner ac) {
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.increaseTemp();
    }

    @Override
    public void undo() {
        ac.decreaseTemp();
    }
}
