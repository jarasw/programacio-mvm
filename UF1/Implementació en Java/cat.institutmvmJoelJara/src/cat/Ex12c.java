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
public class Ex12c {
    
    private static final String MSG_1 = "Introdueix tres nombres enters";
    private static final String MSG_2 = "La suma dels dos primers valors és més gran que el tercer valor";
    private static final String MSG_3 = "La suma dels dos primers valors són iguals";
    private static final String MSG_4 = "La suma dels dos primers valors és més petita que el tercer valor";

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sr = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sr.nextInt();
        num2 = sr.nextInt();
        num3 = sr.nextInt();
        if (num1 + num2 > num3) {
            System.out.println(MSG_2);
        } else if (num1 + num2 == num3) {
            System.out.println(MSG_3);
        } else {
            System.out.println(MSG_4);
        }                
    }
}
