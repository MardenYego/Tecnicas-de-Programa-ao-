package lista03_funcoes_e_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lista03_Completa {
	
	/* Aluno: Marden Yêgo de Oliveira Freitas.
	 * Matrícula: 508371.
	 */
	
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
	
	
	public static int[] separacaoDeValores(int vetor[],int i) {
		
		int auxiliar=0;
		
		for(int j=0;j<vetor.length;j++) {
			for(i=0;i<9;i++) {
				if(vetor[i]>vetor[i+1]) {
					auxiliar=vetor[i];
					vetor[i]=vetor[i+1];
					vetor[i+1]=auxiliar;
				}
			}
		}
		return vetor;
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
	
	
	public static int[] inversaoOrdem(int vetor[],int i) {

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
		int mediaSecundaria=somatorio(vetorSecundario,i)/10;
		
		for(i=0;i<vetor.length;i++) {
			vetorSecundario[i]=vetor[i];
			if(somatorio(vetorSecundario,i)/10<mediaSecundaria)
				vetorSecundario[i]=0;
		}
		return vetorSecundario;
	}
	
	
	public static void compactacao(int vetor[],int i) {
		
		int[] vetorBinario = {0,1};
		int contador=0;
		
			for(i=0;i<vetor.length;i++) {
			//	if(vetor[i]==vetorBinario[0]) {	
					if(vetor[i]==vetorBinario[0]) {
						contador++;
					}else if(contador!=0) {
						System.out.println(vetorBinario[0]+"-"+contador);
						contador=0;
					}
			//	} else {	
					if(vetor[i]==vetorBinario[1]) {
						contador++;
					} else if(contador!=0) {
						System.out.println(vetorBinario[1]+"-"+contador);
						contador=0;
					}
			}
	}
	
	
	public static void entradaCriptografica(String[] vetorFrase,int i ) {
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Informe uma pequena frase na qual deseja criptografa-lá:");
		
		for(i=0;i<vetorFrase.length;i++) {
			vetorFrase[i]=ler.nextLine();
		}
	}
	
	
	public static String[] criptografia(String vetorFrase[],int i) {
		
		String[] vetorCriptografico={"a","b","c","d","e","f","g",
									 "h","i","j","l","m","n","o","p",
									 "q","r","s","t","u","v","x","z",
									 
									 "%","*","(","-","+","@","#",
									 "1","2","3","4","5","6","7","8",
									 "9","{","}","!","&","$","?",":"};
		
		
		entradaCriptografica(vetorFrase,i);
		for(int j=0;j<23;j++) {
			for(i=0;i<vetorFrase.length;i++) {
				if(vetorCriptografico[j].equals(vetorFrase[i]))
					vetorFrase[i]=vetorCriptografico[j+23];
			}
		}
		return vetorFrase;
	}
	

	public static void contagemCaracteres(char vetor[],int i) {
	
		int contador=0;
		boolean repetidor=true;
		
		for(int j=0;j<vetor.length;j++) {
			for(i=0;i<vetor.length;i++) {
					if(vetor[j]==vetor[i])
						contador++;	
			}
			System.out.println(vetor[j]+"="+contador);
			contador=0;
		}
	}
	
	
	public static int[] complementacao(int i) {
		
		int[] primeiroVetor=new int[10];
		int[] segundoVetor=new int[10];
		int[] vetorResultante=new int[10];
		int verificador=0; 
		
		leituraVetor(primeiroVetor,i);
		leituraVetor(segundoVetor,i);
		
		for(i=0;i<vetorResultante.length;i++) {
			verificador=primeiroVetor[i]+segundoVetor[i];
			vetorResultante[i]=10-(verificador);
		}
		return vetorResultante;
	}
	
	
	
	public static int[] numAleatorios(int vetor[],int i) {
		
		Random aleatorio=new Random();
		
		for(i=0;i<vetor.length;i++) {
			 vetor[i]=aleatorio.nextInt(30);
		}
		return vetor;
	}
	
	
	public static int[] polarizacao(int vetor[],int i) {

		int  auxiliar=0;
		
		numAleatorios(vetor,i);
	
		for(int j=0;j<vetor.length;j++) {
			for(i=0;i<9;i++) {
				 if(vetor[i]%2==0 && vetor[i+1]%2!=0) {
					 auxiliar=vetor[i];
					 vetor[i]=vetor[i+1];
					 vetor[i+1]=auxiliar;
				 }
			}
		}
		return vetor;
	}
	
	
	public static void organizacao(int vetor[],int i) {
		
		int auxiliar=0;
		
		for(int j=0;j<vetor.length;j++) {
			for( i=0;i<9;i++) {
				if(vetor[i]>vetor[i+1]) {
					 auxiliar=vetor[i];
					 vetor[i]=vetor[i+1];
					 vetor[i+1]=auxiliar;
				}
			}
		}
	}
	
	
	public static void diferencaA(int i) {
		
		int[] primeiroVetor=new int[10];
		int[] segundoVetor=new int[10];
		int auxiliar;
		
		leituraVetor(primeiroVetor,i);
		leituraVetor(segundoVetor,i);
		
		System.out.println("Diferença A-B:");
		for(i=0;i<primeiroVetor.length;i++) {
			
			auxiliar=0;
			for(int j=0;j<segundoVetor.length;j++ ) {
				if(primeiroVetor[i]==segundoVetor[j])
					auxiliar=1;
			}
			if(auxiliar!=1)
				System.out.println(primeiroVetor[i]);
		}
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
				+ "(10)Descompactação\n(11)Criptografia\n(12)Descriptografia\n"
				+ "(13)Contagem de caracteres\n(14)Complementação\n(15)polarização\n"
				+ "(16)Explosão\n(17)Organização\n(18)Agrupamento\n(19)Diferença-A\n");
		
		
		int numeroOperacao = entrada.nextInt();
		
		
		if(numeroOperacao==1) {
			
			//pesquisa
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
			
			//Pesquisa por índice
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
			
			//Separação de valores positivos e valores negativos
			leituraVetor(vetor,i);
			System.out.println(Arrays.toString(separacaoDeValores(vetor,i)));
		}
		
		
		if(numeroOperacao==4) {
			
			//Somatório
			leituraVetor(vetor,i);
			System.out.println("O somatório dos valores do vetor informado é:"+somatorio(vetor,i));
		}
		
		
		if(numeroOperacao==5) {
			
			//Junção de vetor
			int[] vetorPrincipal=new  int[20];
			
			juncao(vetorPrincipal,i);
			System.out.println("A junção do dois vetores é :"+Arrays.toString(vetorPrincipal));
		}
		
		
		if(numeroOperacao==6) {
			
			//Inversão de ordem
			leituraVetor(vetor,i);
			System.out.println(Arrays.toString(inversaoOrdem(vetor,i)));
		}
		
		
		if(numeroOperacao==7) {
			
			//Inversão de vetores
			int[] vetorCompleto=new int[10];
			inversaoVetores(vetorCompleto,i);
		}
		
		
		if(numeroOperacao==8) {
			
			//Priorização
			leituraVetor(vetor,i);
			System.out.println(Arrays.toString(priorizacao(vetor,i)));
		}
		
		
		if(numeroOperacao==9) {
			
			//Compactação
			//incompleta
			leituraVetor(vetor,i);
			compactacao(vetor,i);
		}
	
		
		if(numeroOperacao==10) {
			
			//Descompactação
			//Não concluida
		}
		
		
		if(numeroOperacao==11) {
			
			//Criptografia
			String[] vetorFrase= new String[10];
			
			System.out.println(Arrays.toString(criptografia(vetorFrase,i)));
		}
		
		
		if(numeroOperacao==12) {
			
			//Descritografia
			//Não concluida
		}
		
		
		if(numeroOperacao==13) {
			
			//Contagem de caracteres
			//Não concluida
			//leituraCaractere(vetor,i);
			//contagemCaracteres(vetor,i);
		}
		
		
		if(numeroOperacao==14) {
			
			//Complementação:
			System.out.println(Arrays.toString(complementacao(i)));
		}
		
		
		if(numeroOperacao==15) {
			
			//Polarização
			System.out.println(Arrays.toString(polarizacao(vetor,i)));
		}
		
		
		if(numeroOperacao==16) {
			
			//Explosão
			//Não concluida
		}
		
		
		if(numeroOperacao==17) {
			
			//Organização
			leituraVetor(vetor,i);
			organizacao(vetor,i);
		}
		
		
		if(numeroOperacao==18) {
			
			//Agrupamento
			//Não concluida
		}
		
		if(numeroOperacao==19) {
			
			//Diferença-A
			diferencaA(i);
		}
	}
	
	
}
