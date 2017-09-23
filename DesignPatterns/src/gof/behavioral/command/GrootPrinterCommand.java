package gof.behavioral.command;

public class GrootPrinterCommand implements PrintCommand {
    private Receiver mReceiver;

    public GrootPrinterCommand(Receiver mReceiver) {
        this.mReceiver = mReceiver;
    }

    @Override
    public void execute() {
        mReceiver.printGroot();
    }
}
