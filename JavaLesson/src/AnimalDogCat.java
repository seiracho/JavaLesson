//親クラス：AnimalDogCat
public class AnimalDogCat {
	void makeSound(){
		System.out.println("Some sound...");
	}
}

//子クラス：Dog
class Dog1 extends AnimalDogCat{
	@Override
	void makeSound() {
		System.out.println("雄叫び");
	}
}

//子クラス：Cat
class Cat1 extends AnimalDogCat{
	@Override
	void makeSound() {
		System.out.println("叫び");
	}
}