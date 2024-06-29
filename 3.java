import java.util.*;
class GOAT{
public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	char ch;
	String str;
	char k;
	int i;
	System.out.print("Enter the word: ");
	str = s.nextLine();	
	System.out.print("Enter the search key: ");
	k = s.next().charAt(0);
	for (i=0; i<str.length(); i++)
	{
	ch= str.charAt(i); 
	if(ch == k){
	System.out.print("Index is:"+i);
	}
	}
	}
}

