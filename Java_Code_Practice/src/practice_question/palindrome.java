package practice_question;

import Bank.main;

public class palindrome {
public static void main(String[] args) {
	String str="madam";
	String rev="";
	int i;
	for(i=str.length()-1;i>=0;i--) {
		rev+=str.charAt(i);
		}
	System.out.println(rev);
	if(str.equals(rev)) {
		System.out.println("palindrome");}
	else
	{
	System.out.println("not palindrome");
	}}
}

