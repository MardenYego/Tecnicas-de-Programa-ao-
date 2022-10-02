package Laboratorio01;

import java.util.Calendar;

public class Main {
	
	private Atendimento carregarDadosParaTesteAtendimento() {
		// Clientes
		Cliente cliente1 = new Cliente ("320.306.828-65");
		cliente1.setId(1);
		cliente1.setNome("Pedro");
		
		// Serviços
		Servico servico1 = new Servico();
		servico1.setId(1);
		servico1.setNome("Corte de cabelo");
		servico1.setDescricao("Corte de cabelo topzera");
		servico1.setValor(150);
		
		Servico servico2 = new Servico();
		servico2.setId(2);
		servico2.setNome("Hidratação facial");
		servico2.setDescricao("Hidratação relaxante, eficaz na retirada da sujeira acumulada na pele")
		servico2.setValor(0);
	}
	
	
	
	
/////
	//Calendar Data = Calendar.getInstance();
	
	// Primeiro teste
	// cliente
	Cliente cliente = new Cliente("023.988.272-06");
	cliente.setId(1);
	cliente.setNome("João");
	
	Cabeleireiro cabeleireiro = new Cabeleireiro("Bill","003.333.232-94");
	
	// agendamento
	
	Agendamento agendamento = new Agendamento(cliente,cabeleireiro);
	Calendar data = Calendar.getInstance();
	data.set(2022,9,27,20,30);
	agendamento.setData(data);
	
	return agendamento;
	
///////	
	/* Aluno: Marden Yêgo de Oliveira Freitas.
	 * Matrícula: 508371.
	 */
	
	public static void main(String[] args) {
		
		
		
		// Questão-1;
		Main a = new Main();
		Atendimento atendimento = a.carregarDadosParaTesteAtendimento();
		Atendimento atendimento1 = new Atendimento();
		System.out.println(atendimento.imprimir());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		Cliente Davy = new Cliente("009.222.343-02");
//		Cliente Ana = new Cliente("092.232.324.-23");
//		
//		Atendimento a1 = new Atendimento(); 
//		Atendimento a2 = new Atendimento(); 
//		Atendimento a3 = new Atendimento(); 
//		
//		Servico s1 = new Servico();
//		Servico s2 = new Servico();
//		Servico s3 = new Servico();
//		
//		Cabeleireiro c1 = new Cabeleireiro("0002","Irineu");
//		Cabeleireiro c2 = new Cabeleireiro("0022","miau");
//		Cabeleireiro c3 = new Cabeleireiro("0002","arou");
//		
		
		
	}

}
