import java.util.Scanner;
public class lab5c{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length");
		int size=sc.nextInt();
		int[]arr=new int[size];
		
		for(int i=0;i<size;i++){
			System.out.println("enter array element");
			arr[i]=sc.nextInt();

		}
		System.out.println("enter pivot index");
		int pivot=sc.nextInt();

		for(int j=pivot;j<size-1;j++){
			System.out.print(arr[j]);
		}
		for(int k=0;k<pivot;k++){
			System.out.print(arr[k]);
		}
	}
}
