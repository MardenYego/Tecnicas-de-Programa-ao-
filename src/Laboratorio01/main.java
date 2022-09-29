package Laboratorio01;

import java.util.Calendar;

public class main {
	
	/* Aluno: Marden Yêgo de Oliveira Freitas.
	 * Matrícula: 508371.
	 */
	
	public static void main(String[] args) {
		
		
		Calendar Data = Calendar.getInstance();
		
		Cliente Joao = new Cliente("023.988.272-06");
		Cliente Davy = new Cliente("009.222.343-02");
		Cliente Ana = new Cliente("092.232.324.-23");
		
		Atendimento a1 = new Atendimento(); 
		Atendimento a2 = new Atendimento(); 
		Atendimento a3 = new Atendimento(); 
		
		Servico s1 = new Servico();
		Servico s2 = new Servico();
		Servico s3 = new Servico();
		
		Cabelereiro c1 = new Cabelereiro("0002","Irineu");
		Cabelereiro c2 = new Cabelereiro("0022","miau");
		Cabelereiro c3 = new Cabelereiro("0002","arou");
		
		
		
	}

}
