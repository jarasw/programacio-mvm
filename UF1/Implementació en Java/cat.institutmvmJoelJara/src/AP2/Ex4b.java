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
public class Ex4b {

    private static final String MSG_1 = "Introdueix un mes per número: ";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        num = sc.nextInt();

        if (num >= 1 || num <= 12) {
            switch (num) {
                case 1:
                    System.out.println("Gener");
                    break;
                case 2:
                    System.out.println("Febrer");
                    break;
                case 3:
                    System.out.println("Març");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maig");
                    break;
                case 6:
                    System.out.println("Juny");
                    break;
                case 7:
                    System.out.println("Juliol");
                    break;
                case 8:
                    System.out.println("Agost");
                    break;
                case 9:
                    System.out.println("Septembre");
                    break;
                case 10:
                    System.out.println("Octubre");
                    break;
                case 11:
                    System.out.println("Novembre");
                    break;
                case 12:
                    System.out.println("Desembre");
                    break;
            }
        }
    }
}
