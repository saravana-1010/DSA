package DesignPatterns.CommandPattern;

public class TurnOffACCommand implements Command {
    AirConditioner ac;
    public TurnOffACCommand(AirConditioner ac) {
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOffAC();
    }
}
