package gof.behavioral.command;

public class Test {
    public static void main(String[] args) {
        //create receiver that accepts the command
        Receiver r = new Receiver();

        //create commands to do stuff on receiver
        GrootPrinterCommand grootCmd = new GrootPrinterCommand(r);
        BubuPrinterCommand bubuCmd = new BubuPrinterCommand(r);

        //create an invoker to call commands
        PrintInvoker invoker = new PrintInvoker();

        //call commands from invoker
        invoker.invokeCommand(bubuCmd);

        invoker.invokeCommand(grootCmd);
        invoker.invokeCommand(bubuCmd);
    }
}
