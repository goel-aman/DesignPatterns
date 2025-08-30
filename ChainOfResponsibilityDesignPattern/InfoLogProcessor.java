package ChainOfResponsibilityDesignPattern;

public class InfoLogProcessor extends LogProcessor  {
    public InfoLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void logMessage(int level, String message) {
        if(level == INFO) {
            System.out.println("Info Log: " + message);
        } else {
            nextProcessor.logMessage(level, message);
        }
    }
}
