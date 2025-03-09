import java.util.Scanner;
public class lab3a{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter five subject marks");
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		int sub4=sc.nextInt();
		int sub5=sc.nextInt();
		float avg=(sub1+sub2+sub3+sub4+sub5)*100/5;

		if(avg>=60){
			System.out.println("first divison");
		}else if(avg>=50 && avg<60){
			System.out.println("second divison");
		}else if(avg>=40 && avg<50){
			System.out.println("third divison");
		}else {
            System.out.println("fail");
		}

	}
}