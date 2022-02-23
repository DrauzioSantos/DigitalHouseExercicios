package ExercicioRepeticao;

import java.util.Scanner;

public class Exercicio05 {
/*Crie um programa que leia um número do teclado até que encontre um número 
 *igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int N, soma=0;
		
		do
		{
			System.out.println("\nDigite um número ou 0 (zero) para encerrar: ");
			N = leia.nextInt();
			soma+=N;
			
		}
		while (N != 0);
		
		System.out.println("\nA soma dos números é: "+soma);
	}

}