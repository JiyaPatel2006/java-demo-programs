import java.util.Scanner;
class student{
	String name;
	int roll_no;
	double spi;
	String cource;

   public void setter(){
   	Scanner sc=new Scanner(System.in);
   	System.out.println("enter name,roll_no,spi,cource");
   	this.name=sc.nextLine();
   	this.roll_no=sc.nextInt();
   	this.spi=sc.nextDouble();
   	sc.nextLine();
   	this.cource=sc.nextLine();

   }

   public void getter(){
   	System.out.println("name="+name+", roll_no="+roll_no+", spi="+spi+", cource="+cource);
   }
}


public class getter{
	public static void main(String[] args){
     student stu=new student();
    
     stu.setter();
      stu.getter();
	}
}