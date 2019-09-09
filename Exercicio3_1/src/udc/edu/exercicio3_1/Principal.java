package udc.edu.exercicio3_1;

public class Principal {
	
	public static void main(String[] args) {
		
		quebrarNumero(150);
		
	}
	
	public static void quebrarNumero(int numero) {
		int aux = 0;
		String string = "" + numero;
		
		for(int i = 0; i < string.length(); i++) {
			aux = Integer.parseInt(string.charAt(i) + "");
			if(aux == 0)
				System.out.println("Zero, ");
			if(aux == 1)
				System.out.print("Um, ");
			if(aux == 2)
				System.out.print("Dois, ");
			if(aux == 3)
				System.out.print("Tres, ");
			if(aux == 4)
				System.out.print("Quatro, ");
			if(aux == 5)
				System.out.print("Cinco, ");
			if(aux == 6)
				System.out.print("Seis, ");
			if(aux == 7)
				System.out.print("Sete, ");
			if(aux == 8)
				System.out.print("Oito, ");
			if(aux == 9)
				System.out.print("Nove, ");
		}
	}

}
