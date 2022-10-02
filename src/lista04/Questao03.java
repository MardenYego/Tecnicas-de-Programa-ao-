package lista04;

import java.util.Arrays;

public class Questao03 {

	public static void numAleatorios(int array[], int i) {
		
		int numeros=0;
		
		for(i=0;i<array.length;i++) {
			numeros=(int)((Math.random()*100)-30);
			array[i]=numeros;
		}
		
		System.out.println(Arrays.toString(array));
	}
	
	
	public static void leituraArray(int array[],int i,int string) {
		System.out.println(Arrays.toString(array));
	}
	
	
	public static void alternativaA(int array[],int i) {
		for(i=0;i<array.length;i++) {
			if(array[i]%3==0 && array[i]>=0)
				System.out.println(array[i]); 
		}
	}
	
	public static void alternativaB(int array[],int i) {
		for(i=0;i<array.length;i++) {
			if(array[i]%3!=0 && array[i]>=0)
				System.out.println(array[i]); 
		}
	}
	
	public static void alternativaC(int array[],int i) {
		for(i=0;i<array.length;i++) {
			if(array[i]%3==0 && array[i]<0)
				System.out.println(array[i]); 
		}
	}
	
	
	public static void alternativaD(int array[],int i) {
		for(i=0;i<array.length;i++) {
			if(array[i]%3!=0 && array[i]<0)
				System.out.println(array[i]); 
		}
	}
	
	public static void main(String[] args) {
		int i=0;
		int[] array=new int[20];
		
		numAleatorios(array,i);
		
		System.out.println("Números positivos múltiplos de 3:");
		alternativaA(array,i);
		
		System.out.println("Números positivos não múltiplos de 3:");
		alternativaB(array,i);
		
		System.out.println("Números negativos múltiplos de 3:");
		alternativaC(array,i);
		
		System.out.println("Números negativos não múltiplos de 3:");
		alternativaD(array,i);
	}

}
