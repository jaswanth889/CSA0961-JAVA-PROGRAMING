import java.util.*;
class deepak
{
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		String nstr="";
		char ch;
		str = s.nextLine();
		System.out.print("Original word: "+str);
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		nstr= ch+nstr;
	}
	System.out.println();
	if(str.equals(nstr))
	System.out.print("It is Palindrome");
	else
	System.out.print("It is not Palindrome");
	}
}
