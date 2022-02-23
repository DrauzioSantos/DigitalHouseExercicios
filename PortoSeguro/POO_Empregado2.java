package PortoSeguro;

public class POO_Empregado2 extends POO_Pessoa_Super {// "extends" para identificar que é uma herança de Pessoa

	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public POO_Empregado2(String nome, String endereco, String CPF, String CNPJ, int telefone, int idade,
			int codigoSetor, float salarioBase, float imposto)
	{
		super (nome, endereco,CNPJ, CPF, telefone, idade);//pegou os atributos da Superclasse
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()+ "\nCPF: " +getCPF()+ "\nIdade: "+getIdade()+
				"\nTelefone: "+getTelefone()+ "\nEndereço: "+getEndereco()+ "\nCodigo do Setor: "+codigoSetor+
				"\nSalário base: "+salarioBase+ "\nValor em porcentagem (sem o %) de Imposto a ser retido: "+imposto);
	}	
	
	public void calcularSalario()
	{
		double salarioLiquido = salarioBase - (salarioBase * (imposto/100)); 
		System.out.println("\nO salário total a ser recebido pelo Empregado: "+getNome()+ " é igual a " +salarioLiquido);
	}
	
}