package Inheritence;

public class CorporateTraining extends Training 
{
	public CorporateTraining(String subject,double fees)
	{
		super(subject,fees);
	}
	int days=4;
	@Override
	public double getOrderValue()
	{
		double OrderValue= fees*days;
		return OrderValue;
	}
}
