package jp.co.aforce.test;

import java.util.ArrayList;

//問10
public class TaskId {
	String a;
	String b;
	
	public TaskId(String a, String b) {
		this.a = a;
		this.b = b;
	}
	void contain() {
		if (a == task) {
			System.out.println("タスクID 'TASK003' は既に処理済みです。");
		} else {
			System.out.println(" タスクID 'TASK003' は未処理です。");
		}
		if (b == n) {
			System.out.println("タスクID 'TASK005' は既に処理済みです。");
		} else {
			System.out.println(" タスクID 'TASK005' は未処理です。");
		}
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> task = new ArrayList<>();
		task.add("TASK001");
		task.add("TASK002");
		task.add("TASK003");
		task.add("TASK001");
		task.add("TASK004");
		task.add("TASK002");
		System.out.println("処理済みのタスクID一覧:");
		System.out.println("-" +task +"\\r");
		TaskId taskid = new TaskId("TASK003","TASK005");
		taskid.contain();
	

	}

}
