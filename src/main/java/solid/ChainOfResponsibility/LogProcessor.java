package solid.ChainOfResponsibility;

public abstract class LogProcessor {
    public LogProcessor nextLogProcessor;
    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(LogType logType, String message) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(logType, message);
        }
    }
}
