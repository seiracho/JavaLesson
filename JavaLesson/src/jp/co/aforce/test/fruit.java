package jp.co.aforce.test;

import java.util.ArrayList;

//問8
public class fruit {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> fruitList = new ArrayList<>();
		fruitList.add("リンゴ");
		fruitList.add("バナナ");
		fruitList.add("さくらんぼ");
		
		fruitList.remove(1);
		fruitList.add("オレンジ");
		System.out.println(fruitList);

	}

}
