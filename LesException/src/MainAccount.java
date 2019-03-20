
public class MainAccount {
	public static void main(String[] args) {
		try {
			acheter();
		} catch (Myexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void acheter() throws Myexception {
		MyAccounts account =new MyAccounts();
		if(account.getBalance()<5000) {
			throw new Myexception();
		}else {
			System.out.println("vous pouvez acheter ce produit");
		}
	}

}
