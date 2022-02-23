package PortoSeguro;

public class POO_Fornecedor extends POO_Pessoa_Super {

	private int prazoEntrega;
	private String categoriaForn;
	
	public POO_Fornecedor (String nome, String endereco, String CNPJ, String CPF, 
			int telefone, int idade, int prazoEntrega, String categoriaForn)
	{
		super(nome, endereco,CPF, CNPJ, telefone, idade);
		this.prazoEntrega = prazoEntrega;
		this.categoriaForn = categoriaForn;
	}

	public int getPrazoEntrega() {
		return prazoEntrega;
	}

	public void setPrazoEntrega(int prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}

	public String getCategoriaForn() {
		return categoriaForn;
	}

	public void setCategoriaForn(String categoriaForn) {
		this.categoriaForn = categoriaForn;
	}
	public void imprimirInfo()
	{
		System.out.printf("\nNome do Fornecedor: "+getNome()+ "\nCNPJ: " +getCNPJ()+
		"\nTelefone: "+getTelefone()+ "\nEndereço: "+getEndereco()+ "\nPrazo de entrega de "
		+prazoEntrega+" dias","\nCategoria do Fornecedor: "+categoriaForn);
	}
	
	
}
