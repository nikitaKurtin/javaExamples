package gof.behavioral.mediator;

import java.util.ArrayList;

class Mediator {
    private ArrayList<AirCraft> aircrafts;//All Aircrafts - assigned to this Mediator

    //When Mediator created - it has empty array of Aircrafts
    Mediator() {
        this.aircrafts = new ArrayList<>();
    }

    //adding new AirCraft to this Mediator
    void registration(AirCraft aircraft) {
        this.aircrafts.add(aircraft);
    }

    //pass given message to all assigned Aircrafts
    void passMsg(String msg, AirCraft sender) {
        for (AirCraft ac : aircrafts) {//iterate over all aircrafts
            if (sender != ac) ac.receiveMessage(msg);//pass to all, except the sender
        }
    }
}
