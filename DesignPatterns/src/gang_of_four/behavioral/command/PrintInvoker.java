package gang_of_four.behavioral.command;

public class PrintInvoker {
    public void invokeCommand(PrintCommand command) {
        command.execute();
    }
}
