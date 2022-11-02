/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AP2;


/**
 *
 * @author jaraj
 */
import java.util.Scanner;

public class Ex1d {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int rows, columns, i, j;
		sc = new Scanner(System.in);
		
		System.out.print(" Introudeix el número de files : ");
		rows = sc.nextInt();	
		
		System.out.print(" Introdueix el número de columnes : ");
		columns = sc.nextInt();		
			
		for(i = 1; i <= rows; i++)
		{
			for(j = 1; j <= columns; j++)
			{
				System.out.print("* "); 
			}
			System.out.print("\n"); 
		}	
	}
}