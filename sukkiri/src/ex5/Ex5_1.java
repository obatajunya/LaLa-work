package ex5;

public class Ex5_1 {

	public static void main(String[] args) {
		introduceOneself();
	}
	
	public static void introduceOneself() {
		System.out.println("名前は？");
		String name = new java.util.Scanner(System.in).nextLine();
		String outputName = "名前は" + name + "です。";
		System.out.println(outputName);
		
		System.out.println("年齢は？");
		String name = new java.util.Scanner(System.in).nextLine();
		String outputName = "名前は" + name + "です。";
		System.out.println(outputName);
	}

}
