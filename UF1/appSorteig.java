/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf1.projecte.exercici.d.integració;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class appSorteig {

    /**
     * @param args the command line arguments
     */
    private static final String MSG_1 = "Introdueix el teu id: ";
    private static final String MSG_2 = "Introudeix la teva edat: ";
    private static final String MSG_3 = "Introudeix el tipus de venda: ";
    private static final String MSG_4 = "Introudeix l'import de la compra: ";
    private static final String MSG_5 = "Introudeix el teu telèfon de contacte: ";
    private static final String MSG_6 = "Error en les dades";
    private static final String MSG_7 = "Dada correcta. Has escrit";

    public static void main(String[] args) {

        int id, edat, tipusdevenda, importedelacompra, telefoncontacte;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(MSG_1);
            id = sc.nextInt();
            if ((id < 111) || (id > 999));
            //Tot correcte
            System.out.println(MSG_7 + id);

            do {
                System.out.println(MSG_2);
                edat = sc.nextInt();
            } while ((edat < 14) || (edat > 120));
            //Tot correcte
            System.out.println(MSG_7 + edat);

            do {
                System.out.println("tipus de venda?:");
                System.out.println("venda lliure (0)");
                System.out.println("pensionista (1)");
                System.out.println("carnet jove (2)");
                System.out.println("soci (3)");
                System.out.println(MSG_3);
                tipusdevenda = sc.nextInt();
            } while ((tipusdevenda < 0) || (tipusdevenda > 3));
            //Tot correcte
            System.out.println(MSG_7 + tipusdevenda);

            do {
                System.out.println(MSG_4);
                importedelacompra = sc.nextInt();
            } while ((importedelacompra < 0) || (importedelacompra > 1000));
            //Tot correcte
            System.out.println(MSG_7 + importedelacompra);

            do {
                System.out.println(MSG_5);
                telefoncontacte = sc.nextInt();
            } while ((telefoncontacte < 111111111) || (telefoncontacte > 999999999));
            //Tot correcte
            System.out.println(MSG_7 + telefoncontacte);

          
    
}
