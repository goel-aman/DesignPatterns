package ChainOfResponsibilityDesignPattern;

public class ErrorLogProcessor extends LogProcessor {

    public ErrorLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void logMessage(int level, String message) {
        if(level == ERROR) {
            System.out.println("Error Log: " + message);
        } else {
            nextProcessor.logMessage(level, message);
        }
    } 
}
