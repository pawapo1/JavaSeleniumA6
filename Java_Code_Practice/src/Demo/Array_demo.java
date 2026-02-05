package Demo;

public class Array_demo {
public static void main(String[]args)
{
int a[]= {1,8,5,70,3,65};
/*int start=0;
int end =a.length-1;
while(start<end)
{
	int temp=a[start];
	a[start]=a[end];
	a[end]=temp;
	start++;
	end--;
}*/
for(int i=a.length/2;i>=0;i--)
{
	 System.out.println(a[i]);
}
}
}
