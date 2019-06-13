
import java.io.*;
import java.util.logging.*;
public class ExceptionHandling{
    
    public static void main(String[] args){
        Logger logger = Logger.getLogger("MyLog");
        Logger logger2 = Logger.getLogger("second Log");
        FileHandler fh;
        FileHandler fh2;

        int a = 10 , b = 0;
         try {   
            fh = new FileHandler("D://gitRepo//MS-AU-2019//12-06-2019//1-1FileIO&Serialization&Exception handling&logging-Ravi//12-06-2019-JavaAssignment//logFile.txt");
            fh2 = new FileHandler("D://gitRepo//MS-AU-2019//12-06-2019//1-1FileIO&Serialization&Exception handling&logging-Ravi//12-06-2019-JavaAssignment//logFile2.txt");   
            logger.addHandler(fh);
            logger2.addHandler(fh2);
            SimpleFormatter formatter = new SimpleFormatter();  
            SimpleFormatter formatter2 = new SimpleFormatter();  
            fh.setFormatter(formatter);    
            fh2.setFormatter(formatter2);    
        } catch (SecurityException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }    

        try{
        int c = a/b;
        }
        catch(ArithmeticException e){
            logger2.warning("Arithmetic exception");
            logger.info("Divide by Zero");
        }
        try{
            int d[] = new int[10];
            System.out.println(d[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            logger2.finer("Access index within the size of an array");
            logger.info("Array out of bounds");
        }
        try{
        FileInputStream fis = new FileInputStream("D://gitRepo//3MS-AU-2019//hello.txt");
        }
        catch(FileNotFoundException e){
            logger2.severe("file operations cant be done without the file");
            logger.info("File not found");
        }

        finally{
            logger2.fine("Program has run successfully");
            logger.fine("Program has run successfully");
        }
        
    }
} 
