package com.accolite.Logger;
import java.util.logging.*;
import java.io.*;

 class SingletonLogger{
    private final String logFile = "file.txt";
    private static Logger logger = Logger.getLogger("clientLogger");
    private static SingletonLogger singletonLogger = null;
    FileHandler fh;
    SimpleFormatter formatter = new SimpleFormatter();  
    private static String studentName = "";
    
    private SingletonLogger() {
        try {
            fh = new FileHandler(logFile);
            logger.addHandler(fh);
        } catch (IOException e) {}
    }
    public void registerStudent (String studentName) {
        this.studentName = studentName;
        logger.info("Registered student named: " + studentName );
    }
    public void removeStudent () {
        
        logger.info("Removed student named: " + this.studentName );
        this.studentName = "";
    }
    public void getStudent () {
    	 logger.info(" student name: " + this.studentName );   
    }
    public static synchronized SingletonLogger getInstance(){
    if(singletonLogger == null)
        singletonLogger = new SingletonLogger();
    return singletonLogger;
    }
    
}