import java.lang.Math;
public class ScientificCalculator extends BasicCalculator implements ScientificCalculation
{
	
	ScientificCalculator(double v1,double v2)
	{
		super(v1,v2);
	}
	public double add()
	{
		double add=value1+value2;
		return add;
	}
	public double subtract()
	{
		double subtract=value2-value1;
		return subtract;
	}
	public double multiply()
	{
		double multiply=value1*value2;
		return multiply;
	}
	public double divide()
	{
		double divide=value1/value2;
		return divide;
	}
	public double toThePow()
	{
		double toThePow=Math.pow(value1,value2);
		return toThePow;	
	}
	public double square()
	{
		double square=Math.pow(value1,2);
		return square;
	}
	public double cube()
	{
		double cube=Math.pow(value1,3);
		return cube;
	}
	public double log()
	{
		double log=Math.log(value1);
		return log;
	}
	public double mod()
	{
		double mod=value2%value1;
		return mod;
	}
	public double exp()
	{
		double exp=Math.exp(value1);
		return exp;
	}
	public double sqrt()
	{
		double sqrt=Math.sqrt(value1);
		return sqrt;
	}
}