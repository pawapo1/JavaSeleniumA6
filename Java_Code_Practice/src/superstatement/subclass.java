package superstatement;

public class subclass extends superclass {
	subclass(){
		super(10);
		System.out.println("subclass-1");
		}
	{
		System.out.println("NSB-subclass-1");
	}
	subclass(int a){
		this();
		System.out.println("subclass-2");
	}
	{
		System.out.println("NSB-subclass-2");
	}
	public static void main(String[] args) {
		//subclass obj=new subclass(10);
		new subclass(10);
	}
}

