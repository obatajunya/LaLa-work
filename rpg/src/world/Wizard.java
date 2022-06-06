package world;

public class Wizard {
	private int hp;
	private int mp;
	
	private String name;
	private Wand wand;
	
	public void heal(Hero h) {
		int basePoint = 10;
		int recoverPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recoverPoint);
		//h.hp = h.hp + 10;
		System.out.println(h.getName() + "のHPを" + recoverPoint +  "回復した.");
	}
	
	public int getHp() { return this.hp;}
	
	public void setHp(int hp) {this.hp = hp;}
	
	public int getMp() { return this.mp;}
	
	public void setMp(int mp) {this.mp = mp;}
	
	public String getName() {return this.name;}
	
	public void setName(String name){
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException
			("杖に設定されようとしている名前が異常です。");
		}
		this.name = name; 
		}
	
	public Wand getWand() {return this.wand;}
	
	public void setWand(Wand wand) {
	if (wand == null) {
		throw new IllegalArgumentException
			("設定されようとしている杖がnullです");
	}
	this.wand = wand;
	}
	
	//@Override
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}
	
	public void fireball(Matango m) {
		System.out.println(this.name + "火の玉をはなった");
		System.out.println("敵の20ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}
}
