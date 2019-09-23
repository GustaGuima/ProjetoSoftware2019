package udc.edu.exercicios7_1;

import udc.edu.exercicios7_1_1.Ponto2d;
import udc.edu.exercicios7_1_2.Linha;
import udc.edu.exercicios7_1_3.Retangulo;

public class Principal {

	public static void main(String[] args) {
		Ponto2d p1 = new Ponto2d(1, 3);
		Ponto2d p2 = new Ponto2d(4, 7);

		Linha l1 = new Linha(p1, p2);

		Retangulo r1 = new Retangulo(l1);

		System.out.println(r1);
	}

}
