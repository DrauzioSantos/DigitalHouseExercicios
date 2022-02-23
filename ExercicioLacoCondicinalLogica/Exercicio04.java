package ExercicioLacoCondicinalLogica;

import java.util.Scanner;

public class Exercicio04 {
/*Faça um sistema que leia um número inteiro e mostre uma mensagem 
*indicando se este número é par ou ímpar, e se é positivo ou negativo.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int N;
		
		System.out.println("\nDigite um número: ");
		N = leia.nextInt();
		
		if (N%2 == 0)
		{			
			if (N >=0)
			{
				System.out.println("\nO número é PAR e Positivo");
			}
			else
			{
				System.out.println("\nO número é PAR e Negativo.");
			}
		}
		else 
			if (N >=0)
			{
				System.out.println("\nO número é ÍMPAR e Positivo.");
			}
			else
			{
				System.out.println("\nO número é ÍMPAR e Negativo");
			}
	}

}