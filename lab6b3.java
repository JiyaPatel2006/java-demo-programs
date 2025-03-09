class demo{
	static int count=0;


public demo(){
	count++;

}
public static void display(){
	System.out.println("total object"+count);
}
}
public class lab6b3{
	public static void main (String[] args){
		demo obj1=new demo();
		demo obj2=new demo();
		demo obj3=new demo();
		demo.display();

	}
}