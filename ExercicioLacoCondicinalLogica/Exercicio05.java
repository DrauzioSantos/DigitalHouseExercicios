package ExercicioLacoCondicinalLogica;

import java.util.Scanner;

public class Exercicio05 {
/*A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 
 * grupos de indústrias que são altamente poluentes do meio ambiente.O índice 
 * de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as 
 * indústrias do 1º grupo são intimadas a suspenderem suas atividades,se o índice
 * crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem 
 * suas atividades, se o índice atingir 0,5 todos os grupos devem ser notificados 
 * a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
 * medido e emita a notificação adequada aos diferentes grupos de empresas.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		float i;
		
		System.out.println("\nQual o Índice?: ");
		i = leia.nextFloat();
		
		if (i>=0.05 && i<=0.25)
		{
			System.out.printf("\nPoluição aceitável.");
		}
			else if (i>0.25 && i<=0.3)
			{
				System.out.println("\nSuspender atividades: Grupo 1");
			}
			else if (i>0.3 && i<=0.4)
			{
				System.out.println("\nSuspender atividades: Grupo 1 e 2.");
			}
			else if (i>0.4 && i<=0.5)
			{
				System.out.println("\nSuspender atividades: Grupo 1, 2 e 3.");
			}
		else 
		{
			System.out.println("\nÍndice não classificado.");
		}
	}
}