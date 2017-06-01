import java.util.*;

public class ArrayListTest2 {
	public void EvenNumbersFunction(){
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();		//ArrayList declaration
		
		numbers.add(11);
		numbers.add(12);
		numbers.add(14);	//adding numbers to the array list
		numbers.add(17);
		numbers.add(10);
		numbers.add(9);
		numbers.add(20);
		numbers.add(18);
		numbers.add(42);
		Iterator itr1 = numbers.iterator(); 	//iterator object
		System.out.println("Even numbers in the array list are-");
		while(itr1.hasNext()){
			Integer num = (Integer) itr1.next();
			if(num%2==0){
				System.out.println(num);		//printing even numbers
			}
		}
	}
	public static void main(String[] args) {		//main method
		
		ArrayListTest2 obj= new ArrayListTest2();		//object creation of class ArrayListTest2
		obj.EvenNumbersFunction();						//calling EvenNumbersFunction
	}
}