package lista04;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float salarioMinimo,taxaImposto, salarioFuncionario;
		int dependentes;
		
		System.out.println("Informe o sal�rio m�nimo:");
		salarioMinimo=entrada.nextFloat();
		System.out.println("Agora, informe o n�mero de dependentes:");
		dependentes=entrada.nextInt();
		System.out.println("Por fim, informe o sal�rio do funcion�rio e sua taxa de imposto respectivamente:");
		salarioFuncionario=entrada.nextFloat();
		taxaImposto=entrada.nextFloat();


	}

}
