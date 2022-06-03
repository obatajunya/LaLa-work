package world;

public class Hero{
	//public String name;
	//public String name = "ミナト";
	private int hp;
	private String name;
	private Sword sword;
	
	public Hero() {
		System.out.println();
	}
	public Hero(String name) {
		//this.name = name;
	}
	
	public int getHp () {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "眠って回復した");
	}
	
	public void die() {
		System.out.println(this.name + "は死んだ");
		System.out.println("GAMEOVERです");
	}

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃!");
		m.hp = m.hp -5;
		System.out.println("敵に5ポイントのダメージを与えた");
		System.out.println("おばけキノコ" + m.suffix + "から２ポイントの反撃を受けた");
		this.hp = this.hp -2;
		if (this.hp <= 0) {
			this.die();
		}
	}
	
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		
	}
	
}
