import java.util.*;
class GOAT{
    public static boolean canConstruct(String ransomNote, String magazine) {
       int[] alphabet = new int[26];
        for (char c : ransomNote.toCharArray()) {
            int i = magazine.indexOf(c, alphabet[c % 26]);
            if (i == -1) 
		return false;
            alphabet[c % 26] = i + 1;
        }
        return true;
    }
	
	public static void main(String arg[]){
		if(canConstruct("a","a")==true){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		
	}
}