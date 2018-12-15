
public class DistanceFinding {
	int feets;
	int inches;

public DistanceFinding()
{
	
}
public DistanceFinding(int feets,int inches)
{
	this.feets=feets;
	this.inches=inches;
}
public static DistanceFinding sum(DistanceFinding distancevalue,DistanceFinding distancevalue1)
{
	DistanceFinding distance=new DistanceFinding();
	distance.feets=distancevalue.feets+distancevalue1.feets;
	distance.inches=distancevalue.inches+distancevalue1.inches;
	return distance;
}
}
