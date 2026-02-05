package superstatement;

public class superclass {
	
	superclass(){
		System.out.println("superclass()");
	}
	{
		System.out.println("NSB-superclass-1");
	}
	superclass(int a){
		this();
		System.out.println("superclass");	
		}
	{
		System.out.println("NSB-superclass-2");
	}
}
