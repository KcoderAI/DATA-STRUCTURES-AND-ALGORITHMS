package week3Day2HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

public class GroupAnagrams {

	// Write Psuedocode	
	
	@Test
	public static void Test1() {
		String[] inpStr = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> result = new ArrayList<>();
		result = groupAnagrams(inpStr);
		System.out.println(result);
	}
	
	@Test
	private void test2() {
		
		String[] strs = {""};
		System.out.println(groupAnagrams(strs));
	}
	@Test
	private void test3() {
		
		String[] strs = {"a"};
		System.out.println(groupAnagrams(strs));
	}
	
	 public static List<List<String>> groupAnagrams(String[] strs) {
	        List<String> anagrams = Arrays.asList(strs);
	         // initialise a hash map with String as key List<String> as value
	        HashMap<String, List<String>> map = new HashMap<>();
	        // iterate the list and store the sorted version of the string as key and list of strings as value
	        for (int i=0;i<anagrams.size();i++){ //O(n)
	            ArrayList<String> valueList = new ArrayList<>();
	            String eachStr = anagrams.get(i); // O(1)
	            valueList.add(eachStr);
	            int[] ascii= new int[26];
	            for(int j=0;j<eachStr.length();j++){
	                ascii[eachStr.charAt(j)-'a']++;
	            }
	            String string = Arrays.toString(ascii);
	            String sortedKey = String.valueOf(string);

	            // eat-> aet->[eat]
	            // ate-> aet -> [eat, ate]
	            // tea -> aet -> [eat, ate, tea]
	            // bat -> abt -> [bat]
	            // ant -> [tan nat]
	            if(!map.containsKey(sortedKey)) //O(1)--> O(logn)
	                map.put(sortedKey, valueList);
	            else {
	                // get the current list of strings
	                List<String> strings = map.get(sortedKey); //O(1)--> O(logn)
	                // append the current list of strings to the existing list of strings
	                strings.addAll(valueList); //O(n)
	                map.put(sortedKey, strings); // O(1)
	            }
	        }
	        //Collection<List<String>> values = map.values(); // O(n)
	        return new ArrayList<>(map.values());
	    }

}

