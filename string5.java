import java.util.*;
class deepak
{
public static void main (String args[]) {
	Scanner s = new Scanner(System.in);
	char ch = s.next().charAt(0);
	if(ch == 'a'||ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
		System.out.println("It is a Vowel");
		}
	else{
	System.out.println("It is a Consonant");
		}
	}
}