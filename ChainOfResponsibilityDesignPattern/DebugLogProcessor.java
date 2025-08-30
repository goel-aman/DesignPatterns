package ChainOfResponsibilityDesignPattern;

public class DebugLogProcessor extends LogProcessor {
    DebugLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void logMessage(int level, String message) {
        if(level == DEBUG) {
            System.out.println("Debug Log: " + message);
        } else {
            nextProcessor.logMessage(level, message);
        }
    }
}
