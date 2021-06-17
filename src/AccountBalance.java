
public class AccountBalance {
	
	int acc_no;
	String name;
	float amount;
	public void insert(int i,String n,float amt) {
		acc_no=i;
		name=n;
		amount=amt;
	}
public void deposite(float amt) {
	amount=amount+amt;
	System.out.println(amt);
}	
public void withdraw(float amt) {
	if(amount<amt) {
		System.out.println("Insufficient balance");
	}else
		amount=amount-amt;
	System.out.println(amt + " withdrawn");
}
public void checkBanalce() {
	System.out.println("Balance is:" +amount);
}
public void display() {
	System.out.println(+ acc_no+ " " +name + " " +amount);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountBalance a=new AccountBalance();
		a.insert(1002323322,"Suraj", 25000);
		a.display();
		a.deposite(5000);
		a.checkBanalce();
		a.withdraw(3000);
		a.checkBanalce();
	}

}
