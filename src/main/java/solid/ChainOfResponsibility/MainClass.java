package solid.ChainOfResponsibility;

public class MainClass {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogType.INFO, "information statement");
        logProcessor.log(LogType.DEBUG, "debug statement");
        logProcessor.log(LogType.ERROR, "error statement");
    }
}
