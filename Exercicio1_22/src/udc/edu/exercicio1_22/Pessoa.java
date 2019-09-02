package udc.edu.exercicio1_22;

public class Pessoa {
	
	private String nome;
	private int idade;
	private int rg;
	private String cpf;
	
	public Pessoa() {
	}
	public Pessoa(String nome, int idade, int rg, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public void fazAniversario() {
		idade++;
	}
	@Override
	public String toString() {
		return "Pessoa\nnome=" + nome + "\nidade=" + idade;
	}
	
	
	

}
