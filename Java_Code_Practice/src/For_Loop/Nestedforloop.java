package For_Loop;

public class Nestedforloop {
public static void main(String[]args) {
	
	
	int a[]= {3,588,57,80,100,300};
	
	for(int k=0;k<3;k++)
	{
		int temp=a[a.length-1];
	for(int i=a.length-1;i>0;i--)
	{
		
		a[i]=a[i-1];
	}
	a[0]=temp;}
	
	for(int i=0;i<a.length;i++) {
		System.out.println("roate an array to left"+a[i]);}
}}
	