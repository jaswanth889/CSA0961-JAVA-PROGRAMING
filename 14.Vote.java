import java.util.*;
class king
{
public static void main(String S[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value:");
	int x = s.nextInt();
	int l=0;
	if (x=>18)  {  
        System.out.println("He is Elgible for Vote.");
	}
	if (x<18)
	{
	l=18-x;
	System.out.println("He/She is not Elgible for vote upto"+ l+"years");
	}
  }
}