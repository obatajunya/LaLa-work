package ex5;

public class Ex5_4 {
	public static void main(String[] args) {
		double area1 = calcTriangleArea(10.0, 5.0);
		System.out.println("底辺:" + bottom +
				"高さ:" + height + 
				"の三角形の面積は " + area1 + "平方cmです");
		
		double radius = 5.0;
		double area2 = calcCircleArea(radius);
		System.out.println("半径" + radius + "cm の" +
		"円の面積は" + area2 + "平方cmです");
	}
	
	public static double calcTriangleArea(double bottle,
										  double height) {
		return bottle * height / 2.0;
				
	}
	
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
		
	}
}
