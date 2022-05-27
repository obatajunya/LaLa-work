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
		int age = new java.util.Scanner(System.in).nextInt();
		String outputInt = "年齢は" + age + "です。";
		System.out.println(outputInt);
		
		System.out.println("身長は？");
		float height = new java.util.Scanner(System.in).nextInt();
		String outputHeight = "身長は" + height + "です。";
		System.out.println(outputHeight);
		
		System.out.println("干支は?");
		String zodiac = new java.util.Scanner(System.in).nextLine();
		String outputZodiac = "干支は" + zodiac + "です。";
		System.out.println(outputZodiac);
	}

}
