import java.util.ArrayList;

public class whilejava {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/*while文 与えられた条件を満たす場合のみ。条件が成立しなかったらそのまま終了
		 * 最初に条件チェックして判断するから、無駄に処理をしない。条件がfalseなら一度も実行されない。
		 */
		int i = 5;
		while (i < 5) {
			System.out.println("iの値:" + i);
			i++;
		}
		
		/*Do while文 最低一回は必ず処理される(最後に条件チェックされるため)
		 * 　とりあえず1回実行したいときに使用。
		 */
		//変数名は上で既に変数iを定義しているので、そのまま使用する(昨日も間違えたところや！)
		int a = 5;
		/*doの中{}にa++;が入っているので、Systemoutprintlnの後でもa++;が実行される
		 * 変数＝データ入れる名前付きの箱のイメージを忘れずに！
		 */
		do {
			System.out.println("aの値:" + a);
			a++; // iに1を足す (i = i + 1)
		} while (a < 5);
		System.out.println("aの値:" + a);

		/*for文 important
		 * for( 変数の宣言と初期化; 論理式; 変数の更新) {
　				繰り返し行う処理;
		  }
		 */
		for( i = 1; i <= 10; i++) {
			System.out.println(i);
			//for文 二重ループ
			for( int b = 2; b ==2; b++) {
				System.out.println(b);
			}
		}
		
		//拡張for文 配列やリストの中身を1ずつ取り出せる
		ArrayList<String> employees = new ArrayList<>();
		employees.add("田中太郎");
		employees.add("山田花子");
		employees.add("佐藤次郎");
		/* for(型 変数名 : 配列やリスト)表示したい型に新たに変数名を定義
		 * 今回：employeesリストから1つずつ要素を取り出してemployeeの型の中に入れていく
		 */
		for(String employee : employees) {
			System.out.println(employee);
		}
		
		
		
		
		
	}

}
