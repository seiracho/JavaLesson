package jp.co.aforce.practice;

public class PracticeTest5 {

	public static void main(String[] args) { */
		// TODO 自動生成されたメソッド・スタブ
		//1
		/*回答:Randomのインポート(はじめインスタンス化が
		 * うまくいかんかったから、クラスファイルを変えなければと思ったので
		 * クラスファイル名でインスタンス化しようとした)
		 * 
		 */
		PracticeTest5 random = new PracticeTest5();
		int fortune = random.nextInt();//nextInt()に数値入れないといけないっぽい(それなら出力させとけばよかった)
		//String result ="";
		switch (fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉");
			break;
		case 3:
			System.out.println("大吉");
			break;
		default:
			System.out.println("凶です");
			break;
		//System.out.println(result);
			
			
		
		//2
		System.out.print("問題２\n");
		for (int num = 1; num < 100; num++) {
			if (num % 7 == 0) {
				if (num < 98) {
					System.out.print(num +",");
				}else {
					System.out.print(num +"\n\n");
				}
			}
		}
		
		//3
		System.out.print("問題３\n");
		for (int i = 1; i <= 9; i++) {
			for(int e = 1; e <= 9; e++) {
				System.out.print(i * e);
			}
			System.out.println();
		}

	}

}
