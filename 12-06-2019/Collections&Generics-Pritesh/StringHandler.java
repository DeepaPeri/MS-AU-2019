
import java.io.*;
import java.util.*;

public class StringHandler{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String finalStr = str.toUpperCase();
            HashMap<Character, Integer> map = new HashMap<>(); 
            for(int i = 0; i < finalStr.length(); i++){
                char character = finalStr.charAt(i);
                if(character >= 'A' && character <= 'Z' ){
                        if(map.containsKey(character) )
                         map.put(character, map.get(character) + 1);
                        else  map.put(character, 1);
                }
                
            }

            for (Map.Entry<Character,Integer    > entry : map.entrySet()){  
                    System.out.print( entry.getKey() + "      " );
                    for(int i = 0; i < entry.getValue(); i ++){
                        System.out.print("#");
                    } 
                    System.out.println();
            }   
    } 
}
