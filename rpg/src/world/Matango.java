package world;

public class Matango {
	public int hp = 50;
	public char suffix;
	
	public Matango() {
		this.suffix = 'A';
	}
	public void attack(Hero h) {
		System.out.println
		("キノコ" + this.suffix + "の攻撃");
		System.out.println(h.name + "に10のダメージ");
		h.hp = h.hp - 10;
		System.out.println(h.name + "のHP:" + h.hp);
	}

}
