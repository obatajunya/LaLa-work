package chap05;

public class Main05_2 {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		String msg = "五郎さん、こんにちは";
		hello(msg);
		System.out.println("メソッドの呼び出しを終了しました。");
		int x = 100;
		int y = 10;
		//int ans = add(x, y);
		System.out.println(x + "+" + y + "=" + add(x, y));
	}
	public static void hello(String msg) {
		System.out.println(msg);
	}
	
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}

}
