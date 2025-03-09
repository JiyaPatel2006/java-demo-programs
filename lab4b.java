import java.util.Scanner;
public class lab4b{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.nextLine();
		int len=s1.length();
		System.out.println("length="+len);
        int i;
        
		for(i=len/2;i<len;i++){
			char ch=s1.charAt(i);
			System.out.println("ch="+ch);
		}
	}
}