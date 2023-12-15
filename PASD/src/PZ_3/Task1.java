package PZ_3;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        
        List<Integer> list1 = List.of(1, 4, 8, 9, 11, 15, 17, 28, 41, 59);
        List<Integer> list2 = List.of(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81);

        
        List<Integer> result = intersect(list1, list2);

        
        System.out.println(result);
    }

   
    public static List<Integer> intersect(List<Integer> list1, List<Integer> list2) {
       
        List<Integer> resultList = new ArrayList<>();

        
        int i = 0;
        int j = 0;

        
        while (i < list1.size() && j < list2.size()) {
            
            int value1 = list1.get(i);
            int value2 = list2.get(j);

            
            if (value1 == value2) {
                resultList.add(value1);
                i++; 
                j++; 
            } else if (value1 < value2) {
                i++; 
            } else {
                j++; 
            }
        }

        
        return resultList;
    }
}

