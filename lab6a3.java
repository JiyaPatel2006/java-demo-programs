import java.util.Scanner;
class Time{
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second=second;
    }

    

    public Time addition(Time temp){
        Time ans = new Time(0,0);
         ans.minute = this.minute + temp.minute;
        ans.hour = this.hour + temp.hour;
         ans.second=this.second+temp.second;  
        return ans; 
    }

    public void printTime(){
        System.out.println("Hour = "+this.hour+" and Minute = "+this.minute);
    }
}

public class TimeDemo{
    public static void main(String[] args){
        Time t1 = new Time(5,30);
        Time t2 = new Time(3,20);

        Time a = t1.addition(t2);
        a.printTime();
    }
}