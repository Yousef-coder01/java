/*
Course : CPCS 202
Name : Yousef Mohammed Hassan Idris
University ID : 2436210
Section : F4
Name of lab instructor : جواد خيمي
Problem number : #5
Assignment number : #1
Beecrowd id : F4_2436210_Yousef_Idris
 */
import java.util.Scanner;
import java.lang.Math;
public class Problem_5Java {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
       
         System.out.print("current time: ");
         int current = in.nextInt();
         System.out.print("Flight time: ");
         int flight = in.nextInt();
         String time = getTimeDiff(current,flight);
        System.out.println(time);
    }
    public static String getTimeDiff(int current,int flight){
        int currenthour = current/100 ,currentmin= current%100,flighthour = flight/100,flightmin= flight%100;
        int totalminc = (currenthour*60)+currentmin;    
        int totalminf =(flighthour*60)+flightmin;
        
        if(totalminc > totalminf)
            totalminf+=(24*60);
        
        int diff = totalminf-totalminc;
        
       int hours = diff/60,min=diff%60;
       
       String x = "Time difference: "+hours+" hrs and "+min+" minutes";
       return x;
    }
    
}
