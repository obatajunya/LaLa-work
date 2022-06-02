package ex11;

public class TangibleAsset extends Asset{
						   implements Thing {
						   String color;
						   double weight;

	public TangibleAsset(String name, int price, String color ) {
		super(name,price);
		this.color = color;
		
	}
	
	
	public String getColor() {
		return this.color;
	}
	
	public double getWeight() {
		return this.getWeight();
	}
	
	public void setWeight(double weight) {
		this.weight = weight;}
	}
}
