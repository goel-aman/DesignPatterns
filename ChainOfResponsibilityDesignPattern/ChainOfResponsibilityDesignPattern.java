package ChainOfResponsibilityDesignPattern;

public class ChainOfResponsibilityDesignPattern {
    public static void main(String[] args) {
        LogProcessor processLog = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        
        processLog.logMessage(1, "Hi aman how are you");
    }
}
