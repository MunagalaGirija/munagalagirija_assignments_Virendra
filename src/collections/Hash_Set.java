package collections;
import java.util.HashSet;

	//import java.util.LinkedHashSet;
	public class Hash_Set {
	
		public static void main(String[] args){
			
			//LinkedHashSet<String> hs=new LinkedHashSet<String>();
			HashSet<String> hs=new HashSet<String>();
			
			hs.add("apple");
			hs.add("grapes");
			hs.add("banana");
			hs.add("orange");
			hs.add("strawberries");
			hs.add("custardapple");
			hs.add("pineapple");
			hs.add("jackfruit");
			hs.add("guava");
			hs.add("kiwi");
					
			//System.out.println("Hashset is "+hs);
			System.out.println("Size of Hashset is "+ hs.size());
	        System.out.println("remove  fruits "+hs.remove("apple"));
	        System.out.println("remove  fruits "+ hs.remove("kiwi"));
			System.out.println("Does hashset contains this orange  " + hs.contains("orange"));		
			System.out.println("is hashset empty  " + hs.isEmpty());
			
			
		    
		   }
	}