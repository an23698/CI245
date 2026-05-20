package chapter9;

public class HW3_testStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create a stock obj
		stock mystock = new stock("ORCL", "Oracle corporation");
		mystock.setpreviousClosingPrice(34.5);
		mystock.setcurrentPrice(34.35);
		System.out.println(mystock);
		
		stock yourstock = new stock("ORCL", "Oracle corporation");
		mystock.setpreviousClosingPrice(299);
		mystock.setcurrentPrice(302);
		System.out.println(mystock);
	}

}
