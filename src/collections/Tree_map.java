package collections;

import java.util.TreeMap;
import java.util.Map;

public class Tree_map {
	 public static void main(String[] args) {
	        
		    Map<Integer, String> treemap = new TreeMap<Integer, String>();
	        
		    treemap.put(1,new String("apple"));
		    treemap.put(2,new String("grapes")); 
		    treemap.put(10,new String("bananna"));
		    treemap.put(8,new String("orange"));
		    treemap.put(5,new String("strawberries"));
		    treemap.put(6,new String("custardapple"));
		    treemap.put(7,new String("pineapple"));
		    treemap.put(4,new String("jackfruit"));
		    treemap.put(9,new String("goa"));
		    treemap.put(3,new String("kiwi"));
		    
		    System.out.println("Contents of LinkedHashMap : " + treemap);

		    for (Integer key : treemap.keySet()) {
	            System.out.println(key + ":\t" + treemap.get(key));
	        }
		    
		    System.out.println("remove 4th key : " + treemap.remove(4));
		    System.out.println("remove 7th key : " + treemap.remove(7));
		    System.out.println("LinkedHashMap contains bananna? : " + treemap.containsValue("bananna"));

		    System.out.println("LinkedHashMap contains apple? : " + treemap.containsValue("apple"));
		    System.out.println("LinkedHashMap contains 4 key or not? : " + treemap.containsKey(4));
		    
		    System.out.println("LinkedHash code: " + treemap.hashCode());
		    treemap.clear();
	        System.out.println("\nContent of LinkedHashMap after clearing: " + treemap);
		    
	 }
}