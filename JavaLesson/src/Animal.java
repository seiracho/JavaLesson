public class Animal {
  
	protected String name; //protected:子クラス(Dog)からアクセス可能
	
	public Animal(String name) { //コンストラクターが引数（名前）を一つずつ取るよう定義
		this.name = name;
	}
	
    public void makeSound() {
    	System.out.println("鳴き声");
    }
    
    public static void main(String args[]) {
    	//ここで大事なのはnew Dog(インスタンス化した)だけど、それを変数(animal1)で定義して＝にしている
    	Dog animal1 = new Dog("dog"); 
    	Cat animal2 = new Cat("cat");
    	animal1.makeSound();
    	animal2.makeSound();
    }
    
    
}
