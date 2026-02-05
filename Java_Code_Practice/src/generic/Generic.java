package generic;

import java.util.ArrayList;

class Generic<T1,T2> {

	int Val;
	private T1 t1;
	private T2 t2;
	public Generic(int val, T1 t1, T2 t2) {
		
		this.Val = val;
		this.t1 = t1;
		this.t2 = t2;
	}
	public int getVal() {
		return Val;
	}
	public void setVal(int val) {
		Val = val;
	}
	public T1 getT1() {
		return t1;
	}
	public void setT1(T1 t1) {
		this.t1 = t1;
	}
	public T2 getT2() {
		return t2;
	}
	public void setT2(T2 t2) {
		this.t2 = t2;
	}
	
	}
	
	
	


