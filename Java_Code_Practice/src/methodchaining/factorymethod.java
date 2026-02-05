package methodchaining;

public class factorymethod {
public factorymethod m1() 
{
	System.out.println("m1");
	return this;
}
public factorymethod m2() 
{
	System.out.println("m2");
	return this;
}
public factorymethod m3() 
{
	System.out.println("m3");
	return this;
}
public static void main(String[] args) {
	factorymethod obj=new factorymethod();
	obj.m1();
	obj.m1().m2().m3();
}
}
