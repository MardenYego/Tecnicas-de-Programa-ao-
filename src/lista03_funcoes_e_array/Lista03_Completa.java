package lista03_funcoes_e_array;

import java.util.Arrays;
import java.util.Scanner;

public class Lista03_Completa {


	public static void leituraVetor(int vetor[],int i) {
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Informe os elementos do seu vetor de tamanho 10:");
		for(i=0;i<vetor.length;i++) {
			vetor[i]=ler.nextInt();
		}
	}
	
	
	public static int pesquisa(int valor1,int vetor[],int i) {
		for(i=0;i<vetor.length;i++) {
			if(vetor[i]==valor1)
				return 1;
		}
		return -100;
	}
	
	
	public static int pesquisaPorIndice(int indice,int vetor[],int i) {
		for(i=0;i<vetor.length;i++) {
			if(i==indice)
				return vetor[i];
		}
		return -0;
	}
	
	
	public static void vetorNegativo(int vetorPrincipal[],int vetorSeparado[],int i) {
		for(int j=0;j<vetorPrincipal.length;j++) {
			for(i=0;i<vetorPrincipal.length;i++) {
				if(vetorPrincipal[i]<0) 
					vetorSeparado[j]=vetorPrincipal[i];
				if(vetorPrincipal[i]>0)
					vetorSeparado[10-j-1]=vetorPrincipal[i];
					j++;
			}
		}
	}
	
	
	public static int[] separacaoDeValores(int vetor[],int i) {
		int[] vetorSeparado=new int[10];
		vetorNegativo(vetor,vetorSeparado,i);
//		for(int j=0;j<vetor.length;) {
//			for(i=0;i<vetor.length;i++) {
//				if(vetor[i]>0) {
//					vetorSeparado[10-j-1]=vetor[i];
//					j++;
//				}
//			}
//		}
		
		
		
//		for(int j=0;j<vetor.length;j++) {
//			for(i=0;i<vetor.length;i++) {
//				if(vetor[i]<0) { 
//					vetorSeparado[j]=vetor[i];
//					j++;
//				}
//			}
//		}
//		
		return vetorSeparado;
	}
	
	
	public static int somatorio(int vetor[],int i) {
		int somaElementos=0;
		for(i=0;i<vetor.length;i++) {
			somaElementos+=vetor[i];
		}
		return somaElementos;
	}
	
	
	public static void juncao(int vetorPrincipal[],int i) {
		int[] primeiroVetor=new int[10];
		int[] segundoVetor=new int[10];
		
		leituraVetor(primeiroVetor,i);
		leituraVetor(segundoVetor,i);
		
		for(i=0;i<primeiroVetor.length;i++) {
			vetorPrincipal[i]=primeiroVetor[i];
			vetorPrincipal[i+10]=segundoVetor[i];
		}
	}                                  
	
	
	public static int[] inversaoOrdem(int vetor[],int i){

		int[] vetorSecundario=new int[10];
		
		for(i=0;i<vetor.length;i++) {
			vetorSecundario[10-i-1]=vetor[i];
		}
		return vetorSecundario;
	}
	

