 import java.util.Scanner;
class bank_account{
	int account_no;
	int age;
	String user_name;
  double account_balance;

	public bank_account(){
	      this.account_no = 0;
        this.age = 0;
        this.user_name = "Default";
        this.account_balance = 0.0;
	}

	public void get_account_details(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter account_no, age , user_name,account_balance");
        account_no=sc.nextInt();
        age=sc.nextInt();
        sc.nextLine();
        user_name=sc.nextLine();
        account_balance=sc.nextDouble();

	}
	
	public void withdraw(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter withdraw money");
		int w=sc.nextInt();
		if(w>account_balance){
			System.out.println("not valid");
		}
		else {
            account_balance -= w;
            System.out.println("Withdrawal successful! Remaining balance: " + account_balance);
        }
		
	}
	public void deposite(){
		Scanner sc=new Scanner(System.in);
		System.out.println("your balance is" +account_balance);
		System.out.println("enter diposite money");
		int d=sc.nextInt();
		 account_balance=account_balance+d;
		System.out.println("your balance is"+account_balance);
  }
}
public class withdraw{
public static void main(String[] args){
  bank_account bank = new bank_account();
  bank.get_account_details();
  Scanner sc=new Scanner(System.in);
  while(true){
  	 System.out.println("enter your choice withdraw, diposite, quit");
  String s1=sc.nextLine();

  if (s1.equals("withdraw")) {
                bank.withdraw();
            } else if (s1.equals("deposite")) {
                bank.deposite();
            } else if (s1.equals("quit")) {
                System.out.println("Exiting... Thank you!");
                break;
            } else {
                System.out.println("Invalid choice, try again!");
            }
  	
  }
 
  }
  
  
}
