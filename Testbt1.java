
package test;

import java.util.Random;
import java.util.Scanner;


public class Testbt1 {
    
    public static void main(String[] args) {
        System.out.println("Chuong Trinh Xo So");
        
        System.out.print("Nhap so du doan: ");
        Scanner bien1 = new Scanner(System.in);                
        int valueInt = bien1.nextInt();
        
        
        System.out.print("So ma ban da chon: ");
        System.out.printf("%02d\n",valueInt);
        
        int sodau = valueInt /10;
        int sosau = valueInt %10;
        System.out.println(valueInt);
        System.out.print("Ket qua xo so: ");
        Random bien2 = new Random();     
        int ngaunhien = bien2.nextInt(10);
        System.out.printf("%02d\n",ngaunhien);
        int bien3 = ngaunhien / 10;
        int bien4 = ngaunhien % 10;
        
        if (valueInt == ngaunhien)
        {
            System.out.println("Chuc mung ban da trung $10,000");
            
        }else if (valueInt==00 && ngaunhien==00) {
            System.out.println("Chuc mung ban da trung $10,000");
            
        }else if (sodau == bien4 && sosau == bien3) {
            System.out.println("Chuc mung ban da trung $3,000");
            
        }else if (bien3 == sodau||bien3 == sosau ||bien4 == sodau||bien4 == sosau  ) {
            System.out.println("Chuc mung ban da trung $1,000");
            
        }else{
            System.out.println("Cut");
        }        
        System.out.println("");
    }
    
}
