/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AP2;

import java.util.Scanner;

/**
 *
 * @author jaraj
 */
public class Ex9 {

    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);

        System.out.println("Introdueix el primer número");
        int num1 = sr.nextInt();

        System.out.println("Introdueix el segon número");
        int num2 = sr.nextInt();

        float resultat = (num1 + num2) / 2;

        System.out.println("La mitjana aritmética és " + resultat);
    }
}
