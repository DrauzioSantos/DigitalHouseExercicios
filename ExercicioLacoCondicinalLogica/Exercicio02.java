package ExercicioLacoCondicinalLogica;

import java.util.Scanner;

public class Exercicio02 {
/*Elabore um sistema que leia as variáveis C e N, respectivamente código 
 * e número de horas trabalhadas de um operário. E calcule o salário 
 * sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas 
 * exceder a 50 calcule o excesso de pagamento armazenando-o na variável 
 * E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00.
 * No final do processamento imprimir o salário total e o salário excedente.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float c, n, e, SalAtual, SalExcedente, SalTotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite seu código: ");
		c = leia.nextFloat();
		
		System.out.println("\nDigite as horas trabalhadas: ");
		n = leia.nextFloat();
		
		if (n>50)
		{
			SalAtual = n * 10;
			e = n - 50;
			SalExcedente = e * 20;
			SalTotal = SalExcedente + SalAtual;
			
			System.out.printf("\nSalário Atual de R$%3.2f",SalAtual);
			System.out.printf("\nSalário Excedente de R$%3.2f",SalExcedente);
			System.out.printf("\nSalário Total de R$%3.2f", SalExcedente+SalAtual);
		}
		else
		{
			SalAtual = n *10;
			SalExcedente = 0;
			System.out.printf("\nSalário Atual de R$%3.2f",SalAtual);
			System.out.printf("\nSalário Excedente de R$%2.2f",SalExcedente);
		}
	}

}