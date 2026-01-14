import java.util.Scanner;
//

public class Intrest {
    public static double calculateEMI(double principal, double rate, double time) {
        double monthlyRate = rate / (12 * 100);
        double numberOfPayments = time * 12;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) /
               (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
    }
    public static double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * Math.pow(1 + rate / 100, time) - principal;
    }
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest is: " + simpleInterest);
        double compoundInterest = calculateCompoundInterest(principal, rate, time);
        System.out.println("Compound Interest is: " + compoundInterest);
        double emi = calculateEMI(principal, rate, time);
        System.out.println("EMI is: " + emi);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}

// Formula: A = P(1 + R/100)^T
// EMI = [P × R × (1 + R)^N] / [(1 + R)^N - 1]
 


