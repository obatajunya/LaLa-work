package world;

public class Wand {
	
	private String name;
	private double power;
	
//	public Wand(String name) {
//		setName(name);
	//}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException
			("杖に設定されようとしている名前が異常です。");
		}
		this.name = name;
	}
	public double getPower() {return this.power;}
		public void setPower(double power) {
		if (power >= 0.5 && power <= 100.0) {
			
		} else {
			//String msg = "増幅率は 0.5～100.0";
			throw new IllegalArgumentException
			("増幅率は 0.5～100.0");
		}
		this.power = power;
	}
		
	
	
}
