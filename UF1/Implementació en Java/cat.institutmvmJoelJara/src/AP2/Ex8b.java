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
public class Ex8b {

    private static final int VAL = 0;
    private static final String MSG_1 = "Quants números introduiràs: ";
    private static final String MSG_2 = "Introdueix un número:";

    public static void main(String[] args) {
        int i, num, count = 0;
        Scanner sr = new Scanner(System.in);
        do {
            System.out.println(MSG_1);
            i = sr.nextInt();
        } while (VAL > 1);

        while (count < i) {
            System.out.println(MSG_2);
            num = sr.nextInt();
            count++;
        }

    }
}
