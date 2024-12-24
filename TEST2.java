/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test2;

/**
 *
 * @author idris
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class TEST2 {
public static Scanner in = new Scanner(System.in);


public static void main(String[] args) {
    System.out.print("Enter number of Students: ");
    int n = in.nextInt();
    int ratings[]=new int[n];
    System.out.print("Enter "+n+" ratings: ");
    for(int i =0 ;i<ratings.length;i++){
        ratings[i] = in.nextInt();
       }
    int count;
    int freq[] = new int[n];
    for(int i = 0 ; i<ratings.length;i++){
        count = ratings[i];
        freq[count]++;
    }
    System.out.println("Analysis of rating:");
    for(int i =1 ; i<6;i++){
        System.out.println(i+"-->"+freq[i]);
    }
        
    }
    }




//400.9 143.2 8000.8 249 5555 700 797 887 920 1750.5 
/*for(int i = 0; i<10;i++){
if(R1[i]<1000){
System.out.println(i+" "+R1[i]);
}else{
  R1[i]+=100;8*/  