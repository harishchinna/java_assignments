
public class EmployeeSalary
{
	private int id;
	 private String name;
	 private double monthlyBasicSalary;
	 final int medicalAllowences=1250;
	 final int conveyanceAllowences=800;
	 private int hra;
	 private int pf;
	 private int profTax;
	 private int esic;
	 private static float pfRate;

void EmployeeSalary()
{
	
}
public double hra()
{
	double monthlyHra=(getMonthlyBasicSalary()*50)/100;
	return monthlyHra;
}
public double pf()
{
	double pf=(getMonthlyBasicSalary()*10)/100;
	if(pf>=6500)
	{
		return 6500;
	}else
	{
	return pf;
	}
}
public int profTax()
{
	if(getMonthlyGrossSalary()>10000)
	{
		return profTax=100;
	}
	else
	{
		return profTax=50;
	}
}
public double esicValue()
{
	double esicAmount=0;
	if(monthlyBasicSalary<=5000)
	{
	 esicAmount=(getMonthlyBasicSalary()*4.75)/100;
	
	}return esicAmount;
}
public double getAnnualBasic()
{
	double annualSalary;
	annualSalary=getMonthlyBasicSalary()*12;
	return annualSalary;
}
public double getMonthlyGrossSalary()
{
	double hra=hra();
	double esic=esicValue();
	double monthlyGrossSalary;
	monthlyGrossSalary=getMonthlyBasicSalary()+hra+medicalAllowences+conveyanceAllowences;
	return monthlyGrossSalary;
}
public double getAnnualSalary()
{
	double annualGrossSalary;
	double monthlyGrossSalary=getMonthlyGrossSalary();
	annualGrossSalary=monthlyGrossSalary*12;
	return annualGrossSalary;
}
public double getMonthlyDeductions()
{
	double provisionalFund=pf();
	double esicMonthlyValue=esicValue();
	int professionalTax=profTax();
	double monthlyDeductions;
	monthlyDeductions=provisionalFund+professionalTax+esicMonthlyValue;
	return monthlyDeductions;
}
public double getMonthlyTakeHome()
{
	double monthlyGross=getMonthlyGrossSalary();
	double monthlyDeductions=getMonthlyDeductions();
	double monthlyTakeHome=monthlyGross+monthlyDeductions;
	return monthlyTakeHome;
}
public double getAnnualTakeHome()
{
	double monthGrossTakeHome=getMonthlyTakeHome();
	double annualGross=monthGrossTakeHome*12;
	return annualGross;
}
public double PfRate(float value)
{
	double pfCalculation=(monthlyBasicSalary*EmployeeSalary.getPfRate())/100;

	if(pfCalculation<=6500)

	 pfCalculation = 6500;

	return pfCalculation;	
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMonthlyBasicSalary() {
	return monthlyBasicSalary;
}
public void setMonthlyBasicSalary(double monthlyBasicSalary) {
	this.monthlyBasicSalary = monthlyBasicSalary;
}
public static float getPfRate() {
	return pfRate;
}
public void setPfRate(float pfRate) {
	this.pfRate = pfRate;
}
}

