import java.util.*;

public class Union {
  public static void main(String[] argv) throws Exception {
    HashSet<Integer> set1 = new HashSet<Integer>();			//hashset declaration
    set1.add(1);
    set1.add(2);
    set1.add(3);			//adding data
    Iterator itr1 =set1.iterator();
    System.out.println("Values in set1");
    while(itr1.hasNext()){
    	System.out.println(itr1.next());		//printing values in set1
    }
    HashSet<Integer> set2 = new HashSet<Integer>();		//hashset declaration
    set2.add(-1);
    set2.add(-2);
    set2.add(-3);					//adding data
    Iterator itr2 =set2.iterator();
    System.out.println("Values in set2");
    while(itr2.hasNext()){
    	System.out.println(itr2.next());		//printing values in set1
    }
    set1.addAll(set2);
    ArrayList sortedList = new ArrayList(set1);
    Collections.sort(sortedList);				//sorting list
    Iterator itr3 =sortedList.iterator();
    System.out.println("Values in set1 after union operation");
    while(itr3.hasNext()){
    	System.out.println(itr3.next());			//printing union operation
    }
    
  }
}
