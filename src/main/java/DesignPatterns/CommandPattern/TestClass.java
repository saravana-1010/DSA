package DesignPatterns.CommandPattern;

public class TestClass {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        Remote remote = new Remote();
        remote.setButton1(new TurnOnACCommand(ac));
        remote.setButton2(new TurnOffACCommand(ac));
        remote.setButton3(new IncreaseTempCommand(ac));
        remote.turnOnAC();
        remote.turnOffAC();
        remote.increaseTemp();
        System.out.println();
        remote.undoButton1();
        remote.undoButton2();
        remote.undoButton3();
    }
}
