package DesignPatterns.TemplatePattern;

public class TestClass {
    public static void main(String[] args) {
        Payment payToFriend = new PayToFriend(100);
        payToFriend.pay();
    }
}
