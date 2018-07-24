/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain.of.responsibility.pattern;

import chain.of.responsibility.pattern.loggers.AbstractLogger;
import chain.of.responsibility.pattern.loggers.ConsoleLogger;
import chain.of.responsibility.pattern.loggers.ErrorLogger;
import chain.of.responsibility.pattern.loggers.FileLogger;

/**
 *
 * @author erim
 */
public class ChainOfResponsibilityPattern {

    /**
     * @param args the command line arguments
     */
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
        
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information");
        
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information");
        
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information");
    }
    
}
