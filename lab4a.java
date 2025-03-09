import java.util.Scanner;
public class lab4a{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.nextLine();
        int i;
        int vcount=0,ccount=0;
		for(i=0;i<s1.length();i++){
			char ch=s1.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
				vcount++;
			}else{
				ccount++;
			}

		}
		System.out.println("vowel="+vcount);
		System.out.println("consonant="+ccount);

	}

}