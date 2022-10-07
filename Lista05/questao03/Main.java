package questao03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		// 1ª parte
		System.out.println("****Informe o tamanho do raio****");
		double tamanhoRaio=entrada.nextDouble();
		Circulo circulo = new Circulo(tamanhoRaio);
		
		System.out.println("Área original referente ao raio informado: "+circulo.area());
		System.out.println("Circunferencia original do círculo informado:"+circulo.circunferencia());
		
		
		
		System.out.println("\n****Informe a porcentagem de aumento que deseja****");
		double porcentagem=entrada.nextDouble();
		circulo.aumentarCirculo(porcentagem);
		
		System.out.println("A nova área é :"+circulo.area()+"\nA nova circunferência é :"+circulo.circunferencia());

	}

}
