//オーバライド問2
public class Personoverride {
	String name;
	int age;
	
	@Override
	public String toString() {
		return "名前：" + name + "年齢：" +age;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Personoverride person = new Personoverride();
		person.name = "gou";
		person.age = 22;
		System.out.println(person.toString());
	}

}
