package solid.ChainOfResponsibility;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(LogType logType, String message) {
        if (LogType.INFO.equals(logType)) {
            System.out.println("Info log processor, message: " + message);
        } else {
            super.log(logType, message);
        }
    }
}
