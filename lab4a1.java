import java.util.Scanner;
public class lab4a1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length");
		int size=sc.nextInt();
		int i;
		int arr[]=new int[size];

		for(i=0;i<size;i++){
			System.out.println("enter element");
			arr[i]=sc.nextInt();
		}
		double sum=0;
		for(i=0;i<size;i++){
               sum+=arr[i];
		}
		double avg=0;
		avg=sum/size;
		System.out.println("avg="+avg);

	}
}