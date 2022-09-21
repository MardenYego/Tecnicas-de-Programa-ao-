package lista04;

import java.util.Arrays;
import java.util.Random;

public class Questao05 {

	public static void numAleatorios(int array[], int i) {
		//int numeros=0;
//		for(i=0;i<array.length;i++) {
//			numeros=(int)((Math.random()*100)-30);
//			array[i]=numeros;
//		}
		Random aleatorio=new Random();
		for(i=0;i<array.length;i++) {
			array[i]=aleatorio.nextInt(20);
			
		}
	}
	
	
	public static int somaArray(int array[], int i) {
		int somatorio=0;
		for(i=0;i<array.length;i++) {
			somatorio+=array[i];
		}
		return somatorio;
	}
	
	
	public static double produtoArray(int array[], int i) {
		double produto=1;
		for(i=0;i<array.length;i++) {
			produto*=array[i];
		}
		System.out.println("");
		return produto;
	}
	

	
	
	public static void main(String[] args) {
		
		int[] array = new int [10];
		int[] arrayTotal =new int[3];
		int i,somatorioTotal;

		for(i=1;i<=3;i++) {
			numAleatorios(array,i);
			System.out.println("\nArray: "+i);
			System.out.println(Arrays.toString(array));
			
			//arrayTotal[i]=somaArray(array,i);
			System.out.println("Soma dos elementos do array:"+somaArray(array,i));
			System.out.println("Produto dos elementos do array:"+produtoArray(array,i));
			System.out.println("Média dos elementos do vetor:"+somaArray(array,i)/10);
			
			somaArray(array,i);
		}
		
		
	}

}
