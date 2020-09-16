package dollarQuotation;

public class CurrencyConverter {
	
	public double quotation;
	public double dollarQuantity; 
	public double iof = 0.06;
	public double value;
	
	public double value() {
		return quotation * dollarQuantity + (quotation * dollarQuantity) * iof;
	}
}
