import java.util.Scanner;
class king{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();
        
     
        final int DAYS_IN_A_YEAR = 365;
        final int DAYS_IN_A_WEEK = 7;
        
        int years = totalDays / DAYS_IN_A_YEAR;
        int remainingDaysAfterYears = totalDays % DAYS_IN_A_YEAR;
        int weeks = remainingDaysAfterYears / DAYS_IN_A_WEEK;
        int days = remainingDaysAfterYears % DAYS_IN_A_WEEK;
        
     
        System.out.println(totalDays + " days is equivalent to:");
        System.out.println(years + " year(s), " + weeks + " week(s), and " + days + " day(s)");
        
   
        scanner.close();
    }
}