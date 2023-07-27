package GitDemo.GitDemo;

public class Car {
	
	
	String name;
	int price;
	String color;
	int wheels =4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car c1 = new Car ();
		c1.name ="maruti 800";
		c1.price = 900000;
		c1.color ="Blue";
		
		System.out.println(c1.name + " "+c1.price + " "+ c1.color);
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.color = "White";
		c2.wheels =4;
		c2.price =000;
		
		System.out.println(c2.name + " "+ c2.color + " " + c2.wheels + " "+ c2.price);
		
	}

	
	
}
