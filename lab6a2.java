 import java.util.Scanner;
class bank_account{
	int account_no;
	String user_name;
	String email;
	String account_type;
	double account_balance;

	public bank_account(){
	// int	account_no=0;
	// // String	user_name= Default;
	// // String	email=0;
  // //   String account_type=0;
	// double	account_balance=0;
	}

	public void get_account_details(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter account_no, name, email, account_type,account_balance");
        account_no=sc.nextInt();
        user_name=sc.nextLine();
        email=sc.nextLine();
        account_type=sc.nextLine();
        sc.nextLine();
         account_balance=sc.nextDouble();

	}
	public void display_account_details(){
         System.out.println("account_no="+account_no);
         System.out.println("user_name="+user_name);
         System.out.println("email="+email);
         System.out.println("account_type="+account_type);
         System.out.println("account_balance="+account_balance);
	}

}
public class lab6a2{
public static void main(String[] args){
  bank_account bank = new bank_account();
  bank.get_account_details();
  bank.display_account_details();
}
}