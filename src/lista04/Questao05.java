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
			array[i]=aleatorio.nextInt(10);
			
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
		return produto;
	}
	
//	public static double leituraArray(double array[]) {
//		
//		for(int j=1;j<array.length;j++) {
//			
//		}
//		return
//	}
	
	
	public static void main(String[] args) {
		
		int[] array = new int [10];
		int[] arraySoma =new int[4];
		double[] arrayProduto = new double[4];
		int[] arrayMedias = new int[4];
		int i,somatorioTotal;

		for(i=1;i<=3;i++) {
			numAleatorios(array,i);
			System.out.println("\nArray: "+i);
			System.out.println(Arrays.toString(array));
			arraySoma[i]=somaArray(array,i);
			System.out.println("Soma dos elementos do array:"+arraySoma[i]);
			arrayProduto[i]=produtoArray(array,i);
			System.out.println("Produto dos elementos do array:"+arrayProduto[i]);
			arrayMedias[i]=somaArray(array,i)/10;
			System.out.println("M�dia dos elementos do vetor:"+arrayMedias[i]);
		}
		
		System.out.println("\nArray com todas as somas computadas:"+Arrays.toString(arraySoma));
		System.out.println("Array com todos os produtos computados:"+Arrays.toString(arrayProduto));
		System.out.println("Array com todas as m�dias computadas:"+Arrays.toString(arrayMedias));
		
		System.out.println("\nA soma do array que cont�m todas as somas calculadas:"+somaArray(arraySoma,i));
		System.out.println("O produto do array que cont�m todos os produtos calculados:"+produtoArray());
		System.out.println("A m�dia do array que cont�m todas as m�dias calculadas"+); 
		
	}

}
