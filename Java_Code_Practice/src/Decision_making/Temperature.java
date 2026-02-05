

//write a java program to print temperature status to 40 or more very hot ,30to40 hot temp
// 20to29 warm temp ,10to19 cold temp,less than 10 frezzing to death
package Decision_making;
public class Temperature {
	public static void main(String[] args) {
		
		int Temp=20;
		
		if(Temp>=40) 
		{
		System.out.println("Temperature is very hot");
		}
		else if(Temp>=30) 
		{
		System.out.println("Temperature is hot");
		}
		else if(Temp>=20) 
		{
		System.out.println("Temperature is warm");
		}
		else if(Temp>=10) 
		{
		System.out.println("Temperature is cold");
		}
		else 
		{
            System.out.println("Freezing to death");
        }

	}
}