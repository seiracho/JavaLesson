
public class ifpractice {
	public static void main(String args []) {
		
		
	//if文
	int a = 50;
	int b = 50;
	if (a == b) {
		System.out.println("aとbの値は同じ");
	}
	
	
	//if文 boolean 変数型だけで判定可能
	boolean isRainy = true;
	if (isRainy) {
		System.out.println("傘を持っていきましょう");
	}
	
	
	//else文
	int temperature = 25;
	if(temperature >= 30){
		System.out.println("真夏日です");
	} else {
		System.out.println("真夏日ではありません");
	}
	
	
	//if else文
	int score = 75;
	if (score >= 80) {
		System.out.println("優");
	//elseにも条件がある場合「else if」
	} else if (score >= 70) {
		System.out.println("良");
	} else if (score >= 60) {
		System.out.println("可");
	//もし～だったらという条件がもうない場合（その他で区別したい場合）はelse
	} else {
		System.out.println("不可");
	}
	
	
	//if文 論理演算子との組み合わせ
	int time = 14;
	boolean isHoliday = false;
	// &&…且つ
	if (time >= 9 && time <= 18 && !isHoliday) {
		System.out.println("勤務時間内です");
	} else {
		System.out.println("勤務時間外です");
	}
	
	
	/*  条件変えて…「if 休日又は9-18時以外 だったら」
	 *  ||…又は 
	 */
	if (isHoliday || time  <= 9 && time >= 18) {
		System.out.println("勤務時間内です");
	} else {
		System.out.println("勤務時間外です");
	}
	
	
	//if文 入れ子
	boolean hasLicence = true;
	boolean hasCar = true;
	if (hasLicence) {
		System.out.println("運転免許を持っています");
		if (hasCar) {
		System.out.println("車も持っています");
	} else {
		System.out.println("しかし、車は持っていません");
	}
	} else {
		System.out.println("運転免許を持っていません");
	}
	
	
	//Switch構文
	String color = "yellow";
	String message;
	switch (color) {
			case "red":
				message = "停止してください";
				break;
			case "yellow":
				message = "注意してください";
				break;
			case "green":
				message = "進んでください";
				break;
			default:
				message = "不正な信号の色です";
		}
	System.out.println("現在の信号:" + color + " - " + message);
	
	}
	
	
	
	
	
	
	
	

}
