package world;

public class Dog extends Animal{
	
	public void roar() {
		System.out.println(this.name + "吠えた.");
		System.out.println("hpが1使った");
		this.hp = this.hp -1;
	}
}
