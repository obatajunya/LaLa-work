package v3;

import java.util.Scanner;

public class InputNextHand implements NextHand {

	@Override
	public int decideHand() {
		System.out.println("手を洗濯してください");
		System.out.println("0:グー 1:チョキ 2:パー");
		System.out.println(" > ");
		@SuppressWarnings("resource")
		int hand = new Scanner(System.in).nextInt();
		return hand;
	}

}
