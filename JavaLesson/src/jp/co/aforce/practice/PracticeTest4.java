package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.List;

public class PracticeTest4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//2-3
		//回答とは違うけど、出力はできている
		List<String> animalList = new ArrayList<String>();
			animalList.add("犬");
			animalList.add("猫");
			animalList.add("うさぎ");
			animalList.add("へび");
			String name ="シャチ";
			if (animalList.contains("シャチ")) {
				System.out.println(name + "はリストに含まれています");
			} else {
				System.out.println(name + "はリストに含まれていません");
			}
		
			
			

	}

}
