import java.util.ArrayList;
import java.util.List;

public class ChecknumberList {
	public static void main(String args[]) {
		//空の文字列リスト作成
		List<String> numberList = new ArrayList<String>();
		
		int a = 3;
		if (a > 10) {
			numberList.add("large");
		} else {
			numberList.add("small");
	}
		//今回の課題的にも最後でOk
		System.out.println(numberList);
	}
}

/*整数型の変数と、空の ArrayList 型の文字列のリストがあります。
if 文を使用して、整数型の変数の値が 10 より大きいかどうかを判定し、
大きい場合はリストに文字列 "large" を追加し、
そうでない場合は文字列 "small" を追加するコードを記述してください*/