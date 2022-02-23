package ExercicioRepeticao;

import java.util.Scanner;

public class Exercicio02 {
	/*Ler 10 números e imprimir quantos são pares e quantos são ímpares.(FOR)*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int n,par=0,impar=0;
		
		for (int v=1; v<=10; v++)
		{
			System.out.println("\nDigite o "+v+" valor: ");
			n = leia.nextInt();
			
			if (n%2==0)
			{
				par++;
			}
				else if (n%2==1)
			{
				impar++;
			}	
		}	
			System.out.println("\nQuantidade de números pares:"+par);
			System.out.println("\nQuantidade de números ímpares:"+impar);	
			
    }
	
}	