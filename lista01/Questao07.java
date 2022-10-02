package lista01;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		
		
		int A,B;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Defina um valor para as variáveis A e B ");
		A=ler.nextInt();
		B=ler.nextInt();

		if(A>10) {
			if(A+B==20)
				System.out.println("Números válidos");
		} else {
			System.out.println("Número não válido");
		}	
	}
}
