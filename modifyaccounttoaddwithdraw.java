public class Account{
	private String name;
	private double balance;

	public Account(String name, double balance){
	this.name = name;

	if (balance > 0.0){
	this.balance = balance; 
   }
  }

	public void deposit(double depositAmount){
	if(depositAmount > 0.0){
	balance = balance + depositAmount;
   }
  }

	public void withraw(double withdrawAmount){
	if(withdrawAmount < 0.0){
	balance = ("Withdrawal amount exceeded account balance");
   }
  }	

	public double getBalance(){
		return balance;
   }

public String setName(String name){
	this.name = name;
   }

	public String getName(){
		return name;
   } 
	

}

