package questao05;

import java.util.Scanner;

public class Main {

	public static void preencherArray(Empregado empregado1,Scanner entrada){
		
		String dia;
		
		for(int i=1;i<=30;i++) {
			//Manualmente
			//System.out.println("O empregado "+empregado1.getNome()+" trabalhou no dia(sim/não):"+i);
			//empregado1.preencherDias(dia=entrada.next());
			
			// teste para os 30 dias 
			empregado1.preencherDias("sim");
		}
	}	
	
	
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		Empregado empregado= new Empregado("Tony","Stark"); 
		Empregado empregado1= new Empregado(1,"Tony","Stark"); 
		
		empregado1.setSalarioMensal(11000);;
		
		preencherArray(empregado1,entrada);
		System.out.println("====================================================");
		System.out.println("Empregado:"+empregado1.getNome()+" "+empregado.getSobrenome()+" "
						  +"Id:"+empregado1.getId()+" / Salário Mensal:"+empregado1.getSalarioMensal());
		
		empregado1.calcularSalario(empregado1.checarDias());
		System.out.println("Novo salário:"+empregado1.getSalarioMensal());
		System.out.println("====================================================");
	}
}








