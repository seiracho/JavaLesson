import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {
	public static void main(String args[]) {
		List<String> fruitsList = new ArrayList<String>();
		fruitsList.add("apple");
		fruitsList.add("potato");
		fruitsList.add(1,"grape");
		fruitsList.add(2,"peace");
		System.out.println(fruitsList);
		
		String element1 =fruitsList.get(1);
		System.out.println("1:" +element1);
		
		String element3 = fruitsList.get(3);
		System.out.println("3" +element3);
		fruitsList.remove(3);
		System.out.println(fruitsList);
	}
}
