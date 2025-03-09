import java.util.Scanner;;

class Vovel{
    String ch;

    public Vovel(String ch){
        this.ch = ch;
    }
     
   public void CountVovel(){
        int counta = 0;
        int counte = 0;
        int counti = 0;
        int counto = 0;
        int countu = 0;     

         for(int i=0 ; i<ch.length() ; i++){
            char v = ch.charAt(i);
            if(v=='a'){
                counta++;
            }
            else if(v=='e'){
                counte++;
            }
            else if(v=='i'){
                counti++;
            }
            else if(v=='o'){
                counto++;
            }
            else if(v=='u'){
                countu++;
            }
         }
         System.out.println("print vovel a="+counta);
         System.out.println("print vovel e="+counte);
         System.out.println("print vovel i="+counti);
         System.out.println("print vovel o="+counto);
         System.out.println("print vovel u="+countu);
         
         

   }
}



public class lab6b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
        System.out.println("enter your sentance :");
        String a = sc.nextLine();
         if(a.equals("quit")){
            break;
         }
        Vovel b1  = new Vovel(a);
        b1.CountVovel();
    }
}
}