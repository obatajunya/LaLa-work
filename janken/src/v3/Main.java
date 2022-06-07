package v3;

public class Main {

	public static void main(String[] args) {
		System.out.println("NINZU:" + Const.NINZU);
		//Com com1 = new Com(new RandomNextHand());
		Com com1 = new Com(new CleverNextHand());
		com1.setName("あなた");
//		com1.setHand();
//		com1.setResult("draw");
//		com1.setNextHand(new CleverNextHand());
		
		User user = new User(new InputNextHand());
		user.setName("わたし");
		
		Game game = new Game();
		do {
			com1.setHand();
			user.setHand();
			game.judge(com1, user);
			game.dispResult(com1, user);
		} while (game.isNext());
		System.out.println("bye!");
		
	}

}
