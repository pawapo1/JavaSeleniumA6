
/*package methods;

public class demo_1 {
	public static void message()
	{
		System.out.println("Good Evening, Happy Ganesh Chaturthi:)");
	}
	public static void main(String[] args) {
		
		message();
		
}}*/
//Write a java program to  create a table using method 
/*package methods;

public class demo_1 {
	public static void table(int a)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+"X"+i+"="+(a*i));
		}
	}
	public static void main(String[] args) {
		
		table(5);
		System.out.println("**********");
		table(3);
		
}}*/

//Write a java program to accept number to check the no is positive negative or 0

/*package methods;

public class demo_1 {
	public static void number(int a)
	{
		if(a>0)
		{
			 System.out.println("Number is positive");
		}
		else if(a<0)
		{
	    System.out.println("Number is Negative");
		}
		 else
		 {
			 System.out.println("Number is 0");
	}}
	public static void main(String[] args) {
		
		number(10);
		}}*/




//Write a java program can accept an integer number and print its character value 

/*package methods;

public class demo_1 {
	public static void number(int a)
	{
	char ch=(char)a;
	System.out.println(ch);
		}
	public static void main(String[] args) {
		
		number(48);
		number(85);
		number(90);
		}}*/
//write a java program to create a method which can print simple calculator menu.

/*package methods;

public class demo_1 {
	public static void menu()
	{
	
	System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
	
		}
	public static void main(String[] args) {
		
		menu();
		menu();
		
		}}*/
//print sum of 3 numbers
/*package methods;

public class demo_1 {
	public static void sum(int a,int b,int c)
	{
	
	System.out.println("Sum of given number is :"+(a+b+c));
	
		}
	public static void main(String[] args) {
		
		sum(45,50,8);
		
		}}*/



//Bank application check the current balance,credited amount ,debited ammount
/*package methods;

public class demo_1
{
		public static void ShowBalance(double bal)
{
		System.out.println("current balance :"+bal);
}
		public static double deposit(double bal,double amount)
{
			bal=bal+amount;
			System.out.println("Amount created:"+amount);
			return bal;
	}
		public static double withdraw(double bal,double amount)
{
	        bal=bal-amount;
			System.out.println("Amount debit:"+amount);
		    return bal;
}
	    public static void main(String[] args) {
		double balance=3000;
		ShowBalance(balance);
		balance=deposit(balance,1000);
		ShowBalance(balance);
		balance=withdraw(balance,2000);
	    ShowBalance(balance);
}}*/


//design a method which can accept a number and return its character value 

/*package methods;

public class demo_1 {
	public static char number(int a)
	{
	//char ch=(char)a;
	return (char)a;
		}
	public static void main(String[] args) {
		
		System.out.println(number(65));
		
		}}*/

//Write a java program to design a method which can accept a number to 
//check if a number is even or odd and returns if even or odd
/*package methods;
public class demo_1 {
	public static String evenodd(int a)
	{
	if(a%2==0)
	return "Even";
	else
return "odd";
	}
public static void main(String[] args) {
	System.out.println(evenodd(6));
	}}*/







//design a method which can accept a number and returns whether the number is positive or negative 
/*package methods;

public class demo_1 {
	public static String number(int a)
	{
		if(a>0)
		{
			 return a+ " is positive number";
		}
		else if(a<0)
		{
			return a+ " is negative number";
		}
		 else
		 {
			 return a+" is Zero";
	}}
	public static void main(String[] args) {
		System.out.println(number(100));
		System.out.println(number(-100));
		System.out.println(number(0));
		}}*/


//Write a java program to design a method which can accept a number and returns the sum of all digits
/*package methods;

public class demo_1 {
	public static int digitsum(int n )
	{
   int sum=0;
   while(n>0)
{
	int rem=n%10;
	sum=sum+rem;
	n=n/10;
	}
   return sum;
	public static void main(String[] args) {
		int n1=123;
	    int n2=345;
		System.out.println("sum of digits of"+"n1+:"digitsum(n1));
		}}*/
	
	
	//design a method which can accept a number and returns whether the number is pyalindrom or not 
package methods;

public class demo_1 {
	public static int reversed_number(int num)
	{
	int reversed=0;
	while ( num!=0)
	{
		int digit=num%10;
		reversed=reversed*10+digit;
		num=num/10;
	}
	return reversed;
	}	
	public static void main(String[] args) 
	{
		int num = 1567;
		if(num==reversed_number(num))
		{
		System.out.println(num+" Number is palindrom.");
		}
		else 
		{
		System.out.println(num+" Number is not palindrom.");
		}
	}
	}






















