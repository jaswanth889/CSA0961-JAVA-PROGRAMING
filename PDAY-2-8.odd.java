import java.util.*;
class king
{
    public static int Odd(int n)
    {
        return (2 * n - 1);
    }
    public static void main(String [] args)
    {
	Scanner s = new Scanner(System.in);
        int n;
	System.out.print("Enter the Number:");
	n = s.nextInt();
        System.out.println(Odd(n));
    }
}