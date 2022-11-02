package cat;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumne_1r
 */
public class Ex16 {
    
private static final String MSG_1 = "Introdueix un número";   
private static final String MSG_2 = "Introdueix un altre número"; 
private static final String MSG_3 = "Has introduït el número"; 
 private static final String MSG_4 = "Has exedit el 3 intents"; 

public static void main(String[] args){
    
    int num, count = 3;
    
    Scanner sc = new Scanner(System.in);
    System.out.println(MSG_1);
    num = sc.nextInt();
    System.out.println("");
    
    System.out.println(MSG_2);
    num = sc.nextInt();
    System.out.println("");

    //he pedido dos numeros 
    System.out.println(MSG_3);
    }
}



    

