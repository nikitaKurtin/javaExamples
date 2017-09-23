package gang_of_four.behavioral.command;

public class BubuPrinterCommand implements PrintCommand {
    private Receiver mReceiver;

    public BubuPrinterCommand(Receiver mReceiver) {
        this.mReceiver = mReceiver;
    }

    @Override
    public void execute() {
        mReceiver.printBubu();
    }
}
