package generic;

import java.util.ArrayList;

class Genericmain{
	public static void main(String[] args) {
		//ArrayList arr=new ArrayList();
		//arr.add(10);
		//arr.add("Hello");
		//int a=(int)arr.get(0);
		//System.out.println(a);
		//int b=(int)arr.get(1);
		//System.out.println(b);
		//System.out.println(arr.get(1));
		
		Generic<String,Integer> obj=new Generic(10,"This is a string",79);
		String str=obj.getT1();
		int i=obj.getT2();
		int v=obj.getVal();
		System.out.println(str);
		System.out.println(i);
		System.out.println(v);
	}
}
