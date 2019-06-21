package com.accolite.Logger;

public class SingletonLoggerTest{

        public static void main(String[] args){
        		SingletonLogger logger1 = SingletonLogger.getInstance();
                SingletonLogger logger2 = SingletonLogger.getInstance();             
               
                logger1.registerStudent("Deepa");
                logger2.getStudent();                
                logger2.removeStudent();
                logger1.getStudent();
            }

}