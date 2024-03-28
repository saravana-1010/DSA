package solid.ChainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor {

    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

//    public LogProcessor nextLogProcessor;
//    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
//        this.nextLogProcessor = nextLogProcessor;
//    }

    @Override
    public void log(LogType logType, String message) {
        if (LogType.ERROR.equals(logType)) {
            System.out.println("Error log processor, message: " + message);
        } else {
            super.log(logType, message);
        }
    }
}
