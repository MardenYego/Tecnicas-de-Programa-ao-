package questao03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		// 1� parte
		System.out.println("****Informe o tamanho do raio****");
		double tamanhoRaio=entrada.nextDouble();
		Circulo circulo = new Circulo(tamanhoRaio);
		
		System.out.println("�rea original referente ao raio informado: "+circulo.area());
		System.out.println("Circunferencia original do c�rculo informado:"+circulo.circunferencia());
		
		
		
		System.out.println("\n****Informe a porcentagem de aumento que deseja****");
		double porcentagem=entrada.nextDouble();
		circulo.aumentarCirculo(porcentagem);
		
		System.out.println("A nova �rea � :"+circulo.area()+"\nA nova circunfer�ncia � :"+circulo.circunferencia());

	}

}
