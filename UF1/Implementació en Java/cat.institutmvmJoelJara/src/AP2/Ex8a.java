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
public class Ex8a {

    private static final int VAL = 0;
    private static final String MSG_1 = "Introdueix un número enter: ";
    private static final String MSG_2 = "Incorrecte";

    public static void main(String[] args) {
        int num1 = 1;
        Scanner sr = new Scanner(System.in);
        while (num1 != VAL) {

            do {
                System.out.println(MSG_1);
                num1 = sr.nextInt();
            } while (num1 < VAL);
        }
        System.out.println(MSG_2);
    }
}
