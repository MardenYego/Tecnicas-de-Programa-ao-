package lista01;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		//ok
		
		int A,B;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Defina um valor para as vari�veis A e B ");
		A=ler.nextInt();
		B=ler.nextInt();
		
		if(A>10 || A+B==20)
			System.out.println("N�mero v�lido");
		else if(A==B)
			System.out.println("A � igual B; A e B s�o\r\n"
					+ "diferentes de 10; A � menor que 10");
		else 
			System.out.println("N�mero n�o v�lido");
	}
}