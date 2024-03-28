package solid.ChainOfResponsibility;

public class DebugLogProcessor extends LogProcessor{

//    public LogProcessor nextLogProcessor;
//
//    public DebugLogProcessor(LogProcessor nextLogProcessor) {
//        this.nextLogProcessor = nextLogProcessor;
//    }
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(LogType logType, String message) {
        if (LogType.DEBUG.equals(logType)) {
            System.out.println("Debug log processor, message: " + message);
        } else {
            super.log(logType, message);
//            nextLogProcessor.log(logType, message);
        }
    }
}
