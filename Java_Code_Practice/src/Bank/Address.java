package Bank;

public class Address {
String city;
int pincode;
String state;
Customer customer=new Customer();

Address(){}
Address(String city,int pincode,String state,Customer customer)
{
this.city = city;
this.pincode = pincode;
this.state = state;
this.customer=customer;
}
public void showAddress() {
    System.out.println("\n--- Address Details ---");
    System.out.println("City: " + city);
    System.out.println("State: " + state);
    System.out.println("Pincode: " + pincode);
    customer.showCustomer();
}
}
