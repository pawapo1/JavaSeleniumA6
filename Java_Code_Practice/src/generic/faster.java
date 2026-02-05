package generic;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class faster {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	LinkedHashSet Ls = new LinkedHashSet();
	hs.add(10);
	Ls.add(20);
	long Start1 = System.nanoTime();
	for(int i=0;i<=5000;i++) {
		hs.contains(i);
		long end1 = System.nanoTime();
		System.out.println(end1-Start1);
	
		long Start2 = System.nanoTime();
		Ls.contains(i);
		long end2 = System.nanoTime();
		System.out.println(end2-Start2);
	}
		
}
}
