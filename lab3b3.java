import java.util.Scanner;
public class lab3b3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    System.out.println("enter range");
    int i=sc.nextInt();
    int j=sc.nextInt();
    int count=0;
    int num;
    
    if(n==0 || n==1){
      System.out.println("not prime");
    }

    for(num=n;n<=j;i++){
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
