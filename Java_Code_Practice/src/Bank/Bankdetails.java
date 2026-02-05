package Bank;

public class Bankdetails {
	String name;
	Address address = new Address();// null
	//Customer customer=new Customer();
	public Bankdetails(String name, Address address) {
		this.name = name;
		this.address = address;

	}

	public void detailsofbranch() {
		System.out.println("Welcome to " + name + " Bank Branch!");
		 address.showAddress();
		
	}

}
