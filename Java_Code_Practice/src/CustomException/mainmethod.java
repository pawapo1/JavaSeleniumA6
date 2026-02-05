package CustomException;

public class mainmethod {
	public static void main(String[]args)
	{
		CheckedException obj=null;
		try {
			obj= new CheckedException("pooja","pooja@123",1,18);
		}
		catch(InvalidAgeException e) {
			e.printStackTrace();
			}
		if(obj!=null) {
        obj.printstate();}
        else {
        	System.out.println("object is not created due to invalid age ");
        }
}
	}

	

