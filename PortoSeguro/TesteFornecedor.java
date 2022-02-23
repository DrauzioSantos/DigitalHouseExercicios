package PortoSeguro;

public class TesteFornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		POO_Fornecedor Fornecedor = new POO_Fornecedor("Americanas","Rua das Americas, 2002",
				"09394123000123","",940043003,0,10,"Mercado");
		
		Fornecedor.imprimirInfo();
		Fornecedor.validarCNPJ();
		
	}

}
