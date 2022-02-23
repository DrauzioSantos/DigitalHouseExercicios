package ExercicioLacoCondicinalLogica;

import java.util.Scanner;

public class Exercicio08 {
/*Construa um sistema para ler uma variável numérica N e imprimi-la somente se a
  mesma for maior que 100, caso contrário imprimi-la com o valor zero.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite o valor: ");
		n = leia.nextInt();
		
		if (n>=100)
		{
			System.out.println("\nO valor digitado é: "+n);
		}
		else
		{
			n = 0;
			System.out.println("\nO valor digitado é: "+n);
		}
		
	}

}