package lista01;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		//ok
		
		int A,B;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Defina um valor para as vari�veis A e B ");
		A=ler.nextInt();
		B=ler.nextInt();
		
		if(A<10)
			System.out.println("N�mero menor que 10");
		
		if(A+B!=20)
			System.out.println("N�mero diferente de 20");	
	}
}
