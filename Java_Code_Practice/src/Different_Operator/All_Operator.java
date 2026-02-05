/*Write a java program to calculate student marks[take 2 student ]
1)take 3 subject marks
2)find total and average 
3)check if student is pass/fail(if pass=print true/if fail=print false)*/
/*package Different_Operator;

public class Combine_Operator {
	public static void main(String[] args) {
	//student1
		int s1=40;
		int s2=30;
        int s3=10;
        double Avg=(s1+s2+s3)/3;
        System.out.println(("Student1 is:")+(35>=Avg));
      //student2
      		int s1=10;
      		int s2=10;
              int s3=30;
              double Avg=(s1+s2+s3)/3;
              System.out.println(("Student1 is:")+(35>=Avg));
      		
	
	}
}*/
	
/*Write the Java program to check Eligibility for discount on total bill 
  1.take prices for all items and find total.
  2.check if total amount is more or same as 3000rs or if the customer is a memeber.
  3.if eligible for discount print true or else print false
 */


package Different_Operator;
public class All_Operator {
	public static void main(String[] args) {
	//Items list
		boolean is_member=false;
		double I1=50.24,I2=100.10,I3=1000,I4=500.45;
		double Bill_Amount=I1+I2+I3+I4;
		System.out.println("Eligible for discount:"+(Bill_Amount>=3000 || is_member) );
		
		
		double s1=50.24,s2=100.10,s3=3000,s4=500.45;
		double Bill_Amount1=s1+s2+s3+s4;
		System.out.println("Eligible for discount:"+(Bill_Amount1>=3000 || is_member) );
		
		
}}


/*Write the java program to print true if the number is even and print false if the number is odd

package Different_Operator;

public class Combine_Operator {
	public static void main(String[] args) {
		
		System.out.println("Even:" +(7%2==0));
		//System.out.println("Odd:" +(7%2==0));
	}
	}*/












