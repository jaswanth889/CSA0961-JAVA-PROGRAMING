import java.util.*;
class Number extends Thread{ 
	public void run(){
	int rev=0,i,n = 12134,c;
	System.out.println("Enter the Number:"+n);
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
}

class Strings extends Thread{ 
	public void run(){
		String s1 = "jayaram";
		String s2="";
		int k = s1.length();
		System.out.println("Original word: "+s1);
		for (int i=k-1; i>=0; i--)
		{
			s2 = s2 + s1.charAt(i);
		}
		if(s1.equals(s2))
		System.out.println("It is Palindrome");
		else
		System.out.println("It is not Palindrome");
	}
}
class king{
	public static void main(String arg[]){
		Number m = new Number();
		Strings n = new Strings();
		m.start();
		n.start();
} 
}

