package ex4;

public class Ex4_4 {
	public static void main(String[] args) {
//		int[] numbers = {3, 4, 9};
//		System.out.println("1桁の数字を入力してください");
//		int input = new java.util.Scanner(System.in).nextInt();
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] == input) {
//				System.out.println("アタリ");
//			} else {
//				System.out.println("ハズレ");
//			}
//		}
		int[] numbers = new int[2];
		numbers[0] = new java.util.Random().nextInt() + 1;
		do {
		
			numbers[1] = new java.util.Random().nextInt() + 1;
		}while(numbers[0] == numbers[1]);
		int input = new java.util.Scanner(System.in).nextInt();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == input) {
				System.out.println("アタリ");
				break;
			} else {
				System.out.println("ハズレ");
			}
	}
	

	}
}
