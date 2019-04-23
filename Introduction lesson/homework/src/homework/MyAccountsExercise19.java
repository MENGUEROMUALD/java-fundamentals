package homework;
// main in Exception19
public class MyAccountsExercise19 {
	
	int balance;
	
	public void setBalance(int balance) throws MyExceptions{
		if (balance < 0) 
			throw new MyExceptions("Account Balance less than Zero");
		else
		this.balance = balance;
	}
	public int getBalance() {
		return this.balance;
	}
	public MyAccountsExercise19(int i) {
		super();
		this.balance = i;
	}
	

}
