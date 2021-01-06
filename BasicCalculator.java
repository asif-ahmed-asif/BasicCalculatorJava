public abstract class BasicCalculator implements Calculation
{
	 double value1;
	 double value2;
	
	BasicCalculator(double value1,double value2)
	{
		this.value1=value1;
		this.value2=value2;
	}
	
	public abstract double add();
	public abstract double subtract();
	public abstract double multiply();
	public abstract double divide();
}