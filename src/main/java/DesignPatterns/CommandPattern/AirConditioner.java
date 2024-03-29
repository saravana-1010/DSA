package DesignPatterns.CommandPattern;

public class AirConditioner {
    boolean turnOnAC;
    int temp;
    public AirConditioner() {
        turnOnAC = true;
        temp = 25;
    }
    public void turOnAC() {
        this.turnOnAC = true;
        System.out.println("AC turned on");
    }

    public void turnOffAC() {
        this.turnOnAC = false;
        System.out.println("AC turned off");
    }

    public void increaseTemp() {
        this.temp+=1;
        System.out.println("AC temp increased");
    }

    public void decreaseTemp() {
        this.temp-=1;
        System.out.println("AC temp decreased");
    }
}