	public static void inversaoVetores(int vetorAuxiliar[],int i) {
		int[] primeiroVetor=new int[10];
		int[] segundoVetor=new int[10];
		
		leituraVetor(primeiroVetor,i);
		leituraVetor(segundoVetor,i);
		
		for(i=0;i<vetorAuxiliar.length;i++) {
			vetorAuxiliar[i]=primeiroVetor[i];
			primeiroVetor[i]=segundoVetor[i];
			segundoVetor[i]=vetorAuxiliar[i];
		}
		
		System.out.println(Arrays.toString(primeiroVetor));
		System.out.println(Arrays.toString(segundoVetor));
	}
	
	
	public static int[] priorizacao(int vetor[],int i) {
		int[] vetorSecundario=new int[10];
		//int mediaVetor=somatorio(vetor,i)/10;
		int mediaSecundaria=somatorio(vetorSecundario,i)/10;
		
		for(i=0;i<vetor.length;i++) {
			vetorSecundario[i]=vetor[i];
			if(somatorio(vetorSecundario,i)/10<mediaSecundaria)
				vetorSecundario[i]=0;
//			if(vetorSecundario[i]=vetor[i] && somatorio(vetorSecundario,i)/10>mediaSecundaria)
//				r;
		}
		
		
		
		return vetorSecundario;
	}
	
	
//	public static int[] compactacao(int vetor[],int i) {
////		int[] vetorCompactado=new int[10];
////		//int contZero=0,contUm=0;
////		int contador=0;
//////		int contador=0;
//////		for(i=0;i<vetor.length;i++) {
//////			if(vetor[i]==0)
//////				contador++;
//////		}
////		
////		vetor[i]
////				
////		int j=0;
////		for(i=0;i<vetor.length;i++) {
////			if(vetor[i]==0)
////				vetorCompactado[j];
////			if(vetor)
////		}
////		
////		
////		
//////	}
	
	
	public static void entradaCriptografica(String[] vetorFrase,int i ) {
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Informe uma frase na qual deseja criptografa-lá:");
		
		for(i=0;i<vetorFrase.length;i++) {
			vetorFrase[i]=ler.nextLine();
		}
		//System.out.println(Arrays.toString(vetorFrase));
		
	}
	
	
	public static String[] criptografia(String vetorFrase[],int i) {
		String[] vetorCriptografico={"a","b","c","d","e","f","g",
									 "h","i","j","l","m","n","o","p",
									 "q","r","s","t","u","v","x","z",
									 
									 "%","*","(","-","+","@","#",
									 "1","2","3","4","5","6","7","8",
									 "9","{","}","!","&","$","?",":"};
		
		//System.out.println(Arrays.toString(vetorFrase));
		entradaCriptografica(vetorFrase,i);
		//System.out.println(Arrays.toString(vetorFrase));
		for(int j=0;j<23;j++) {
			for(i=0;i<vetorFrase.length;i++) {
				//erro aqui
				//if(vetorCriptografico[j]==vetorFrase[i])
				if(vetorCriptografico[j].equals(vetorFrase[i]))
					vetorFrase[i]=vetorCriptografico[j+23];
				//System.out.println(Arrays.toString(vetorFrase));
			}
		}
		
		return vetorFrase;
	}
	
	
	public static void main(String[] args) {
		
		int i=0;
		int[] vetor= new int[10];
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o qual operação deseja realizar:\n"
				+ "(1)Pesquisa\n(2)Pesquisa por índice\n"
				+ "(3)Separação de valores positivos e valores negativos\n"
				+ "(4)Somatório\n(5)Junção de vetor\n(6)Inversão de ordem\n"
				+ "(7)Inversão de vetores\n(8)Priorização\n(9)Compactação\n"
				+ "(10)Descompactação\n(11)Criptografia\n(12)Descriptografia\n");
		int numeroOperacao = entrada.nextInt();
		
		
		if(numeroOperacao==1) {
			int elemento;
			
			leituraVetor(vetor,i);
			System.out.println("Informe qual elemento deseja verificar no vetor:");
			elemento=entrada.nextInt();
			if(pesquisa(elemento,vetor,i)==1)
				System.out.println("elemento encontrado");
			else
				System.out.println(pesquisa(elemento,vetor,i));
		}
		
		
		if(numeroOperacao==2) {
			int indice,elementoIndice;
			
			leituraVetor(vetor,i);
			System.out.println("Informe o índice no qual deseja retornar o seu elemento correspondente");
			indice=entrada.nextInt();
			elementoIndice=pesquisaPorIndice(indice,vetor,i);
			if(elementoIndice!=-0)
				System.out.println("Elemento solicitado:"+elementoIndice);
			else
				System.out.println("Índice não encontrado");
		}
		
		
		if(numeroOperacao==3) {
			leituraVetor(vetor,i);
			//incompleta???
			System.out.println(Arrays.toString(separacaoDeValores(vetor,i)));
		}
		
		
		if(numeroOperacao==4) {
			leituraVetor(vetor,i);
			System.out.println("O somatório dos valores do vetor informado é:"+somatorio(vetor,i));
		}
		
		
		if(numeroOperacao==5) {
			int[] vetorPrincipal=new  int[20];
			
			juncao(vetorPrincipal,i);
			System.out.println("A junção do dois vetores é :"+Arrays.toString(vetorPrincipal));
		}
		
		
		if(numeroOperacao==6) {
			leituraVetor(vetor,i);
			System.out.println(Arrays.toString(inversaoOrdem(vetor,i)));
			
		}
		
		
		if(numeroOperacao==7) {
			int[] vetorCompleto=new int[10];
			inversaoVetores(vetorCompleto,i);
			
		}
		
		
		if(numeroOperacao==8) {
			// +/-
			leituraVetor(vetor,i);
			System.out.println(Arrays.toString(priorizacao(vetor,i)));
			
		}
		
		
		if(numeroOperacao==9) {
			//incompleta
		leituraVetor(vetor,i);
		System.out.println();
		}
	
		
		if(numeroOperacao==10) {
			//incompleta
		}
		
		
		if(numeroOperacao==11) {
			
			String[] vetorFrase= new String[10];
			
			System.out.println(Arrays.toString(criptografia(vetorFrase,i)));
			
		}
		
		
		if(numeroOperacao==12) {
			
		}
		
		
		if(numeroOperacao==13) {
			
		}
		
		
		if(numeroOperacao==14) {
			
		}
		
		
		if(numeroOperacao==15) {
			
		}
		
		
		if(numeroOperacao==16) {
			
		}
		
		
		if(numeroOperacao==17) {
			
		}
		
		
		if(numeroOperacao==18) {
			
		}
		
		if(numeroOperacao==19) {
			
		}
	}
	
	
}
