import java.util.Scanner;
class Tax{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();
        double tax = 0.0;
        double taxableIncome = 0.0;
	if(income > 250000){
		taxableIncome = income - 250000;
	}
        if (taxableIncome <= 250000) {
            tax = 0.0;
        } else if (taxableIncome <= 500000) {
            tax = taxableIncome * 0.10;
        } else if (taxableIncome <= 1000000) {
            tax = (taxableIncome * 0.20);
        } else {
            tax = (taxableIncome * 0.30);
        }
        System.out.println("Taxable Income: " + taxableIncome);
        System.out.println("Tax= " + tax);
    }
}