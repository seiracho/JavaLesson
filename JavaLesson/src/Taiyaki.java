
public class Taiyaki {
	String Filling;
	
	//中身をセットするメソッド
	public void setFilling(String value) {
		Filling = value;
	}
	
	//中身表示メソッド
	public void showFilling() {
		System.out.println("このたい焼きの中身は" + Filling + "です");
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//インスタンス化
		Taiyaki taiyaki1 = new Taiyaki();
		Taiyaki taiyaki2 = new Taiyaki();
		
		//代入メソッド
		taiyaki1.Filling = "クリーム";
		taiyaki2.Filling = "あんこ";
		
		//showFillingメソッドの呼び出し
		taiyaki1.showFilling();
		taiyaki2.showFilling();
	}

}
