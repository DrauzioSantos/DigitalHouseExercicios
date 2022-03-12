package PortoSeguro;

public class Quadrado extends BaseFigura implements Figuras{

	Quadrado(double lado, String nome)
	{
		super(lado, lado, nome);
		nomeClasse = "Quadrado";
	}
	
	@Override //indica métido polimófico 
	public double getDiagonal()
	{
		return Math.sqrt(2)*lado1;
	}
}
