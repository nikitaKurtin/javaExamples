package gof.structural.bridge;

public class SamsungTV implements TV {
    @Override
    public void on() {
        System.out.println("Turning on Samsung TV");
    }

    @Override
    public void off() {
        System.out.println("Turning off Samsung TV");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("Changing channel on Samsung tv to: " + channel);
    }
}
