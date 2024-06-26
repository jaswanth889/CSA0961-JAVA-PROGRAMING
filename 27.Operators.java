import java.util.*;
class Operators
{
  public static void main(String arg[])
{
	Scanner s = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter the Number A:");
	a = s.nextInt();
	System.out.println("Enter the Number B:");
	b = s.nextInt();
	c = a+b;
	System.out.println("Addition: "+c);
	c = a-b;
	System.out.println("Difference: "+c);
	c = a*b;
	System.out.println("Multiplication: "+c);
	c = a/b;
	System.out.println("Division: "+c);
}
}