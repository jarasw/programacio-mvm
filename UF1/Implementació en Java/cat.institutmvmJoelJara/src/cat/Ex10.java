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
public class Ex10 {

    private static final String MSG_1= "Introdueix un número";
    private static final String MSG_2= "Està dins de l'interval";
    private static final String MSG_3= "Està fora de l'interval, inserta de nou";
    private static final String MSG_4= "Has exedit els 3 intents permitits";

    public static void main(String[] args) {
        int num, count = 3;
        Scanner sc = new Scanner(System.in);
        
        System.out.println(MSG_1);
        num = sc.nextInt();
        while ((num < 1 | num > 100) && count < 2) {
            System.out.println(MSG_3);
            num = sc.nextInt();
            count++;
        }
        if (count == 2) {
            System.out.println(MSG_4);
        } else {
            System.out.println(MSG_2);
        }

    }

}

