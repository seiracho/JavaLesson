import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapSample {
	public static void main(String args[]) {
		Set<Integer>numList = new HashSet<Integer>();
		numList.add(2);
		numList.add(1);
		numList.add(1);
		numList.add(3);
		System.out.println(numList);
		
		Map<String,Integer> nameMap = new HashMap<>();
		nameMap.put("Bob", 1);//<String,Integer>型に対応して("Bob",1)
		nameMap.put("Alice", 2);
		nameMap.put("John", 2);
		nameMap.put("Tom", 1);
		System.out.println(nameMap);
		
		//型と変数はそろえる↓("Alice"はStringだから""が必要)
		Integer value;
				value =nameMap.get("Alice");
		/*printlnは１つしか出力できないから何個もvalueを出したいときは一つずつやるか
		*/
		System.out.println(value);
		
		value = value + nameMap.get("Tom");
		System.out.println(value);
		
		//nameMap.remove("Alice");
		//System.out.println(nameMap);
	
	}

}
