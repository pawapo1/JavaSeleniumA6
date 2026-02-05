/*package Different_Operator;
public class Operator {
public static void main(String[] args) 
{
	//pref variables
	String brand="Nokia";
	double budget=2000;
	//Mobile List
	//first
	String m1Brand="samsung";
	double m1price=3487;
	//second
	String m2Brand="Nokia";
	double m2price=34870;
	//third
		String m3Brand="Nokia";
		double m3price=1999;
		System.out.println("First mobile can we buy? " + (brand==m1Brand && budget>=m1price));
		System.out.println("Second mobile can we buy? " + (brand==m2Brand && budget>=m2price));
		System.out.println("Third mobile can we buy? " + (brand==m3Brand && budget>=m3price));
		}
        }*/
//write the program to select the watch based on brand preference by using logical OR operator 
/*package Different_Operator;
public class Operator {
public static void main(String[] args) 
{
	//pref variables
	String brand1="Apple";
	String brand2="Rollex";
	//Mobile List
	//first
	String w1Brand="Apple";
	
	//second
	String w2Brand="Rollex";
	
	//third
		String w3Brand="Titan";
		
		System.out.println("First mobile can we buy? " + (brand1==w1Brand || brand2==w1Brand));
		System.out.println("First mobile can we buy? " + (brand1==w2Brand || brand2==w2Brand));
		System.out.println("First mobile can we buy? " + (brand1==w3Brand || brand2==w3Brand));
		}
        }*/

//Write the program to check withdrawal Eligibility using  logical operator
//e.g user can withdraw money only when their balace is more than 1000rs & they are not blocked 
/*package Different_Operator;
public class Operator {
public static void main(String[] args) 
{
	//pref variables
	double balance =1000;
	String user=" Not Blocked";
	//Mobile List
	//first
	double pooja=1000;
	String user1=" Not Blocked";
	
	//second
	double Nikita=1000;
	String user2="Blocked";
	
	//third
	double Gunjan=500;
	String user3=" Not Blocked";
		
		System.out.println("user can withdraw money?  " + (pooja>=balance && user==user1));
		System.out.println("user can withdraw money? " + (Nikita>=balance && user==user2));
		System.out.println("user can withdraw money? " + (Gunjan>=balance && user==user3));
		}
        }*/

//write a java program to check if user is a premium user or they have a promo-code .

/*package Different_Operator;
public class Operator {
public static void main(String[] args) 
{
	//pref variables
	String User ="PremiumUser";
	boolean ispromocode;
	
	//first
	String User1 ="PremiumUser";
	ispromocode=false;	
	//second
	String User2 ="PremiumUser";
	ispromocode=true;
	
	//third
	String User3 ="NotPremiumUser";
	ispromocode=false;
		
		System.out.println("user is a premium user or they have a promo-code  " + (User==User1 || ispromocode));
		System.out.println("user is a premium user or they have a promo-code " + (User==User2|| ispromocode));
		System.out.println("user is a premium user or they have a promo-code " + (User==User3 || ispromocode));
		}
        }*/

//NOT operator Example1
/*package Different_Operator;
public class Operator {
public static void main(String[] args) 
{
	//pref variables
	String dish1 ="karla";
	String dish2 ="mashroom";
	//first
	String D1 ="panner";
	//second
	String D2 ="karla";
	//third
	String D3="mashroom";
	//FOURTH
		String D4="panipuri";
		
		System.out.println("User can eat panner " + !(dish1==D1 || dish2==D1));
		System.out.println("User can eat karla " + !(dish1==D2 || dish2==D2));
		System.out.println("User can eat mashroom " + !(dish1==D3 || dish2==D3));
		System.out.println("User can eat panipuri " + !(dish1==D4 || dish2==D4));
		}
        }*/
/*NOT operator Example2
Write a Java program to check login credentials for every time when user is trying to login check userID 
and Password both are matching or not ?[use! operator]*/

/*package Different_Operator;
public class Operator {
public static void main(String[] args) 
{
	//pref variables
	String password ="pooja123";
	String UserID ="pawapo1";
	//first login
	String password1 ="pooja12";
	String UserID1="pawa01";
	//second login
	String password2 ="pooja123";
	String UserID2 ="pawapo1";
	//third login
	String password3 ="pooja21";
	String UserID3="pawa1241";
	//FOURTH login
	String password4 ="pooja32";
	String UserID4="pawa012";
		
		System.out.println("User can login "+!(password!=password1 &&UserID!=UserID1));
		System.out.println("User can login "+!(password!=password2 && UserID!=UserID2));
		System.out.println("User can login "+!(password!=password3 && UserID!=UserID3));
		System.out.println("User can login "+!(password!=password4 && UserID!=UserID4));
		}
        }*/




