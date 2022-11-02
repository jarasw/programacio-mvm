/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Ex8 {
  private static final String MSG_1 = "Introdueix un número";
  private static final String MSG_2 = "El número es natural";
  private static final String MSG_3 = "El número no es natural";
    /**
     *
     * @param args
     */
    public static void main(String[] args){
          int num1;
          Scanner sc = new Scanner(System.in);
          
          System.out.println(MSG_1);
          num1 = sc .nextInt();
          if (num1 >= 0) {
              System.out.println (MSG_2);
          }
          else{ 
              System.out.println(MSG_3);
          }
  }
}

            
        
