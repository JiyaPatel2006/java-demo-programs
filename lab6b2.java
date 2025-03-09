import java.util.Scanner;

class CompalexNum{
    int a1;
    int a2;
    int b1;
    int b2;
   

    public CompalexNum(int a1,int a2,int b1,int b2){ 
         this.a1 = a1;
         this.a2 = a2;
         this.b1 = b1;
         this.b2 = b2;

    }

    public void addition(){
        int a=0,b=0;
        b =this.b1+this.b2;
        if(b>9){
            a++;
        }
        a = this.a1+this.a2;
       
        System.out.println("Answer is = "+a+" + "+b+"i");
    }
}



public class lab6_5 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a1 and a2 :");
       int a1 = sc.nextInt();
       int a2 = sc.nextInt();
       System.out.println("enter b1 and b2 :");
       int b1 = sc.nextInt();
       int b2 = sc.nextInt();
        
       CompalexNum b3 = new CompalexNum(a1,a2,b1,b2);
       b3.addition();

   } 
}