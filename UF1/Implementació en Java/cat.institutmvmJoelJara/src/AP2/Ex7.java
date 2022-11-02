/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AP2;

/**
 *
 * @author jaraj
 */
public class Ex7 {
    
    private static final String MSG_1 = "Aquests són el números de l'1 al 10";
    private static final String MSG_2 = "Aquests són el números de l'1 al 100";
    
    public static void main(String[] args) {
        int cont = -1, nums = 0;
    
    //Ex7a
    System.out.println(MSG_1);
    while (cont < 10) {
        cont = cont + 1;
        System.out.println(cont);
        
    }
    
    //Ex7b
    System.out.println(MSG_2);
    cont = -1;
    while (cont < 100) {
        cont = cont + 1;
        System.out.println(cont);
    }
    
    //Ex7c    
        int i = 0;
        
        while (i < 100) {  
            i= i + 2;
            System.out.println(i);
        } 
    }    
    //Ex7d         
        int i = 100;
        
        while (i >= 0) { 
        System.out.println(i);
            i--;  
        }
    }

    

