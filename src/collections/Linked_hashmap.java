package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_hashmap {
	 public static void main(String[] args) {
	        
		    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
	        
		    linkedHashMap.put(1,new String("apple"));
		    linkedHashMap.put(2,new String("grapes")); 
		    linkedHashMap.put(3,new String("bananna"));
		    linkedHashMap.put(4,new String("orange"));
		    linkedHashMap.put(5,new String("strawberries"));
		    linkedHashMap.put(6,new String("custardapple"));
		    linkedHashMap.put(7,new String("pineapple"));
		    linkedHashMap.put(8,new String("jackfruit"));
		    linkedHashMap.put(9,new String("goa"));
		    linkedHashMap.put(10,new String("kiwi"));
		    
		    System.out.println("Contents of LinkedHashMap : " + linkedHashMap);

		    for (Integer key : linkedHashMap.keySet()) {
	            System.out.println(key + ":\t" + linkedHashMap.get(key));
	        }
		    
		    System.out.println("remove 4th key : " + linkedHashMap.remove(4));
		    System.out.println("remove 7th key : " + linkedHashMap.remove(7));
		    System.out.println("LinkedHashMap contains bananna? : " + linkedHashMap.containsValue("bananna"));

		    System.out.println("LinkedHashMap contains apple? : " + linkedHashMap.containsValue("apple"));
		    System.out.println("LinkedHashMap contains 4 key or not? : " + linkedHashMap.containsKey(4));
		    
		    System.out.println("LinkedHash code: " + linkedHashMap.hashCode());
		    linkedHashMap.clear();
	        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
		    
	 }
}