package lista02_estruturas_de_repeticao;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		System.out.println("Defina o teto dos pares da esquerda e direita respectivamente:");
		System.out.println("Obs: caso deseje realizar a mesma sequência da questão, digite 3 e 2 respectivamente ");

		int numEsquerda=entrada.nextInt();
		int numDireita=entrada.nextInt();
		
		for(int i=0;i<=numEsquerda;i++) {
			for(int j=0;j<=numDireita;j++) {
				System.out.println(i+"-"+j);
			}
		}	
	}
}
