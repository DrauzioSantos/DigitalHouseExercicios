package ExercicioRepeticao;

import java.util.Scanner;

public class Exercicio03 {
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com 
 * menos de 21 anos. Total de pessoas com mais de 50 anos. O programa 
 * termina quando idade for =-99. (WHILE)*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
	
		int idade, menos21=0, mais50=0;
		
		System.out.println("\nDigite a idade ou -99 para encerrar o programa: ");
		idade = leia.nextInt();
		while (idade != -99)
		{
			System.out.println("\nDigite a idade ou -99 para encerrar o programa: ");
			idade = leia.nextInt();
			
			
			if (idade <=21)
			{
				menos21++;
			}
			if(idade >=50)
			{
				mais50++;
			}
			else if (idade == -99)
			{
				System.out.println("\nPrograma encerrado!!!");
			}
			
		}
		System.out.println("\nPessoas com 21 anos ou menos: "+menos21);
		System.out.println("\nPessoas com 50 anos ou mais: "+mais50);
			
	}

}