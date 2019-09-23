package udc.edu.exercicio4_2;

public class Principal {
	
	public static void main(String[] args) {
		int numero = 0;
		int aux = 1000;
		/*
		//1
		for(int i = 150; i <= 300; i++) {
			System.out.println(i);
		}
		
		//2
		while(numero <= 1000) {
			System.out.println(numero);
			numero++;
		}
		
		//3
		for(int i = 1000; i <= 1200; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		//4
		while(aux <= 1200) {
			if(aux % 3 == 0) {
				System.out.println(aux);
			}
			aux++;
		}
		
		aux = 1000;
		//5
		do {
			if(aux % 3 == 0) {
				System.out.println(aux);
			}
			aux++;
		}while(aux <= 1200);
		
		
		*/
		//6
		aux = 1;
		for(int i = 1; i <= 10; i ++) {
			for(int j = i; j >= 1; j--) {
				aux = aux * j;
			}
		}
		
		System.out.println(aux);
		
		
		
	}

}
