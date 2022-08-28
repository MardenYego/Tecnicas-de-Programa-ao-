package lista01;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		//ok
		
		int A,B;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Defina um valor para as variáveis A e B ");
		A=ler.nextInt();
		B=ler.nextInt();
		
		if(A>10 || A+B==20)
			System.out.println("Número válido");
		else if(A==B)
			System.out.println("A é igual B; A e B são\r\n"
					+ "diferentes de 10; A é menor que 10");
		else 
			System.out.println("Número não válido");
	}
}