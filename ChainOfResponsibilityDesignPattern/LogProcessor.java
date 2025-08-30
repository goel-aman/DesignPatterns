package ChainOfResponsibilityDesignPattern;

public abstract class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;


    protected LogProcessor nextProcessor;

    LogProcessor(LogProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
    
    public abstract void logMessage(int level, String message);
}
