import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Excel {
	public static void main(String args[]) {
		/*問1 授業で学んだ方法だとこうなるけど、どうだろう…
		 * 調べてみたら二つ方法があるらしい
		 * ①
		 * 
		 */
		List<String> numList = new ArrayList<String>();
		numList.add("1");
		numList.add(0,"2");
		numList.add(0,"3");
		numList.add(0,"4");
		numList.add(0,"5");
		System.out.println(numList);
		
		//問2
		Set<Integer> numberList = new HashSet<Integer>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(2);
		System.out.println(numberList);
		
		//問3
		List<String> fruitsList = new ArrayList<String>();
		fruitsList.add("リンゴ");
		fruitsList.add("バナナ");
		fruitsList.add("さくらんぼ");
		System.out.println(fruitsList);
		fruitsList.remove(1);
		fruitsList.add("オレンジ");
		System.out.println(fruitsList);
		
		//問4
		List<String> LinkedList = new ArrayList<String>();
		LinkedList.add("なめこ");
		LinkedList.add("とまと");
		LinkedList.add("こめな");
		
		
	}
	
}
