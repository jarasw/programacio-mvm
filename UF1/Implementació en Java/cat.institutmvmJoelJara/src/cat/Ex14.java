
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumne_1r
 */

public class Ex14 {


private static final String MSG_1 = "Torna a escriure un número del 0 al 10";    
private static final String MSG_2 = "Número correcte"; 
private static final String MSG_3 = "Escriu un número del 0 al 10";

public static void main(String[] args) {
    int numero;
    Scanner sc = new Scanner(System.in);
    
    System.out.println(MSG_3);
    numero = sc.nextInt();
    
    while (numero <= 0 || numero >= 10) {
        System.out.println(MSG_1);
        numero = sc.nextInt();
    }
    System.out.println(MSG_2);
    }
}

