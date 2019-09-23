package udc.edu.exercicio16_1;

import java.util.ArrayList;

public class ListaDuplamenteEncadeada {
	
	private No primeiro = null, ultimo = null;

	
	public No getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}

	public No getUltimo() {
		return ultimo;
	}
	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}
	
	
	
	public ArrayList<Object> listar(){
		
		ArrayList<Object> lista = new ArrayList<Object>();
		if(primeiro == null)
			return null;
		else {
			No aux = getPrimeiro();
			while(aux != null) {
				Object v1 = aux.getValor();
				lista.add(v1);
				aux = aux.getProximo();
			}
			return lista;
		}
		
	}
	
	public boolean procura(Object valor) {
		No aux = getPrimeiro();
		while(aux != null) {
			if(valor.equals(aux.getValor())) {
				return true;
			}
			aux = aux.getProximo();
		}
		return false;
	}
	
	public void inserirInicio(Object valor) {
		boolean procura = false;
		procura = procura(valor);
		if(procura == false) {
			No novo = new No();
			if(primeiro == null) {
				novo.setValor(valor);
				setPrimeiro(novo);
				setUltimo(novo);
			}else {
				primeiro.setAnterior(novo);
				novo.setValor(valor);
				novo.setProximo(primeiro);
				setPrimeiro(novo);
			}
		}else {
			return;
		}
	}
	
	public void inserirFim(Object valor) {
		No novo = new No();
		boolean procura = false;
		procura = procura(valor);
		if(procura == true) {
			return;
		}else {
			if(ultimo == null) {
				novo.setValor(valor);
				primeiro = novo;
				ultimo = novo;
			}else {
				ultimo.setProximo(novo);
				novo.setValor(valor);
				ultimo = novo;
			}
		}
	}

}
