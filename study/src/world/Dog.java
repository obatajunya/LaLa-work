package world;

public class Dog extends Animal{
	
	public void roar() {
		System.out.println(this.getName() + "吠えた.");
		System.out.println("hpが1使った");
		this.setHp(this.getHp() -1);
	}
}
