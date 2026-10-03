package HACKATHON;

import java.util.Scanner;
class EnergySystem{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter energy generated");
        double en=sc.nextDouble();
         System.out.println(" energy generated is: " +en+"Kwh");
         if(en>=10){
             System.out.println("good energy generation");
         }else{
             System.out.println("bad energy generation");
         }

    }
}
