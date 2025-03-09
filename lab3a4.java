import java.util.Scanner;
public class lab3a4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int i,count=0;
		
		if(n==0 || n==1){
			System.out.println("not prime");
		}

		for(i=1;i<=n-1;i++){
			if(n%i==0){
				count++;
			}

			
		}
		if(count==1){
			System.out.println(" prime");
		}else{
			System.out.println(" not prime");
		}


	    }
	}
