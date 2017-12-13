package designPattern._14_ChainofResponsibilityPattern.entity;

import designPattern._14_ChainofResponsibilityPattern.iml.AbstractLogger;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
