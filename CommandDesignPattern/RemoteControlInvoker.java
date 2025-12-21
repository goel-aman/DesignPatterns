package CommandDesignPattern;
import java.util.Stack;

public class RemoteControlInvoker {
    CommandInterface command;
    Stack<CommandInterface> history;

    public RemoteControlInvoker(CommandInterface command) {
        this.command = command;
        history = new Stack<>();
    }

    public void buttonPressed() {
        this.command.execute();
        history.add(command);
    }

    public void undo() {
        
    }
}

