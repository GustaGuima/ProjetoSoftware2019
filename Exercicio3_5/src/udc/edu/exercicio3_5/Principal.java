package udc.edu.exercicio3_5;

public class Principal {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Diretor", 6750);
		
		Aumento a = new Aumento(f1);
		
		System.out.println(a.aumentoSalarial());
	}

}
