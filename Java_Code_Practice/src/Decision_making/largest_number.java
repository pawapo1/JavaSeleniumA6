//1)write a java program to find the largest number among three numbers
package Decision_making;

public class largest_number {
public static void main(String[] args) {
		
		int a=56;
		int b=80;
		int c=908;
		if(a>=b&&a>=c) 
		{
		System.out.println(a + "  is greater");
		}
		else if(b>=a&&b>=c) 
		{
			System.out.println(b + "  is greater");
			}
		
	else	
		System.out.println(c +  " is greater");
	}

}

