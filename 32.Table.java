import java.util.*;
class table
{
	public static void main(String ar[])
{
	Scanner s = new Scanner(System.in);
	int i,n,k;
	i = 0;
	n = 10;
	System.out.println("Enter the k value:");
	k = s.nextInt();
	System.out.println("Multiplication Table");
	for(i=0;i<=n;i++)
		System.out.println(i+"*"+k+"="+i*k);
}
}
