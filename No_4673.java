package CodingTest;

import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class No_4673 {

	public static void main(String[] args) {
		long tc[] = new long[10000];
		List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
		
		for(int i = 1; i <= 10000; i++) {
			int sum = 0;
			String num = Integer.toString(i);
			String number[] = num.split("");
			long n[] = Arrays.asList(number).stream().mapToLong(Long::parseLong).toArray();
			for(int j = 0; j < n.length; j++) {
				sum += n[j];
			}
			tc[i - 1] = i + sum;
		}
		
        for(int k = 0; k < 10000; k++) {
        	list1.add(String.valueOf(tc[k]));
        	list2.add(String.valueOf(k + 1));
        }
        List<String> mergedList = new ArrayList<>(list2);
        
        mergedList.removeAll(list1);
        
        for(int i = 0; i < mergedList.size(); i++) {
            System.out.println(mergedList.get(i));
        }
	}
}