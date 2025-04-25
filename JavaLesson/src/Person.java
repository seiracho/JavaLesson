/*直接やに触らせない＝安全性↑
 * setAge()にチェックを入れられる＝変な値を防げる
 * getterとsetterを用意することで使いやすく変更しやすくなる
 * 使うにはMainクラスが必要
 * */


//class(設計図)でPersonを定義
class Person {
	//フィールド(変数)：個人の名前と年齢を保存する箱
	private String name;//Private…この変数はこのクラスの中からのみ使用可能
	private int age;//Private 型 変数名
	
	// コンストラクタ：新しい「Person」を作るときに使うメソッド(自動的)
	/* public:どこからでも使える(アクセスルール) 
	 * (String name, int age):名前と年齢を受け取り初期設定
	 * */
	public Person (String name , int age) {
		this.name = name;//Personクラスの中のnameを指す 引数(外から受け取った)nameを中のnameに代入
		this.age = age;//this：クラス内の変数
	}
	
	//nameのgetterとsetter：外部から名前を取り入れ(読み書き)可能に
	//getName:名前を外から読むためのメソッド
	public String getName() { 
		return name; //この人の名前を返すよ
	}
	
	//setName:名前を外から書き換えるためのメソッド
	//String name:新しい名前受け取る
	public void setName(String name) {
		this.name = name; //中のnameに代入
	}
	
	//ageのgetterとsetter：外から年齢を取り入れ(読み書き)可能に
	public int getAge() { //年齢読み取るためのメソッド
		return age;
	}
	
	public void setAge(int age) { //年齢を書き換えるためのメソッド
		if (age >= 0) { //0歳以上だけ受け取る マイナスの年齢はエラー
			this.age = age;
		}
	}
}
		
		
