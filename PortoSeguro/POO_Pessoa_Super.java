package PortoSeguro;

public class POO_Pessoa_Super {//Superclasse

	private String nome;
	private String endereco;
	private String CPF;
	private String CNPJ;
	private int telefone;
	private int idade;
	
	public POO_Pessoa_Super(String nome, String endereco, String CPF, String CNPJ, int telefone, int idade)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.CPF = CPF;
		this.CNPJ = CNPJ;
		this.telefone = telefone;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void validarCPF()
	{
		if (getCPF().length()!=11)// length conta a quantidade de caracteres 
		{
			System.out.println("\n---CPF inválido!");
		}
		else
		{
			System.out.println("\n---CPF válido!");
		}
	}
	public void validarCNPJ()
	{
		if (getCNPJ().length()!=14)
		{
			System.out.println("\n---CNPJ inválido!");
		}
		else
		{
			System.out.println("\n---CNPJ válido!");
		}
	}	
}