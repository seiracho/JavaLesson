package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeTest3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1-2
		/*間違えた 文字列型で回答するべきだった
		 * →商品データを収納しなさいに気を取られた？
		 * 回答：String study = {"シャープペンシル","ボールペン","リングノート","クリップ"."消しゴム"}
		 * 
		 * */
		List<String> studyList = new ArrayList<String>();
		studyList.add("シャープペンシル");
		studyList.add("ボールペン");
		studyList.add("リングノート");
		studyList.add("クリップ");
		studyList.add("消しゴム");
		String element1 = studyList.get(1);
		System.out.println(element1);
		//3-5
		List<String> psList = new ArrayList<String>();
		psList.add("山田太郎");
		psList.add("鈴木花子");
		psList.add("佐藤二朗");
		psList.add("山田太郎");
		psList.add("高橋三郎");
		/*一応出力はできているが、回答のほうが適切
		 * 回答：System.out.println(employee.get(2));
		 */
		String element2 = psList.get(2);
		System.out.println(element2);
		//6
		//あっているけど、list3は別の変数名のほうが分かりやすい
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(15);
		list1.add(16);
		list1.add(19);
		ArrayList<Integer> list2 = new ArrayList<>();
		list1.add(11);
		list1.add(12);
		list1.add(18);
		list1.add(20);
		list1.addAll(list2);
		Collections.sort(list1);
		System.out.println(list1);
		for (Integer list3 :list1) {
			System.out.println(list3);
		}
		//7
		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(13);
		list4.add(14);
		list4.add(17);
		list4.add(21);
		for (Integer list5 :list4) {
			System.out.println(list5);
		}
		
		

	}

}
