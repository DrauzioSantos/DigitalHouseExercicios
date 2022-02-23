package ExercicioLacoCondicinalLogica;

import java.util.Scanner;

public class Exercicio03 {
/*Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float N1,N2,N3,N4;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite o primeiro número: ");
		N1 = leia.nextFloat();
		
		System.out.println("\nDigite o segundo número: ");
		N2 = leia.nextFloat();
		
		System.out.println("\nDigite o terceiro número: ");
		N3 = leia.nextFloat();
		
		System.out.println("\nDigite o quarto número: ");
		N4 = leia.nextFloat();
		
		N1 = N1*N1;		
		N2 = N2*N2;
		N3 = N3*N3;
		N4 = N4*N4;
		
		if (N3>=1000)
		{
			System.out.printf("\nA raíz quadrada do terceiro número é maior ou igual a 1000: %.0f",N3);
		}
		else
		{
			System.out.printf("\nA raíz quadrada do primeiro número é %.0f",N1);
			System.out.printf("\nA raíz quadrada do segundo número é %.0f",N2);
			System.out.printf("\nA raíz quadrada do terceiro número é %.0f",N3);
			System.out.printf("\nA raíz quadrada do quarto número é %.0f",N4);
		}
		}	
	}