package ExercicioRepeticao;

import java.util.Scanner;

public class Exercicio04 {
/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas 
 * dos indivíduos de uma região. Para tanto, a cada uma das pessoas era 
 * perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int I,OpSexo,OpTemp,Pessoas=0,Fem=0,Masc=0,Outros=0,
			PessoasCalmas=0,MulheresNervosas=0,HomensAgressivos=0,
			OutrosCalmos=0,Mais40=0,Menos18=0;
		
		while (Pessoas<3)
		{
			System.out.print("\nDigite sua idade: ");
			I = leia.nextInt();
			
			System.out.println("\nDigite a opção do Sexo: ");
			System.out.println("\nDigite 1 para Masculino: ");
			System.out.println("\nDigite 2 para Feminino: ");
			System.out.println("\nDigite 3 para Outros: ");
			OpSexo = leia.nextInt();
			
			System.out.println("\nDigite o seu Temperamento: ");
			System.out.println("\nDigite 1 para Calmo(a): ");
			System.out.println("\nDigite 2 para Nervoso(a): ");
			System.out.println("\nDigite 3 para Agressivo(a): ");
			OpTemp = leia.nextInt();
			
			switch (OpSexo)
			{
			case 1:
				Masc++;
				break;
				
			case 2:
				Fem++;
				break;
			
			case 3:
				Outros++;
				break;
			
			default:
				System.out.println("D\nigite uma opção válida: ...");
			}
			
			switch (OpTemp)
			{
			case 1:
				PessoasCalmas++;
				
				if (I<18)
				{
					Menos18++;
				}
				else if (OpSexo == 3)
				{
					OutrosCalmos++;
				}
				break;
				
			case 2:
				if (I>40)
				{
					Mais40++;
				}
				else if (OpSexo == 2)
				{
					MulheresNervosas++;
				}
				break;
			
			case 3:
				if (OpSexo == 1)
				{
					HomensAgressivos++;
				}
				break;
				
			default:
				System.out.println("Digite uma opção válida:...");
			}
			
			Pessoas++;
		}
			
			System.out.println("\nPessoas Calmas: "+PessoasCalmas);
			System.out.println("\nMulheres Nervosas: "+MulheresNervosas);
			System.out.println("\nHomens Agressivos: "+HomensAgressivos);
			System.out.println("\nOutros Calmos: "+OutrosCalmos);
			System.out.println("\nPessoas Nervosas com mais de 40 anos: "+Mais40);
			System.out.println("\nPessoas Nervosas com menos de 18 anos: "+Menos18);
			
	}
}