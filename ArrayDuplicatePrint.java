import java.util.*;

class ArrayDuplicatePrint { 
	public static void main(String[] args) { 
		ArrayList<String> words = new ArrayList<String>(); 
		HashMap<String, Integer> duplicatewords = new HashMap<String, Integer>(); 
		ArrayList<String> newwords = new ArrayList<String>(); 

		words.add("stack"); 
		words.add("apple"); 	//adding data with duplicates in arraylist
		words.add("stack"); 
		words.add("mango"); 
		words.add("overflow"); 
		words.add("stack"); 
		words.add("mango"); 

		Iterator<String> iterator = words.iterator(); 
		while (iterator.hasNext()) { 			//logic
			String next = iterator.next(); 
			if (newwords.contains(next)) { 
				Integer value = duplicatewords.get(next); 
				if (value == null) { 
					duplicatewords.put(next, 1); 
				} 
				else { 
					duplicatewords.put(next, value + 1); 
				} 
			} 
			else { 
				newwords.add(next); 
			} 
		} 

		words = newwords; 

		System.out.println("Duplicate Enteries:"); 
		for (Map.Entry<String, Integer> entry : duplicatewords.entrySet()) { 	//printing duplicate values
			System.out.println(entry.getKey()); 
		} 
	} 
}