package gof.structural.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        TvRemote remote = new TvRemote(new SamsungTV());
        remote.on();
        remote.setChannel(10);

        System.out.println();
        remote = new TvRemote(new LgTV());
        remote.off();
    }
}
