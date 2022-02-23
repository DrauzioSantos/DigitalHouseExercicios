package PortoSeguro;

public class POO_Cliente extends POO_Pessoa_Super{
	
	private String genero;
	private String nomeMae;
	private String altura;
	
	public POO_Cliente (String nome, String endereco, String CNPJ, String CPF, 
			int telefone, int idade, String genero, String nomeMae, String altura)
	{
		super (nome, endereco,CPF, CNPJ, telefone, idade);
		this.genero = genero;
		this.nomeMae = nomeMae;
		this.altura = altura;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	public void imprimirInfo()
	{
		System.out.printf("\nNome do Cliente: "+getNome()+"\nNome da Mãe: "+nomeMae+ "\nCPF: " +getCPF()+
				"\nIdade: "+getIdade()+"\nTelefone: "+getTelefone()+ "\nEndereço: "+getEndereco()+ "\nGênero: "
				+genero+"\nAltura: "+altura);
	}
	
	
}
