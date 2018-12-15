
public class TimeZone {
	int hours;
	int minutes;
	public TimeZone()
	{
		
	}
	public TimeZone(int hours,int minutes)
	{
		this.hours=hours;
		this.minutes=minutes;
	}
	public static TimeZone sum(TimeZone timezone,TimeZone timezone1)
	{
		TimeZone hoursandminutes=new TimeZone();
		hoursandminutes.hours=timezone.hours+timezone1.hours;
		if(hoursandminutes.hours>=24){

			System.out.println("you are exceeding the day hours limit");

		}

			else{

				hoursandminutes.hours = timezone.hours+timezone1.hours;

		}
		hoursandminutes.minutes=timezone.minutes+timezone1.minutes;
if(hoursandminutes.minutes>60){

			

	hoursandminutes.hours++;

	hoursandminutes.minutes=hoursandminutes.minutes-60;

		}

		else{

			hoursandminutes.minutes=timezone.minutes+timezone1.minutes;

		}
		return hoursandminutes;
	}
	public void display(){

		System.out.println(hours+" hrs "+minutes+" min");

	}

}
