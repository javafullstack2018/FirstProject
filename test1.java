import java.util.List;
import java.util.Arrays;
//import java.util.Collections;

public class MaxSum {
    public static int findMaxSum(List<Integer> list) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        int sum = 0;
        int sub = 0;
        System.out.println(list.size());
        // sort the list in descending order using Collections Framework
//        Collections.sort(list, Collections.reverseOrder()); 
        // sort the list manually
        for (int i = 0; i < list.size(); i++)
        {
        	for (int j = i + 1; j < list.size(); j++)
        	{
        		if (list.get(i) < list.get(j))
        		{
        			sub = list.get(i);
        			list.set(i, list.get(j));
        			list.set(j, sub);
        		}
        	}
        }
        sum = list.get(0) + list.get(1);
        return sum;
    }
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        System.out.println(findMaxSum(list));
    }
}