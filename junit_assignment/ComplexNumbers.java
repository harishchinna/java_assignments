
public class ComplexNumbers {
	double real;
	double imaginary;

public ComplexNumbers()
{
	
}
public ComplexNumbers(double real,double imaginary)
{
	this.real=real;
	this.imaginary=imaginary;
}
public static ComplexNumbers sum(ComplexNumbers complex,ComplexNumbers complex1)
{
	ComplexNumbers value=new ComplexNumbers();
	value.real=complex.real+complex1.real;
	value.imaginary=complex.imaginary+complex1.imaginary;
	return value;
}
}