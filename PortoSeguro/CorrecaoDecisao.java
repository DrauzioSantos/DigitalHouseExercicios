package PortoSeguro;

import java.util.Scanner;

public class CorrecaoDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		try (Scanner leia = new Scanner(System.in)){
			System.out.println("\nEntre com um número: ");
			numero = leia.nextInt();
		}
		if(numero % 2 ==0)
 		{
 			if(numero>=0)
 			{
 				System.out.println("\nEsse número é PAR e positivo.");
 			}
 			else
 			{
 				System.out.println("\nEsse número é PAR e negativo.");
 			}
 			
 		}
 		else 
 		{
 			if(numero>=0)
 			{
 				System.out.println("\nEsse número é ÍMPAR e positivo.");
 			}
 			else
 			{
 				System.out.println("\nEsse número é ÍMPAR e negativo.");
 			}
 		}
		
	}
		
}