package PortoSeguro;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome; //nas variáveis declarar a tipagem somente, no caso: String(caracteres)
		int X,Y,idade=26;
		double altura, Nota1, Nota2, Nota3, media;
		
		Scanner leia = new Scanner(System.in);//declara a entrada de dados
		
		System.out.println("Olá Mundo!");//declara a saída de dados
			
		System.out.println("\nEntre com o seu nome: ");//"\n" pula uma linha 
		nome = leia.nextLine();//pegando a entrada do usuário
		System.out.println("\nEntre com a sua altura: ");
		altura = leia.nextFloat();
		
		System.out.println("\nEntre com a primeira nota: ");
		Nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		Nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceita nota: ");
		Nota3 = leia.nextFloat();
		
		media = (Nota1+Nota2+Nota3) / 3;
		
		if(media>=7 && media<=10)
		{
			System.out.println("\nAluno aprovado!!!");
		}
		else if(media>=5 && media<7)
		{
			System.out.println("\nAluno de Exame!!!");
		}
		else if (media>=0 && media<5)
		{
			System.out.println("\nAluno Reprovado!!!");
		}
		else if (media>0 && media<5)
		{
			System.out.println("\nMédia inválida!!!");
		}
		
		System.out.println("\nMeu nome é: "+nome+" eu tenho "+idade+" ano(s) e a minha altura é "+altura);
		
		System.out.printf("\nA Média Aritmética é: %2.2f", media);//printf para impressão na tela
		
		Nota1 = Math.sqrt(Nota2);//raíz quadrada 
		Nota2 = Math.pow(Nota3, 3);// potência
		
		System.out.println("\nEntre com o valor de X");
		X = leia.nextInt();
		System.out.println("\nEntre com o valor de Y");
		Y = leia.nextInt();
		
		X = X % Y; 
		
	}

}