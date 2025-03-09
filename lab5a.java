import java.util.Scanner;
public class lab5a{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.nextLine();
		System.out.println("enter total element number of string");
		int n=sc.nextInt();
		// n+=1;
		int i,j;

		for(i=1;i<=n;i++){
			for(j=0;j<i;j++){
				char ch=s1.charAt(j);
				System.out.print(ch);
			
				
			}

			System.out.println("\n");
		}
	}
}