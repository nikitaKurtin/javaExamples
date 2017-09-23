package gof.behavioral.mediator;

public class AirCraft {
    //Every AirCraft has: name & mediator
    private String name;
    private Mediator mdtr;

    //When Aircraft created - it needs a name & mediator
    AirCraft(String name, Mediator mdtr) {
        this.mdtr = mdtr;
        this.mdtr.registration(this);
        this.name = name;
    }

    //Every Aircraft can send message - accessible from outside
    void sendMessage(String msg) {
        System.out.println(this.name + " sent: " + msg);
        this.mdtr.passMsg(msg, this);
    }

    //Every Aircraft can receive message - encapsulated to package
    void receiveMessage(String msg) {
        System.out.println(this.name + " received: " + msg);
    }
}
