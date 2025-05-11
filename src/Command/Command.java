package Command;

/**
 * Command interface used to encapsulate order actions like place, cancel, and reorder.
 * Supports undo functionality.
 */
public interface Command {
    void execute();
    void undo();
}

