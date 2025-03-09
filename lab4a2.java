import java.util.Scanner;
public class lab4a2{
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
		System.out.println("reverse array");

		for(i=size-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}