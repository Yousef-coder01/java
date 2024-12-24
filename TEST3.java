/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test.pkg3;

/**
 *
 * @author idris
 */
import java.util.Scanner;
import java.lang.Math;
public class TEST3 {
    
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
int list[] = {1,2,3,4,5,6,7,8,9,10,11};

for(int x : list){
    System.out.print(x+" ");
}
for(int i = 0; i< list.length; i++){
    int j = (int)(Math.random()*list.length);
    int temp = list[i];
    list[i]=list[j];
    list[j] = temp;
}
        System.out.println("");
for(int x : list){
    System.out.print(x+" ");
}
    }
}