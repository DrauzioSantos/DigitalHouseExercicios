package ExercicioLacoCondicinalLogica;

import java.util.Scanner;

public class Exercicio07 {
/*Receber valores de base e altura de um triângulo e verificar se são valores válidos 
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int b,h;
		float a;
		
		System.out.println("\nDigite o valor da base do triângulo: ");
		b = leia.nextInt();
		
		System.out.println("\nDigite o valor da altura:");
		h = leia.nextInt();
		
		if (b>=0 && h>=0)
		{
			a= (b * h) / 2;
			System.out.printf("\nA área do Triângulo é: %.0f",a);
		}
		else
		{
			System.out.printf("\nValores inválidos.");
		}
		
	}

}