import java.util.*;
class king{ 
	public static void isInt(int n){
	int rev=0,i,c;
	System.out.println("Entered Number:"+n);
	c=n;
	while(n!=0)
	{
		i = n%10;
		rev = rev*10 + i;
		n = n/10;
	}
	if(c==rev)
	System.out.println("It is a Palindrome Number");
	else
	System.out.println("It is NOT a Palindrome Number");
	}


	public static void isstring(String s1){
		String s="jayaram",s2="";
		int k = s.length();
		System.out.println("Original word: "+s);
		for (int i=k-1; i>=0; i--)
		{
			s2 = s2 + s.charAt(i);
		}
		if(s.equals(s2))
		System.out.println("It is Palindrome");
		else
		System.out.println("It is not Palindrome");
	}


	public static void main(String arg[]){
		int ch,n;
		String C;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the choice:");
		ch = s.nextInt();
		switch(ch){
		case 1:
			n = s.nextInt();
			isInt(n);
			break;
		case 2:
			C = s.nextLine();
			isstring(C);
			break;
		default:
			System.out.println("INVALID INPUT");
} 
}
}
