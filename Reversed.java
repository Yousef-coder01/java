/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author idris
 */
import java.util.Scanner;
import java.lang.Math;
public class Reversed {

static Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Enter the array limit: ");
        int arraysize=in.nextInt();
        int list[]= new int[arraysize];
        
        for(int i =0;i<list.length;i++){
        list[i]=(int)(1+Math.random()*10);
    }
        for(int i = 0; i<list.length;i++){
            sum = (list[i]%2 == 0) ? sum : sum+list[i];}
        
        System.out.print("The reversed array: {");;
        for(int i = (arraysize-1); i >= 0 ;i--){
        System.out.print(list[i] + (i > 0 ? ", " : "}"));
    }
        System.out.println("");
        System.out.println("Sum of the indices of all odd numbers in the original array: "+sum);
        System.out.println(2%2);
        int listk[];
        
    }
    
}
