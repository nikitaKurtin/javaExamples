package gof.behavioral.command;

public class PrintInvoker {
    public void invokeCommand(PrintCommand command) {
        command.execute();
    }
}
