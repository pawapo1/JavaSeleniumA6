//write a java program to print the days based on integer value from 1to7 by using else if ladder
package Decision_making;

public class Switch_statement {
	public static void main(String[] args) {
int day=3;
switch(day) 
{
case 1:System.out.println("Day is monday");
break;
case 2:System.out.println("Day is Tuesday");
break;
case 3:System.out.println(" Day is wednesday");
break;
case 4:System.out.println("Day is Thursday");
break;
case 5:System.out.println("Day is friday");
break;
case 6:System.out.println("Day is saturday");
break;
case 7:System.out.println("Day is sunday");
break;
default:System.out.println("only seven days in a  week");
break;
}
}
}