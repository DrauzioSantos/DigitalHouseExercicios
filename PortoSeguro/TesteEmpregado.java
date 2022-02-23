package PortoSeguro;

public class TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		POO_Empregado [] lista = new POO_Empregado[3];
		
		lista [0] = new POO_Empregado("Ana Kélvia",10000);
		lista [1] = new POO_Empregado("Lucas Theberge",11000);
		lista [2] = new POO_Empregado("Leticia Toffoli",30000);
		
		
		for(POO_Empregado roda:lista)
		{
			roda.imprimir();
		}
		
		System.out.println("*********************************************");
		
		for(POO_Empregado roda:lista)
		{
			roda.aumentarSalario(10);
			roda.imprimir();
		}
		
	}

}