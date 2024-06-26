import java.io.*; 
{
	public static void main(String args[]) 
	{ 

		int k=0,rem,B = 0; 
		double k;
		while (N != 0) { 
			rem = N % 2; 
			c = Math.pow(10, k); 
			B += rem * c; 
			N /= 2; 
			k++;
			}
		System.out.println("Decimal - " + N); 
		System.out.print("Binary - "); 
		System.out.println(B);  
	} 
} 