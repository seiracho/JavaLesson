

import java.util.Scanner;//Scannerを使うためのインポート

/*Javaプログラムの例*/
public class Caluculator {
	public static void main(String[] args) {
		/*計算*/
		int a = 1;
		int b = 2;
		int c = a + b; //cは3になる
		/*計算した結果の表示*/
		System.out.println("1 + 2 =" + c);
	
/*基礎②演習問題*/
       int num = 10;
       System.out.println(num);

		int a2 = 8;
	    int b2 = 5;
	    int sum = a + b;
	    System.out.println(a2 + "+" + b2 + "=" + sum);
	
		int width = 7;
		int height = 4;
		int area = width * height;
		System.out.println(area);
	
		String name = "Java";
		double version = 17.0;
		boolean isFun = true;
		System.out.println(name);
		System.out.println(version);
		System.out.println(isFun);
	
		
		Scanner scanner = new Scanner(System.in);//Scannerオブジェクトを作成
		System.out.print("名前の入力を受け取る");
		String name2 = scanner.nextLine();//ユーザーの情報を受け取る
		System.out.println("こんにちは、" + name2 + "さん!");
		// 入力処理を行う
		scanner.close();//Scannerを閉じる
	}

}
