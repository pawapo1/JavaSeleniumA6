package Bank;

public class Customer {
String name ;
int age ;
String gender;
String DOB;
Account account=new Account();
//Address address = new Address();
Customer(){}
Customer(String name,int age ,String gender,String DOB,Account account) {
	
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.DOB=DOB;
	this.account=account;
	//this.address=address;
}
public void showCustomer() {
    System.out.println("\n--- Customer Details ---");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Gender: " + gender);
    System.out.println("DOB: " + DOB);
    account.showAccount();
    account.deposit(300);
    account.Withdraw(600);
    account.checkbalance(); 
   // address.showAddress();
}   
}
