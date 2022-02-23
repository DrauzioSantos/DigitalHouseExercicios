package ExercicioLacoCondicinalLogica;

import java.util.Scanner;

public class Exercicio01 {
/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar 
 * o rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate 
 * maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
 * deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça 
 * um sistema que leia a variável P (peso de tomates) e verifique se há excesso. 
 * Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que 
 * João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float P=0, E=0, M=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite o Peso(KG): ");
		P = ler.nextFloat();
		
		if (P<=50)
		{
			System.out.println("\nNão pagará a multa.");
		}
		else
		{
			M=(P-50)*4;
			System.out.printf("\nPagará a multa de: R$%2.2f",M);
			System.out.printf("\nExcesso de: %2.2f Kg",P-50);
		}
	}
}