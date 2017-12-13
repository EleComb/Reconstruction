package designPattern._14_ChainofResponsibilityPattern.entity;

import designPattern._14_ChainofResponsibilityPattern.iml.AbstractLogger;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}