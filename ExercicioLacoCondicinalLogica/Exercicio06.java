package ExercicioLacoCondicinalLogica;

import java.util.Scanner;

public class Exercicio06 {
/*Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("\nDigite a idade do nadador: ");
		idade = leia.nextInt();
		
		if (idade<5)
		{
			System.out.println("\nIdade não permitida.");
		}
		else if (idade>=5 && idade<=7)
		{
			System.out.println("\nNadador Infantil A.");
		}
		else if (idade>7 && idade<=11)
		{
			System.out.println("\nNadador Infantil B.");
		}
		else if (idade>11 && idade<=13)
		{
			System.out.println("\nNadador Infantil C.");
		}
		else if (idade>13 && idade<=17)
		{
			System.out.println("\nNadador Infantil D.");
		}
		else
		{
			System.out.println("\nNadador Adulto.");
		}	
				
	}

}