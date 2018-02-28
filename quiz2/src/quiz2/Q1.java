package quiz2;
import java.util.Formatter;;  
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
		String x;
		a=price-downpayment;
		Mpay=(a*monthloanrate*Math.pow(1+monthloanrate,months)/((Math.pow(1+monthloanrate,months))-1));
		x=new Formatter().format("%.2f", Mpay).toString();
		Mpay=Double.parseDouble(x);
		return Mpay;
	}
	
	public double totalinterest() {
		double T;
		String x;
		T=monthpay()*months-price;
		x=new Formatter().format("%.2f", T).toString();
		T=Double.parseDouble(x);
		return T;
	}
	
	
	
	
}

