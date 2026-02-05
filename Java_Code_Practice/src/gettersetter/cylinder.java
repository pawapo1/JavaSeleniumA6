package gettersetter;

public class cylinder {
private int height;
private int radius;
cylinder(int height,int radius){
	this.height=height;
   this.radius=radius;
	}
	//public void setradius(int b) {
	//	this.radius=b;}
	public int getradius() {
		return radius;
	}
	public int getheight() {
		return height;
	}
	public static void main(String[] args) {
		cylinder C=new cylinder(4,5);
		//C.setheight(4);
		System.out.println(C.getheight());
		//C.setradius(6);
		System.out.println(C.getradius());
		
	}
}

