package lista01;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		
		int A,B;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Defina um valor para as vari�veis A e B ");
		A=ler.nextInt();
		B=ler.nextInt();
		
		if(A<10 || A+B==20) {
			if(A<10)
				System.out.println("A<10");
			if(A+B==20)
				System.out.println("A+B==20");
		}else {
			System.out.println("N�mero n�o v�lido");
		}
	}

}
