package PortoSeguro;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciando um objeto da Classe Automóvel
		POO_Automovel auto = new POO_Automovel("Rejane Santos","Celta","RSA2J34",2015);
		
		auto.imprimirInfo();
		System.out.println("\n**************************************");
		System.out.println("\n***Transferência de Proprietário***");
		auto.setNomeProprietario("Emily Pellini");
		System.out.println("\n**************************************");
		auto.imprimirInfo();
		
	}

}
