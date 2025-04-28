public class Dog extends Animal {
    /*public Dog(String name) {
        // 親クラスのコンストラクタを呼ぶ
        super(name); 
    }

    @Override
    public void speak() {
        System.out.println(name + " はワンワン！と吠えます。");
    }*/
	
	public Dog(String name) {
		super(name); //Animalクラスのnameをセット(Super(name)で親クラスのname値をセット)
	}
	@Override
	public void makeSound() {
		System.out.println("one...");
	}
}
