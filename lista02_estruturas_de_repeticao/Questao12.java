package lista02_estruturas_de_repeticao;

import java.util.Scanner;

public class Questao12 {

	public static void alternativaA(char matriz[][],int i,int j,int linhas,int colunas) {
		System.out.println("Letra (A)");
		for(i=0;i<linhas;i++) {
			for(j=0;j<colunas;j++) {
				if(i>=j)
					matriz[i][j]='*';
			    
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void alternativaB(char matriz[][],int i,int j,int linhas,int colunas) {
		System.out.println("Letra (B)");
		for(i=0;i<linhas;i++) {
			for(j=0;j<colunas;j++) {
				matriz[i][j]='*';
				if(i==j)
					matriz[i][j]='#';
				matriz[i][linhas-1-i]='#';
				System.out.print(matriz[i][j]+" ");
			}
		System.out.println();
		}
	}
	
	
	public static void alternativaC(char matriz[][],int i,int j,int linhas,int colunas) {
		System.out.println("Letra (C)");
		for(i=0;i<linhas;i++) {
			for(j=0;j<colunas;j++) {
				matriz[i][j]='*';
				if(i%2==0)
					matriz[i][j]='#';
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void alternativaD(char matriz[][],int i,int j,int linhas,int colunas) {
		System.out.println("Letra D");
		for(i=0;i<linhas;i++) {
			for(j=0;j<colunas;j++) {
				matriz[i][j]='*';
				if(i==0 || i==colunas-1 || j==0 || j==linhas-1)
					matriz[i][j]='#';
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void alternativaE(char matriz[][],int i,int j,int linhas,int colunas) {
		System.out.println("Letra (E)");
		int limite=colunas/2;
		for(i=0;i<linhas;i++) {
			for(j=0;j<colunas;j++) {
				matriz[i][j]='*';
				if(i>=limite) {
					if(j%2==0)
						matriz[i][j]='#';
					else 
						matriz[i][j]='$';
				}
			System.out.print(matriz[i][j]+" ");
			}
		System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
		int i=0,j=0,linhas,colunas;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número de linhas e colunas da sua matriz respectivamente:");
		linhas=entrada.nextInt();
		colunas=entrada.nextInt();
		
		char[][] matriz= new char [linhas][colunas];
		
		alternativaA(matriz,i,j,linhas,colunas);
		alternativaB(matriz,i,j,linhas,colunas);
		alternativaC(matriz,i,j,linhas,colunas);
		alternativaD(matriz,i,j,linhas,colunas);
		alternativaE(matriz,i,j,linhas,colunas);
	}
}
