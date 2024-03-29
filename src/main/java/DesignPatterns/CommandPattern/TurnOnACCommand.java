package DesignPatterns.CommandPattern;

public class TurnOnACCommand implements Command {
    AirConditioner ac;
    public TurnOnACCommand(AirConditioner ac) {
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turOnAC();
    }
}
