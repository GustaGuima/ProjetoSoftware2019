package udc.edu.exercicio3_5;

public class Aumento {
	
	Funcionario funcionario;
	
	public Aumento() {
		funcionario = new Funcionario();
	}

	public Aumento(Funcionario funcionario) {
		this.funcionario = new Funcionario(funcionario.getCargo(), funcionario.getSalario());
	}
	
	public double aumentoSalarial() {
		if(funcionario.getCargo().equals("Diretor") && funcionario.getSalario() > 6000) {
			funcionario.setSalario(funcionario.getSalario() * 1.015);
			return funcionario.getSalario();	
		}
		if(funcionario.getCargo().equals("Diretor") && funcionario.getSalario() < 6000) {
			funcionario.setSalario(funcionario.getSalario() * 1.025);
			return funcionario.getSalario();	
		}
		if(funcionario.getCargo().equals("Gerente") && funcionario.getSalario() > 5000) {
			funcionario.setSalario(funcionario.getSalario() * 1.02);
			return funcionario.getSalario();	
		}
		if(funcionario.getCargo().equals("Gerente") && funcionario.getSalario() < 5000) {
			funcionario.setSalario(funcionario.getSalario() * 1.025);
			return funcionario.getSalario();	
		}
		if(!funcionario.getCargo().equals("Gerente") && !funcionario.getCargo().equals("Diretor") && funcionario.getSalario() > 2500) {
			funcionario.setSalario(funcionario.getSalario() * 1.03);
			return funcionario.getSalario();	
		}else if(!funcionario.getCargo().equals("Gerente") && !funcionario.getCargo().equals("Diretor") && funcionario.getSalario() < 2500){
			funcionario.setSalario(funcionario.getSalario() * 1.04);
			return funcionario.getSalario();	
			
		}
		return 0;
	}
}
