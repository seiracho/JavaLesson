
public class constracter {
	String name;
	int age;
	//コンストラクタ―の定義 のフィールドに引数として渡されたname,ageを初期値として設定
	public constracter(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//メソッド
	public void displayInfo() {
		System.out.println("name:" + name +"age:" + age);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		constracter person = new constracter("張" , 22);
		person.displayInfo();

	}

}
