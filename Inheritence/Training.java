package Inheritence;

public abstract class Training {
	int id;
	public Training()
	{
		
	}
	public Training(String subject, double fees) {
		
		this.subject = subject;
		this.fees = fees;
	}


	String subject;
	public double fees;
	static int increment=0;
	
	{
		id=100;
		increment++;
		id=id+increment;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	
	public abstract double getOrderValue();
	
}
