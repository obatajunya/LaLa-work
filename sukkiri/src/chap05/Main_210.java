package chap05;

public class Main_210 {

	public static void main(String[] args) {
		int[] x = {100, 200, 300};
		methodA(x);
//		System.out.println("main:" + x[0]);
		for (int i : x) {
			System.out.println(i);
		}

	}

	public static void methodA(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
		//arr[0] = 1000;
		//System.out.println("methodA:" + x);
	}
}
