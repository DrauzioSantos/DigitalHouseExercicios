package PortoSeguro;

import java.util.Scanner;

public class Repeticao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabuada,x=1,resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com qual tabuada deseja montar: ");
		tabuada = leia.nextInt();
		
		do 
		{
			resultado = x * tabuada;
			System.out.println("\n"+tabuada+"X"+x+"="+resultado);
			x++;
		}
		while(x<=10);
	}

}
