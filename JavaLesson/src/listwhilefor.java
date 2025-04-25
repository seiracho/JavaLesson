import java.util.ArrayList;
import java.util.List;

public class listwhilefor {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//for文まとめ問題1
		List<Integer> testList = new ArrayList<Integer>();
		testList.add(85);
		testList.add(92);
		testList.add(78);
		testList.add(65);
		testList.add(98);
		testList.add(70);
		//結果が70以上だったら出力
		int count = 0;
		for (int result : testList) {
			if (result >= 70) {
				count++;
			}
			
		}
		System.out.println("70点以上の得点の数は" + count + "個です。");
	}

}

	/*ArrayListを利用すること
拡張for文を利用すること
「70点以上の得点の数は 」という文字列と、変数で設定した点数と、
「 個です。」という文字列を連結して、一行でコンソールに出力すること
*/