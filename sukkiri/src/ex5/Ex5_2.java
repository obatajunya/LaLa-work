package ex5;

public class Ex5_2 {
	public static void main(String[] args) {
		email("aaaa", "aaa");
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "以下のメールを送信しました");
		System.out.println("件名" + title);
		System.out.println("本文" + text);

	}

	public static void email(String address, String text) {
		System.out.println(address + "以下のメールを送信しました");
		System.out.println("件名: 無題");
		System.out.println("本文" + text);

	}
}