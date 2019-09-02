package udc.edu.exercicio2_2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int primeiro = 0, segundo = 0;
		
		Scanner sc = new Scanner(System.in);
		
		Numbers teste1 = new Numbers(1,2);
		
		System.out.println(teste1.soma());
		System.out.println(teste1.diferenca());
		
		System.out.println("Entre com dois numeros : ");
		primeiro = sc.nextInt();
		segundo = sc.nextInt();
		
		System.out.println(teste1.diferenca(primeiro, segundo));
		System.out.println(teste1.soma(primeiro, segundo));
		
		
		
	}
}
