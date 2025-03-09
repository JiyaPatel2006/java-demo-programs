import java.util.Scanner;
class Student{
	int id_no;
	int no_of_subjects_registered;
	int[] subject_code;
	int[] subject_credit;
	String[] grade_obtained;
	double spi;

	public Student(int id_no,int no_of_subjects_registered,int[] subject_code,int[] subject_credit,String[] grade_obtained){
		this.id_no=id_no;
		this.no_of_subjects_registered=no_of_subjects_registered;
		this.subject_code=subject_code;
		this.subject_credit=subject_credit;
		this.grade_obtained=grade_obtained;
		
		
	}
	public void print(){
		for(int i=0;i<no_of_subjects_registered;i++){
			System.out.println("subject code :"+subject_code[i]);
		   System.out.println("subject credit :"+subject_credit[i]);
		   System.out.println("subject grade obtained :"+grade_obtained[i]);

		}
		System.out.println("id no:"+id_no);
		   System.out.println("no of subject:"+no_of_subjects_registered);
	}
	public void printspi(){
		double sum=0;
		for(int k=0;k<no_of_subjects_registered;k++){
			if(grade_obtained[k].equals("a")){
				sum+=10*subject_credit[k];
			}
			else if(grade_obtained[k].equals("b")){
				sum+=9*subject_credit[k];
			}
			else if(grade_obtained[k].equals("c")){
				sum+=8*subject_credit[k];
			}
			else if(grade_obtained[k].equals("d")){
				sum+=7*subject_credit[k];
			}
			else {
				sum+=6*subject_credit[k];
			}
			
		}
		System.out.println("spi:"+sum);
	}



}


public class lab7a{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of students");
		int n=sc.nextInt();
		Student[] stu=new Student[n];
		

		for(int i=0;i<n;i++){
			System.out.println("enter id number ");
			int id=sc.nextInt();
			System.out.println("enter no_of_subjects_registered");
		    int no=sc.nextInt();

		    String[]grade_obtained=new String[no];
		    int[]subject_code=new int [no];
		    int[]subject_credit=new int[no];



			
			for(int j=0;j<no;j++){
			System.out.println("enter subject code");
			subject_code[j]=sc.nextInt();
			System.out.println("enter subject credit");
			subject_credit[j]=sc.nextInt();
			sc.nextLine();
			System.out.println("enter grade_obtained");
			grade_obtained[j]=sc.nextLine();

			}
						stu[i]=new Student(id,no,subject_code,subject_credit,grade_obtained);

			
		}
		for(int i=0;i<n;i++){
			stu[i].print();
			stu[i].printspi();
			
		}


		

	}
}