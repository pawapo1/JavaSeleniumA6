/*package Switch;
import java.util.Scanner;

public class Vowel_Consonant_Specialcharacter {
public static void main(String[] args) {
	Scanner scan=new Scanner(System .in);
	System.out.println("Enter a character:");
	char ch=scan.next().charAt(0);
	if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') {
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'
				||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
		System.out.println(ch+" is a Vowel");
		}
		else {
			System.out.println(ch+" is a Consonant");
		}}
	else if(ch>='0'&&ch<='9')
	{
		System.out.println(ch+" is a digit");
	}
	else
	{
		System.out.println(ch+" is a special character");
	}

}}*/package Switch;
import java.util.Scanner;

public class Vowel_Consonant_Specialcharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scan.next().charAt(0);

        switch (ch) {
            // Vowels
            case 'A': case 'E': case 'I': case 'O': case 'U':
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println(ch + " is a Vowel");
                break;

            // Consonants (letters other than vowels)
            default:
                if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                    System.out.println(ch + " is a Consonant");
                } else if (ch >= '0' && ch <= '9') {
                    System.out.println(ch + " is a Digit");
                } else {
                    System.out.println(ch + " is a Special Character");
                }
        }

        scan.close();
    }
}

