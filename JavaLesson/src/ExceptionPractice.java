
public class ExceptionPractice {

	public static void main(String[] args) {
		
		// TODO 自動生成されたメソッド・スタブ
		//String str = null;
		//複数可能性がある場合、1つのtry-catch内に含める
		try {
		//エラーが発生する可能性がある処理
			int[] nums = {1,2,3};
			System.out.println(nums[5]);
			//errorをthrow(投げる) Illegal:不正
			int age =15;
			if (age < 18) {
			throw new IllegalArgumentException("引数が不正です(18歳未満は登録不可)");
			}
			//System.out.println(str.length()); //ヌルポ発生
		} catch (NullPointerException e){ //()内にはエラーの型+Exception(例外)
		//エラーが起きた時に実行する処理
			System.out.println("ヌルポ発生:" + e.getMessage());
		} catch (IllegalArgumentException e){
			System.out.println("例外発生:" + e.getMessage());
		} finally {
		//エラーがあってもなくても最後に実行する処理
			System.out.println("プログラムは継続します");
		}
		//System.out.prnitln("プログラムは継続します"); finally内で出力しない場合はここで出力
	}

}
