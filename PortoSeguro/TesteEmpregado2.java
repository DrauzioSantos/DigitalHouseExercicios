package PortoSeguro;

public class TesteEmpregado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		POO_Empregado2 emp = new POO_Empregado2("Edu","Rua da Marola, 386","54365489501","",
				985648871,22,123,20000,15);
		
		emp.imprimirInfo();
		emp.calcularSalario();
		emp.validarCPF();
		
	}

}
