package PortoSeguro;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		POO_Cliente cliente = new POO_Cliente ("Gabriel Barbosa","Rua Angelica Rizzi, 110","",
				"00438922843",987634989,28,"Masculino","Karla Ramos","1,80");
		
		cliente.imprimirInfo();
		cliente.validarCPF();
		
	}

}
