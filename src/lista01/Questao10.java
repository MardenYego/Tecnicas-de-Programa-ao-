package lista01;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		//ok
		
		int A,B;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Defina um valor para as variáveis A e B ");
		A=ler.nextInt();
		B=ler.nextInt();
		
		if(A<10)
			System.out.println("Número menor que 10");
		
		if(A+B!=20)
			System.out.println("Número diferente de 20");	
	}
}
