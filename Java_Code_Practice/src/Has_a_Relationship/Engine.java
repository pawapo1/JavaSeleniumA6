package Has_a_Relationship;

public class Engine {
private String cc;
private String power;

public void device(String cc,String power) {
	this.cc=cc;
	this.power=power;
	
}

public String getCc() {
	return cc;
}

public String getPower() {
	return power;
}
}