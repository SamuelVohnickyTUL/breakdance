package vohnicky;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author samuel.vohnicky
 */
public class PoziceVTabulce {
    {
    
    Scanner myObj = new Scanner(System.in);
        System.out.print("Zadejte první číslo");
        String num1 = myObj.nextLine();
        int num2 = Integer.parseInt(num1);
        
        System.out.print("Zadejte druhé číslo");
        String num3 = myObj.nextLine();
        int num4 = Integer.parseInt(num3);
        
        int soucet = num2+num4;
        int soucin = num2*num4;
        
        System.out.print("Jejich součet je:");
        System.out.print(soucet);
        System.out.print("Jejich součin je:");
        System.out.print(soucin);
        
        System.out.print("Zadejte Slouoec:");
        String sloupec = myObj.nextLine();
        System.out.print("Zadejte řádek:");
        String radek = myObj.nextLine();
        

    }
}