package Constructorchaining;

public class Demo {
	Demo(){
		this(10);
		System.out.println("5tlanguage");
	}
	Demo(int a){
		this(1,5);
		System.out.println("programmimg");
	}
	Demo(int a,int b){
		this(1,5,6);
		System.out.println("a");}
	Demo(int a,int b,int c){
		this(1,4,67,9);
		System.out.println("is");
		}
	Demo(int a,int b,int c,int d){
		System.out.println("java");
	}
	public static void main(String[] args) {
	new Demo()	;
	}}
