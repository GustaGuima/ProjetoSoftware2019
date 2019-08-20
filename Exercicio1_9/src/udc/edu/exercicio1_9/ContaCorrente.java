package udc.edu.exercicio1_9;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
	
	private String numero;
	private String agencia;
	private float saldo;
	private boolean status;
	
	private List<Movimentacao> movimentacoes = new ArrayList<>();
	
	//Constructors
	public ContaCorrente() {
	}
	public ContaCorrente(String numero, String agencia, float saldo, boolean status) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.status = status;
	}

	//Getters and Setters
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}
	public void setMovimentacoes(List<Movimentacao> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}
	
	

}
