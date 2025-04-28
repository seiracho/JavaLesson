
/*public class Student extends Person {
		private String studentId;
		
		public String getStudentId() {
			return studentId;
		}
		
		public void setStudentId(String newId) {
			studentId = newId;
		}
}*/

//20250425 問3
public class Student {
	String name; //名前を入れる箱(変数)
	int[] scores; //成績をまとめて入れる箱(配列) int[]：整数をいくつもまとめて持てる箱(配列)
	
	public void setAverage() {
		
	}
	
	//平均を取得するメソッド
	public double getAverage() { //double：getAverageメソッドの戻り値の型
		int sum = 0;//合計を求める(sumは合計用の変数)
		for (int score : scores) { //拡張for文 scoreの中身を取り出してscoresに入れる
			sum = sum + score; //合計にscoreを足していく
		}
		System.out.println(scores.length); //score.length：配列の長さ(要素数)　lengthはプロパティ
		return (sum / scores.length);
	}
	
	/*public static void main(String args[]) {
		int[] score = {82, 73, 86, 77, 80};
		String name = "あ";
		Student student1 = new Student(score,name);
		//student1.getAverage();
		System.out.println(student1.getAverage());
		System.out println(student1.score);
		Systme.out.println(student1.name);
		
		
		
	}*/
	
	
	
}
