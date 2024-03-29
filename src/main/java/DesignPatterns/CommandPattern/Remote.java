package DesignPatterns.CommandPattern;

public class Remote {
    Command button1;
    Command button2;
    Command button3;
    Command button4;
    public void turnOnAC() {
        button1.execute();
    }
    public void turnOffAC() {
        button2.execute();
    }
    public void increaseTemp() {
        button3.execute();
    }
    public void setButton1(Command command1) {
        this.button1 = command1;
    }
    public void setButton2(Command button2) {
        this.button2 = button2;
    }

    public void setButton3(Command button3) {
        this.button3 = button3;
    }

    public void setButton4(Command button4) {
        this.button4 = button4;
    }


}
