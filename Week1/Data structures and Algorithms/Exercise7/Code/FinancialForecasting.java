package packag;
import java.util.Scanner;
public class FinancialForecasting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial investment (₹): ");
        double initialInvestment = scanner.nextDouble();

        System.out.print("Enter monthly contribution (₹): ");
        double monthlyContribution = scanner.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter forecast period (in years): ");
        int years = scanner.nextInt();

        double totalAmount = initialInvestment;
        double monthlyRate = annualInterestRate / 12 / 100;
        int totalMonths = years * 12;

        for (int i = 1; i <= totalMonths; i++) {
            totalAmount += monthlyContribution;
            totalAmount += totalAmount * monthlyRate;
        }
        System.out.printf("\nEstimated savings after %d years: ₹%.2f\n", years, totalAmount);
        scanner.close();
    }
}

