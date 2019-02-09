package homework2;

public class Laptop {

	

	public String myLaptop;
	public double softwareVersion;
	public int num;
	public static String price;
	public static String DOPIntro;
	public static int DOPMonth;
	public static int DOPDay;
	public static int DOPYear;

	
	public Laptop(String myLaptop) {		//Constructor 1
		
		this.myLaptop = myLaptop;
		System.out.println(myLaptop);
		
	}
	
	public Laptop(double softwareVersion) {		//Constructor 2
		
		this.softwareVersion = softwareVersion;
		System.out.println("My Macbook version is " + softwareVersion);
		
	}
	
	public Laptop(int num) {					//Constructor 3
		
		this.num = num;
		System.out.println("I have " + num + " laptops." );
	}
	
	
	public static void Pricing() {	
		
		price = "I purchased my laptop for $1,500.";
		System.out.println(price);	
	}


public static void DateOfPurchase() {	
	
	DOPIntro = "I purchased my laptop on ";
	DOPMonth = 01;
	DOPDay = 06;
	DOPYear = 2017;
	System.out.println(DOPIntro + DOPMonth + "/" + DOPDay + "/" + DOPYear);	
}
}