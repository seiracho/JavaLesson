/*20250425 問2
 * 
 */
public class Book {
	//フィールドに持たせる
	String title;
	String author;
	int price;
	
	//showInfoメソッドで本の情報を表示
	public void showInfo() {
		System.out.print(title +","+ author +","+ price +"yen");
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//インスタンス化
		Book book1 = new Book();
		//フィールドへの代入
		book1.title = "moomin";
		book1.author = "Tove Jansson";
		book1.price = 600;
		//showInfoメソッド呼び出し
		book1.showInfo();

	}

}
