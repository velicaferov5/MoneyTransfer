
public class moneyTransfer {
	public static void main(String args[]) {
		Account A = new Account("Vali Jafarov",100);
		Account B = new Account("Adam Marians",900);
		Account Transfer = new Account();
		Integer amount = 150;
		
		System.out.println("Transferring " + amount + " $ from "+A.getName() +" (" + A.getBalance() + ") to " + B.getName() +" (" + B.getBalance() + ") ...");
		System.out.println(Transfer.transfer(A, B, amount));
	}
}
