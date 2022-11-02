/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Ex12a {
    private static final String MSG_2 = "Introdueix un número";
    private static final String MSG_3 = "Introdueix la medida de la base";
    private static final String MSG_1 = "Esta es l'area del triangle";
    
    public static void main(String[] args) {
        int num1, num2, real;
        
        Scanner base = new Scanner (System.in);
        System.out.print(MSG_2);
        System.out.println("");
        System.out.println("");
        
        num1= base.nextInt();
        System.out.println("");
        
        System.out.print(MSG_3);
        System.out.println("");
        System.out.println("");
        num2 = base.nextInt();
        real = (num1*num2/2);
        
        System.out.println(MSG_1 + real);
        
        
        
    }

}
