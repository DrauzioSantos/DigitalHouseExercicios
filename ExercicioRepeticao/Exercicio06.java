package ExercicioRepeticao;

import java.util.Scanner;

public class Exercicio06 {
/*Escrever um programa que receba vários números inteiros no teclado. 
 *E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		float n, media, qtdNum=0, soma=0;
		
		do
		{
			System.out.println("\nDigite um número inteiro ou 0 (zero) para encerrar: ");
			n = leia.nextFloat();
			
			if (n % 3 == 0 && n != 0)
			{
				soma += n;
				qtdNum++;
			}
		}
		while (n != 0);
		
		if (qtdNum !=0)
		{
			media = soma / qtdNum;
			System.out.printf("\nA média dos números múltiplos de 3 é %2.2f",media);
		}
		else 
		{
			System.out.println("\nNão houve número múltiplo de 3 digitado...");
		}
	}

}