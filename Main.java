import java.util.Scanner;
import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Scanner obj= new Scanner(System.in);  
			System.out.print("Enter first number (x): ");
			double num1=obj.nextDouble();
			System.out.print("Enter second number (y): ");
			double num2=obj.nextDouble();
			ScientificCalculator obj1=new ScientificCalculator(num1,num2);
			
			FileWriter fw = new FileWriter("Calculator_Output.txt",true);
		    PrintWriter pw = new PrintWriter(fw);
			
			pw.print("The first number is (x): ");
			pw.println(num1);
			pw.print("The second number is (y): ");
			pw.println(num2);
			
			System.out.print("Enter how many operations you want to perform: ");
			int number=obj.nextInt();
			for(int i=0;i<number;i++)
			{
				System.out.print("Enter the operation you want to perform: ");
				String op=obj.next();
				if(op.equalsIgnoreCase("+"))
				{
					pw.print("The Summation is: ");
					pw.println(obj1.add());
				}
				else if(op.equalsIgnoreCase("-"))
				{
					pw.print("The Subtraction is: ");
					pw.println(obj1.subtract());
				}
				else if(op.equalsIgnoreCase("*"))
				{
					pw.print("The Multiplication is: ");
					pw.println(obj1.multiply());
				}
				else if(op.equalsIgnoreCase("/"))
				{
					pw.print("The Division is: ");
					pw.println(obj1.divide());
				}
				else if(op.equalsIgnoreCase("x^y"))
				{
					pw.print("X^Y  is: ");
					pw.println(obj1.toThePow());
				}
				else if(op.equalsIgnoreCase("x^2"))
				{
					pw.print("Square of first number is: ");
					pw.println(obj1.square());
				}
				else if(op.equalsIgnoreCase("x^3"))
				{
					pw.print("Cube of first number is: ");
					pw.println(obj1.cube());
				}
				else if(op.equalsIgnoreCase("log"))
				{
					pw.print("Log of first number is: ");
					pw.println(obj1.log());
				}
				else if(op.equalsIgnoreCase("mod"))
				{
					pw.print("Mod is: ");
					pw.println(obj1.mod());
				}
				else if(op.equalsIgnoreCase("e^x"))
				{
					pw.print("Exp of first number is: ");
					pw.println(obj1.exp());
				}
				else if(op.equalsIgnoreCase("sqrt"))
				{
					pw.print("Square root of first number is: ");
					pw.println(obj1.sqrt());
				}
			}
			pw.close();
			System.out.println("File writting is done!");
			
			System.out.println("Showing in cmd using BufferedReader:");
			String result;
			FileReader fr = new FileReader("Calculator_Output.txt"); 
			BufferedReader reader = new BufferedReader(fr); 
			while((result = reader.readLine()) !=null)
			{
				System.out.println(result);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error occurred");
			e.printStackTrace();
		}
			
	}
}