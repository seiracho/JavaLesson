package jp.co.aforce.test;

//問11
public class Book {
	//フィールド
	String name;
	String title;
	int num;
	int price;
	
	public Book(String name, String title, int num, int price) {
		this.name = name;
		this.title = title;
		this.num = num;
		this.price = price;
	}
	
	void Totall() {
		a = 1;
		for (sum = 0; sum = price; a += price) {
			System.out.println("総売上額" +sum);
			price++;
		}
	}
	void showInfonum() {
		if (num > 1000) {
			System.out.println("販売数が1000冊を超える書籍" +num);
		}
	}
	
	void esp() {
		
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ	
		Book book1 = new Book("Python入門","山田太郎",1500,2500);
		Book book2 = new Book("データ分析の基礎","鈴木花子",1200, 3000);
		Book book3 = new Book("AI技術最前線","佐藤一郎",800,4000);
		Book book4 = new Book("Webデザイン講座","田中美咲", 2000, 2000);
		Book book5 = new Book("はじめての機械学習","中村健一" , 900 ,3500);
		book1.showInfonum();
		book2.showInfonum();
		book3.showInfonum();
		book4.showInfonum();
		book5.showInfonum();

	}

}
