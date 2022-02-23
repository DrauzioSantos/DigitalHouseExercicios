package PortoSeguro;

import java.util.Scanner;

public class Repeticao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,media,somaMedia=0,mediaGeral;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=1;x<=5;x++)//x = x + 1
		{
			System.out.println("\nNotas do aluno "+x+" : ");
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			while(n1<0 || n1>10)
			{
				System.out.println("\nVocê digitou um valor fora de 0 a 10...\nEntre com a primeira nota: ");
			}
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			while(n2<0 || n2>10)
			{
				System.out.println("\nVocê digitou um valor fora de 0 a 10...\nEntre com a segunda nota: ");
			}
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			while(n3<0 || n3>10)
			{
				System.out.println("\nVocê digitou um valor fora de 0 a 10...\nEntre com a terceira nota: ");
			}
			
			media = (n1+n2+n3) / 3;
			
			somaMedia = somaMedia + media;// ou somaMedia += media
			
		}

		mediaGeral = somaMedia / 5;
		System.out.printf("\nMedia Geral: %2.2f",mediaGeral);
		
	}

}
