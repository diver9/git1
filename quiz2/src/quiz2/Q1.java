package quiz2;

public class Q1 {
	private int price,downpayment,months;
	private double monthloanrate;
	
	public Q1( int Price,int Downpayment,int Months, double d) {
	
		this.price=Price;
		this.downpayment=Downpayment;
		this.months=Months;
		this.monthloanrate=d;
// TODO Auto-	generated constructor stub
	}
	public double monthpay() {
		int a;
		double Mpay;
		a=price-downpayment;
		Mpay=(a*monthloanrate*Math.pow(1+monthloanrate,months)/((Math.pow(1+monthloanrate,months))-1));
		
		return Mpay;
	}
	
	public double totalinterest() {
		double T;
		T=monthpay()*months-price;
		return T;
	}
	
	
	
	
}

