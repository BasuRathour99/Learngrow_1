import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in US Dollars: ");
        double usdAmount = scanner.nextDouble();

        
        double exchangeRate = 0.85;

        double euroAmount = usdAmount * exchangeRate;

        System.out.println(usdAmount + " US Dollars is equal to " + euroAmount + " Euros.");
    }
}
