package jp.co.aforce.test;

import java.util.Scanner;
//問7
public class Fee {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("年齢を入力してください");
		int age = sc.nextInt();
		String msg;
		if (age <= 3) {
			msg = sc.nextInt() +":" +"料金は無料です";
		} else if (age > 4 && age < 12){
			msg = sc.nextInt() +":" +"500円です";
		} else if (age > 13 && age <17) {
			msg = sc.nextInt() +":" +"800円です";
		} else if (age > 18 && age < 59) {
			msg = sc.nextInt() +":" +"1200円です";
		} else if (age >= 60) {
			msg = sc.nextInt() +":" +"700円です";
		} else {
			msg = sc.nextInt() +":" +"不可";
		}
		System.out.println(sc.nextInt() +":" +msg);
		sc.close();
	}

}
