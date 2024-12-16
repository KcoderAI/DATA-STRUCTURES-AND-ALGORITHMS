package week3Day2HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;
/*
 * iterate the list 
load the entries into tree map 
get the entryset into an arraylist (hint: create arrayList object and pass entryset inside the constructor) 
sort the array list using below lamda expression 
entries.sort((i1, i2) -> i2.getValue().compareTo(i1.getValue())); 
iterate the entry set 
and add the key value pair in the needed format <key>+" "+<value> 
 */
public class temp {
	@Test
	public void test1() {
		String[] inputt = {"notebook", "notebook", "mouse", "keyboard", "mouse"};
	    List<String> asList = Arrays.asList(inputt);
	    System.out.println(occ(asList));
	    
	}


	public List<Map.Entry<String,Integer>> occ (List<String>input){
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		for(int i=0; i<input.size();i++) {
			
			map.put(input.get(i), map.getOrDefault(input.get(i), 0)+1);	
			
		 }
			
		ArrayList<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
		
		entries.sort((i1, i2) -> i2.getValue().compareTo(i1.getValue()));
		
		return entries;
	}
	
}
	/*	//StringBuilder sorted = new StringBuilder();
		List<String> sortedK = new ArrayList<>();
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			 
			String tempStr = entry.getKey();
			int count = entry.getValue();
			
			sortedK.add(tempStr + " " + count);
			
		//	System.out.println(sortedK);
			//sorted.append(entry.getKey()).append(entry.getValue());
		
		}
		
		
		return sortedK;
		


		
	}*/
//}



