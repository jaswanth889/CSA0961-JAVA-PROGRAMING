import java.util.*;
import java.lang.Math;
class Cubesroots
{
  public static void main(String n[])
{
	Scanner s = new Scanner(System.in);
	int a;
	a = s.nextInt();
	System.out.println("Square Root:" +Math.sqrt(a));
	System.out.println("Cube Root:" +Math.cbrt(a));
	System.out.println("Square:"+Math.pow(a, 2));
	System.out.println("Cube:"+Math.pow(a, 3));
}
}
