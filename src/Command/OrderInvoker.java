package Command;

import java.util.Stack;

/**
 * Invoker class that triggers command execution and keeps a history for undo functionality.
 */
public class OrderInvoker {
    private Stack<Command> commandHistory = new Stack<>();

    public void setCommand(Command cmd) {
        commandHistory.push(cmd);
        cmd.execute();
    }

    public void undoCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }
}
