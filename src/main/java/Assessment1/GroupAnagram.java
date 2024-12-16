package Assessment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

public class GroupAnagram {
	//PsuedoCode
	/*
	 * initialise a hash map with String as key List<String> as value
	 * iterate the list and store the sorted version of the string as key and list of strings as value.
	 * For sorting, declare ascii array of 26 length(lowercase letters only) and store the frequency of each character.
	 * convert this to string (sortedkey) and use as key in the map.	 * 
	 * if sortedkey is not present in the map, then add it in the map.else, get the current list of strings and 
	 * append the current list of strings to the existing list of strings. add it into the map with sortedkey and strings.
	 */
	//Big O notations:
	//Sc and TC: O(n*k)
	
	//Unit Tests
	@Test
	private void test1() {
		
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));
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
	
	// Code
	   public List<List<String>> groupAnagrams(String[] strs) {
		   
	        List<String> anagrams = Arrays.asList(strs);
	         
	        HashMap<String, List<String>> map = new HashMap<>();
	        
	        
	        for (int i=0;i<anagrams.size();i++){ 
	        	
	            ArrayList<String> valueList = new ArrayList<>();
	            String eachStr = anagrams.get(i); 
	            valueList.add(eachStr);
	            int[] ascii= new int[26];
	            
	            for(int j=0;j<eachStr.length();j++){
	            	
	                ascii[eachStr.charAt(j)-'a']++;
	                
	            }
	            String string = Arrays.toString(ascii);
	            String sortedKey = String.valueOf(string);

	            if(!map.containsKey(sortedKey)) 
	                map.put(sortedKey, valueList);
	            else {
	                // get the current list of strings
	                List<String> strings = map.get(sortedKey); //O(1)--> O(logn)
	                // 
	                strings.addAll(valueList); 
	                map.put(sortedKey, strings); 
	            }
	        }
	        
	        return new ArrayList<>(map.values());
	    }
	}