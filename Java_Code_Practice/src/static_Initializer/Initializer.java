package static_Initializer;

public class Initializer {
static int a=Start();
	public static void main(String[]args) {
	System.out.println("Good Morning");
	System.out.println(b);
	System.out.println(a+b);
	System.out.println(b-c);
	
}
	public static int Start() {
		System.out.println(a);
		a=20;
		System.out.println("a"+a);
		return a;
	}
	static int b=Middle();
	public static int Middle() {
		System.out.println(b);
		b=10;
		System.out.println("b"+a);
		return a-b;
		}
	static int c=End();
	public static int End() {
		System.out.println(c);
	    System.out.println("c"+b);
		return 5;
}}
