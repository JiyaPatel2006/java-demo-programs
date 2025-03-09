import java.util.Scanner;
public class lab5a2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int i,j,k;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1-i;j++){
				System.out.print(" ");
			}
			for(k=0;k<=i;k++){
				if(k==0||k==i){
				System.out.print("* ");
			}
			}
			
			System.out.println("");
		}
		  for(i=n-2;i>=0;i--){
		  	for(j=0;j<n-1-i;j++){
		  		System.out.print(" ");
		  	}
		  	for(k=0;k<=i;k++){
		  		System.out.print("* ");
		  	}
		  	System.out.println("");
		  }

	}
}
