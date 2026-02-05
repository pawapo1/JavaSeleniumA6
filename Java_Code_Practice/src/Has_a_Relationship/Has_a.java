package Has_a_Relationship;

public class Has_a {
	 private String colour;
	private String brand;
	private double price;
	Engine engine=new Engine();
public void drive(String colour,String brand,double price) {
	this.colour=colour;
	this.brand=brand;
	this.price=price;
	
}
	public void display() {
		System.out.println(colour);
		System.out.println(brand);
		System.out.println(price);
		System.out.println(engine.getCc());
		System.out.println(engine.getPower());
	}

}
