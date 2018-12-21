package Inheritence;

public class publicTraining extends Training
{
	public publicTraining(String subject,double fees)
	{
		super(subject,fees);
	}
	int participents=50;
	@Override
	public double getOrderValue()
	{
		double orderValue=fees*participents;
		return orderValue;
	}
}
