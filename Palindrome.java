/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author idris
 */
import java.util.Scanner;
public class Palindrome {

    static Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static boolean isVaild(int pass){
        int num = pass,reverse = 0,digit;
        while(num > 0){
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println(reverse);
        return reverse == pass;
        
    }
            
    public static void main(String[] args) {
        System.out.print("Input a password : ");
        int pass = in.nextInt();
         boolean validity = isVaild(pass);
         
         if(validity)
             System.out.println(pass+" is valid password");
         else
             System.out.println(pass+" is not valid password");
         
         
         System.out.println(pass%10);
       
         System.out.println((6*10+5)*10+4);   
    }
    
}
