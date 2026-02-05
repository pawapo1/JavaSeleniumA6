package UncheckedCustomException;
public class unCheckedException {
String name ;
String Email;
int ID;
int age ;

 public unCheckedException(String name, String email, int iD,int age )
 {
	 
    this.name = name;
	this.Email = email;
	this.ID = iD;
	if(age>=20) {
		this.age=age;
		}
	else {
		throw new InvalidAgeException();
	}
	System.out.println("object created");
}
 public void printstate() {
	 System.out.println("name:"+name);
	 System.out.println("Email:"+Email);
	 System.out.println("ID:"+ID);
	 System.out.println("age:"+age);
 }
 
}
