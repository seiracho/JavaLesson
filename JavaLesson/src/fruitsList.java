import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class fruitsList {
	public static void main(String args[]) {
		//変数名はわかりやすく
		Scanner scanFruits = new Scanner (System.in);
		//<String, String>にもできてその場合は"円"を入れなきゃいけないからめんどくさい
		Map<String, Integer>nameMap = new HashMap<>();
		nameMap.put("りんご", 100);
		nameMap.put("みかん", 80);
		nameMap.put("バナナ", 120);
		nameMap.put("いちご", 300);
		
		//もし([入力された果物]が[マップ]に[含まれていたら])
		    //valueを出力する
		//なかったら
		    //メッセージを出す
		
		/*Integerの変数名を定義。
		 * そもそも定義されていると思って、今回はKey(String)のValue(Integer)が欲しかったから
		 * 「System.out.println(value)」って書いてたけど、変数名を定義しなきゃいけなかった
		 */
		Integer mapVal;
		mapVal=nameMap.get("りんご");
		
		System.out.print("名前を入力して");
		
		
		mapVal=nameMap.get(scanFruits.nextLine());
		
		if (mapVal != null) {
			//円を追加するの忘れないように
			System.out.println(mapVal + "円");
		
		} else {
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
		}
		
		scanFruits.close();//Scannerを閉じる
	}

}

/*りんご：100円
みかん：80円
バナナ：120円
いちご：300円
【要件】
上記の商品を取り扱っているお店があります。
お客さんが購入したい果物の名前を変数で設定し、その果物が登録されているか
どうかを確認し、登録されていればその値段を表示するプログラムを
作成してください。入力させる。（Scanner）もし登録されていなければ、
「申し訳ありませんが、その商品は取り扱っておりません。」
と表示してください。
*/