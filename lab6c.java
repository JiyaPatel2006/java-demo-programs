class demo{
	int number;
	static int count;

public demo(){
	this.number=number;
	this.count=count;
}

}
public class lab6c{
	public static void main(String[] args){
		demo obj1=new demo();
		obj1.number=1;
		obj1.count=1;
		demo obj2=new demo();
		obj2.number=2;
		obj2.count=2;
		System.out.println(obj1.number);
		System.out.println(obj1.count);
		System.out.println(obj2.number);
		System.out.println(obj2.count);

	}
}
