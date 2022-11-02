/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AP2;

import java.util.Scanner;

public class Ex3a {

    private static final String MSG_1 = "Introdueix un número:";

    public static void main(String[] args) {
        //Ex3a
        float num1;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        if (num1 >= 0) {
            System.out.println("El número es positiu");
        } else {
            System.out.println("El número es negatiu");
        }
    }
}
