package chap12;

import world.Matango;
import world.Wizard;

public class Main471 {

	public static void main(String[] args) {
		
		Wizard w = new Wizard();
//		if (c instanceof Wizard) {
//			System.out.println("いいよ");
//		}
//		Wizard w = (Wizard)c;
		Matango m = new Matango();
		w.setName("アサカ");
		w.attack(m);
		w.fireball(m);
		
//		if (c instanceof Hero) {
//			Hero h = (Hero) c;
//			h.attack(m);
//		} else {
//			System.out.println("cのインスタンスはHeroでない");
//		}
		
	}

}
