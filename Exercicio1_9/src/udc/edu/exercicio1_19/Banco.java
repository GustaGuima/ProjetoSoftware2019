package udc.edu.exercicio1_19;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<ContaCorrente> contas = new ArrayList<>();
	
	public Banco() {
	}
	public Banco(List<ContaCorrente> contas) {
		super();
		this.contas = contas;
	}
	
	public List<ContaCorrente> getContas() {
		return contas;
	}
	public void setContas(List<ContaCorrente> contas) {
		this.contas = contas;
	}
	
	public void createAccount(ContaCorrente conta) {
		for(int i = 0; i < contas.size(); i++) {
			if(!contas.get(i).equals(conta)) {
				contas.add(conta);
			}
		}
	}
	
	public void deleteAccount(ContaCorrente conta) {
		for(int i = 0; i < contas.size(); i++) {
			if(contas.get(i).equals(conta)) {
				contas.remove(conta);
			}
		}
		System.out.println("Conta nao encontrada");
	}
	
	public float sacarConta(ContaCorrente conta, float quantia) {
		for(int i = 0; i < contas.size(); i++) {
			if(!contas.get(i).equals(conta)) {
				return 0;
			}
		}
		if(quantia > conta.getLimite())
			return 0;
		if(quantia < 0) 
			return 0;
		if(quantia > conta.getSaldo())
			return 0;
		conta.setSaldo(conta.getSaldo() - quantia);
		Movimentacao mov = new Movimentacao("Saque", quantia, false);
		conta.getMovimentacoes().add(mov);
		contas.remove(conta);
		contas.add(conta);
		return quantia;
	}
	
	public float depositar(ContaCorrente conta, float quantia) {
		for(int i = 0; i < contas.size(); i++) {
			if(!contas.get(i).equals(conta)) {
				return 0;
			}
		}
		if(quantia < 0) 
			return 0;
		conta.setSaldo(conta.getSaldo() + quantia);
		Movimentacao mov = new Movimentacao("Deposito", quantia, true);
		conta.getMovimentacoes().add(mov);
		contas.remove(conta);
		contas.add(conta);
		return quantia;
	}
	
	public float emissaoSaldo(ContaCorrente conta) {
		for(int i = 0; i < contas.size(); i++) {
			if(!contas.get(i).equals(conta)) {
				return 0;
			}
		}
		return conta.getSaldo();
	}
	
	public void extrato(ContaCorrente conta) {
		for(int i = 0; i < contas.size(); i++) {
			if(!contas.get(i).equals(conta)) {
				return;
			}
		}
		
		for(int i = 0; i < conta.getMovimentacoes().size(); i++) {
			System.out.println("Descricao: "+conta.getMovimentacoes().toString());
		}
		
	}
	
}
