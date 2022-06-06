package v3;

public class Main {

	public static void main(String[] args) {
		Com com1 = new Com(new RandomNextHand());
		com1.setName("あなた");

		User user = new User(new InputNextHand());
		user.setName("わたし");
		
		com1.setHand();
		user.setHand();
		Game game = new Game();
		game.judge(com1, user);
		game.dispResult(com1, user);
//		System.out.println(com1);
//		System.out.println(user);
		
		
	}

}
