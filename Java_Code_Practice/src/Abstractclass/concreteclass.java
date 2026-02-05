package Abstractclass;

public class concreteclass extends abstractmethod  {

	@Override
	public double add(double a,double b) {
		return a+b;
	}
	@Override
	public double sub(double a,double b){
		return a-b;
	}
	@Override
	public double mul(double a,double b){
		return a*b;
	}
	@Override
	public double div(double a,double b){
		return a/b;
		}
	public void display(double a,double b) {
	System.out.println(add(a,b));
	System.out.println(sub(a,b));
	System.out.println(mul(a,b));
	System.out.println(div(a,b));
	}
}
