package Bank;

public class main {
public static void main(String []args){
	
	Account account= new Account(12345, "Savings Account", 50000.0, "SBI000123");
	Customer customer=new Customer("Pooja", 25, "Female", "12-05-2000", account);
	Address address=new Address("Pune", 411001, "Maharashtra", customer);
	Bankdetails Bank=new Bankdetails("SBI",address);
	Bank.detailsofbranch();
	
}
}
