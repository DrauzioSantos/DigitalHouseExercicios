package ExercicioRepeticao;

import java.util.Scanner;

public class Exercicio01 {
/*Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.(FOR) */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int n;
		
		for(n=1000; n<=1999; n++)
		
		if (n%11 == 5)	
		{
			System.out.println("\nDivisíveis por 11 obtido resto 5: "+n);
		}
		
	}

}