package practice_question;

import Bank.main;

public class countoccurenceinstring {
public static void main(String[] args) {
	String str="pooja";
	char ch='o';
	int cnt=0;
	for(int i=0;i<str.length()-1;i++) {
		if(ch==(str.charAt(i))) 
			cnt++;
		}
	System.out.println(cnt);
	
}
}
