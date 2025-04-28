
/*public class Main1 {
	public static void main(String args[]) {
		AnimalDogCat animaldogcat = new Animal1();
		Dog1 dog1 = new Dog1();
		Cat1 cat1 = new Cat1();
		
		Animal1.makeSound();
		Dog1.makeSound();
		Cat1.makeSound();
		
		Person p = new Person("田中", 25);
	}

}

}*/
//20250428　staticフィールド
public class Main1{
	//フィールド(クラスが持っているデータ(変数))
	//p1,p2のhpをそれぞれ作成
	public int hp1 =100;//staticフィールドを使いたい場合は型(int)の前にstaticを入れる
	public int hp2 =100;
	
	public static void main(String args[]) {
		
		Main1 p1 = new Main1();
		Main1 p2 = new Main1();
		
		
		System.out.println("初期状態：");
		System.out.println("p1.hp =" +p1.hp1);
		System.out.println("p2.hp =" +p2.hp2);
		
		p1.hp1 -= 30;
		System.out.println("ダメージ後:");
		System.out.println("p1.hp =" +p1.hp1);
		System.out.println("p2.hp =" +p2.hp2);
		
	}
}