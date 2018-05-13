package javafullstack2018.net;

import java.util.List;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;

public class App {
    public static int findMaxSum(List<Integer> list) {
 //       int sum = 0;
 //       int sub = 0;
//        System.out.println(list.size());
        // sort the list in descending order using Collections Framework
//        Collections.sort(list, Collections.reverseOrder()); 
        // sort the list manually with two loops
//        for (int i = 0; i < list.size(); i++)
//        {
//        	for (int j = i + 1; j < list.size(); j++)
//        	{
//        		if (list.get(i) < list.get(j))
//        		{
//        			sub = list.get(i);
//        			list.set(i, list.get(j));
//        			list.set(j, sub);
//        		}
//        	}
//        }
        // just get the largest two elements with one loop
        int first = list.get(0); // the largest element in the array list
        int second = list.get(1); // the second largest element in the array list
        if(list.get(0) > list.get(1))
        {
        	first = list.get(0);
        	second = list.get(1);
        }
        else
        {
        	first = list.get(1);
        	second = list.get(0);
        }
        
        for(int i = 2; i < list.size(); i++)
        {
        	if(list.get(i) > first)
        	{
        		second = first;
        		first = list.get(i);
        	}
        	else if(list.get(i) > second && list.get(i) != first)
        	{
        		second = list.get(i);
        	}
        }
        return (first + second);
    }
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        System.out.println(findMaxSum(list));
    }
}