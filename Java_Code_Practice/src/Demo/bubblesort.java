package Demo;

public class bubblesort {
	public static void main(String [] args) 
	{
		int a[]= {1,90,56,87,356,80,4,7,2};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					System.out.println(a[i]);
				}
			}
		}
		
	}

}
