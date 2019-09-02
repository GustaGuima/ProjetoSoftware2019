package udc.edu.exercicio1_19;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
	
	private String numero;
	private float limite;
	private float saldo;
	private boolean status;
	
	private List<Movimentacao> movimentacoes = new ArrayList<>();
	
	//Constructors
	public ContaCorrente() {
	}
	public ContaCorrente(String numero, float limite, float saldo, boolean status) {
		super();
		this.numero = numero;
		this.limite = limite;
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
	
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
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
	
	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + ", limite=" + limite + ", saldo=" + saldo + ", status=" + status
				+ ", movimentacoes=" + movimentacoes + "]";
	}
	
	
	
	

}
