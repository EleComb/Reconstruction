package designPattern._14_ChainofResponsibilityPattern;

import designPattern._14_ChainofResponsibilityPattern.entity.ConsoleLogger;
import designPattern._14_ChainofResponsibilityPattern.entity.ErrorLogger;
import designPattern._14_ChainofResponsibilityPattern.entity.FileLogger;
import designPattern._14_ChainofResponsibilityPattern.iml.AbstractLogger;

/**
 * 为请求创建一个接受者对象的链.对请求的发送者和接受者解耦.
 * 要过滤很多次的时候使用.
 * */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}