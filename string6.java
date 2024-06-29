import java.util.*;
class deepak
{
public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	String str;
	char ch;
	int k;
	str = s.nextLine(); 
	System.out.print("Original word: ");
	System.out.println(str); 
	System.out.println("Vowels:");
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		if(ch == 'a'||ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
		System.out.print(ch);
		}
	}
	}
}


