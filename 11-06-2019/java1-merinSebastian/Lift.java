
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
 
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class Lift {
 
  public static void main(String[] args) throws Exception {
 
    Map<String, Integer> people = new HashMap<>();
    people.put("first", 3);
    people.put("second", 4);
    people.put("third", 5);
    people.put("fourth", 5);
    people.put("fifth", 1);
    people.put("sixth", 1);
  
    Map<String, Integer> sorted = people
        .entrySet()
        .stream()
        .sorted(comparingByValue())
        .collect(
            toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                LinkedHashMap::new));
 	System.out.print("People should go in first lift are : "  );
	int i = 0;
	for(String key : sorted.keySet()){
			if(i < sorted.size()/2){
					System.out.print(key + " ");
			}
			i++;
	} 
	i = 0;
	System.out.println();
	System.out.print("People should go in second lift are : "  );
		for(String key : sorted.keySet()){
			if(i >= sorted.size()/2){
					System.out.print(key + " ");
			}
			i++;
	} 
	
  }
 
}
 