package lista04;

import java.util.Arrays;
import java.util.Random;

public class Questao05 {

	public static void numAleatorios(double array[], int i) {
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
	
	
	public static double somaArray(double array[], int i) {
		double somatorio=0;
		for(i=0;i<array.length;i++) {
			somatorio+=array[i];
		}
		return somatorio;
	}
	
	
	public static double produtoArray(double array[], int i) {
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
		
		double[] array = new double[10];
		double[] arraySoma =new double[4];
		double[] arrayProduto = new double[4];
		double[] arrayMedias = new double[4];
		int i;

		for(i=1;i<=3;i++) {
			numAleatorios(array,i);
			System.out.println("\nArray: "+i);
			System.out.println(Arrays.toString(array));
			arraySoma[i]=somaArray(array,i);
			System.out.println("Soma dos elementos do array:"+arraySoma[i]);
			arrayProduto[i]=produtoArray(array,i);
			System.out.println("Produto dos elementos do array:"+arrayProduto[i]);
			arrayMedias[i]=somaArray(array,i)/10;
			System.out.println("Média dos elementos do vetor:"+arrayMedias[i]);
		}
		
		System.out.println("\nArray com todas as somas computadas:"+Arrays.toString(arraySoma));
		System.out.println("Array com todos os produtos computados:"+Arrays.toString(arrayProduto));
		System.out.println("Array com todas as médias computadas:"+Arrays.toString(arrayMedias));
		
		System.out.println("\nA soma do array que contém todas as somas calculadas:"+somaArray(arraySoma,i));
		System.out.println("O produto do array que contém todos os produtos calculados:"+produtoArray(arrayProduto,i));
		System.out.println("A média do array que contém todas as médias calculadas"+somaArray(arrayMedias,i)/3); 
		
	}

}
