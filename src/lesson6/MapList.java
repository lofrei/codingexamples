package lesson6;
import java.util.*;
public class MapList {
    static Map<Integer, Set<Integer>> partitionIntegers(List<Integer> myList, int n){
        Map<Integer, Set<Integer>> partitionedMap = new HashMap<>();
        int key=0;
        while (key <n)
        { Set<Integer> set = new HashSet<>();
            for (Integer element: myList) {
                if (element%n==key)
                { set.add(element);
                    partitionedMap.put(key, set);}
            }
            key++;
        }
        return partitionedMap;
    }
    public static void main (String[]args) {
        List<Integer> _list = new ArrayList<>();
        _list.add(2);
        _list.add(5);
        _list.add(3);
        _list.add(3);
        _list.add(7);
        System.out.println(partitionIntegers(_list, 20));
    }
}




