package practice_question;



public class ReverseString {
public static void main(String[] args) {
	String str="automation";
	String rev="";
	int i;
	for(i=str.length()-1;i>=0;i--) {
		rev+=str.charAt(i);
		}
	System.out.println(rev);
}
}
