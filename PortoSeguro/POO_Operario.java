package PortoSeguro;

public class POO_Operario extends POO_Pessoa_Super {

	private double valorProducao;
	private double comissao;
	
	public POO_Operario (String nome, String endereco, String CPF, String CNPJ, int telefone, int idade,
			double valorProducao, double comissao)
	{
		super (nome, endereco, CPF, CNPJ, telefone, idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do operário: "+getNome()+ "\nCPF: " +getCPF()+ "\nIdade: "+getIdade()+
				"\nTelefone: "+getTelefone()+ "\nEndereço: "+getEndereco()+ "\nValor monetários dos artigos"
						+ "produzidos: "+valorProducao+ "\nPorcentagem (sem o %) da comissão deste artigo: " +comissao);
	}	
	public void calcularProducao()
	{
		double valorTotal = valorProducao + (valorProducao * (comissao/100));
		System.out.println("\nO valor total a ser recebido pelo Operário "+getNome()+ " é: "+valorTotal);
	}
	
	
}