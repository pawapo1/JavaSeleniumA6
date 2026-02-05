package Scanner;
import java.util.Scanner;
public class Scanner_class {
	public static void main(String[] args) {
		//create an instance for scanner class
		Scanner scan=new Scanner(System.in);
		//System.out.println("Read the string input data from user");
		//String s=scan.nextLine();
		//System.out.println(s);
	System.out.println("Read the integer input data from user");
	int a=scan.nextInt();
	System.out.println(a);
	System.out.println("Read the double input data from user");
	double b=scan.nextDouble();
	System.out.println(b);
	System.out.println("Read the short input data from user");
	short c=scan.nextShort();
	System.out.println(c);
	System.out.println("Read the byte input data from user");
	byte d=scan.nextByte();
	System.out.println(d);
	System.out.println("Read the float input data from user");
	float e=scan.nextFloat();
	System.out.println(e);
	System.out.println("Read the boolean input data from user");
	boolean f=scan.nextBoolean();
	System.out.println(f);
	
	}}

