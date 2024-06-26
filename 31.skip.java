import java.util.*; 
class skip
{ 
public static void main(String arg[])
	{ 
	int n,k,i;
	System.out.println("Enter the Number:");
	Scanner m = new Scanner(System.in);
	n = m.nextInt();
	System.out.println("Enter the Number to skip:");
	k = m.nextInt(); 	
	for(i=0;i<=n;i++)
	{
	if(i!=k)
	{
	System.out.println(i);
	}
	}
	} 
}
