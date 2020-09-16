package dollarQuotation;
import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter currencyConverter = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		currencyConverter.quotation = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		currencyConverter.dollarQuantity = sc.nextDouble();
				
		System.out.printf("Amount to be paid in reais %.2f%n", currencyConverter.value());
		
		sc.close();
	}
}
