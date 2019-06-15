import java.util.*;
class StringOrder{
public static void main(String[] args) {
    String[] input = {"ab", "bc", "ab" ,"ab" ,"cd", "cd"};
    List<String> list= new ArrayList<>();
    HashMap<String, Integer>  map = new HashMap<>();
    for(int i=0;i<input.length;i++) {
        String ch = input[i];
        if(!map.containsKey(ch))
            list.add(ch);
        map.put(ch, map.containsKey(ch)?map.get(ch)+1:1);
    }

    MyComparator comparator = new MyComparator(map);
    Collections.sort(list, comparator);
    System.out.print("Sorted Order: ");
    for(int i=0;i<list.size();i++) {
        System.out.print(list.get(i) + " ");
    }
}
}

class MyComparator implements Comparator<String> {
    Map<String, Integer> myMap;
    public MyComparator(Map<String, Integer> myMap) {
        this.myMap = myMap;
    }
    public int compare(String s1, String s2) {
        int n1 = myMap.get(s1);
        int n2 = myMap.get(s2);
        return n1<n2?1:-1;
    }

}