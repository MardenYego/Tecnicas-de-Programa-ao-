package Laboratorio01;

import java.util.ArrayList;
import java.util.Calendar;

public class Atendimento {
	
	private Cliente cliente;
	private Calendar data;
	private Cabeleireiro cabeleireiro;
			//tipo   tipo-objetos nome
	private ArrayList<Servico>listaDeServico;
	//= new ArrayList<Servico>();
	
	Calendar calendar = Calendar.getInstance();


	private Atendimento(Cliente cliente, Cabeleireiro cabeleireiro) {
		this.cliente=cliente;
		this.data=Calendar.getInstance();
		this.cabeleireiro=cabeleireiro;
		listaDeServico=new ArrayList<Servico>();
	}
	
//	
//	public Cliente getCliente() {
//		return cliente;
//	}
//
//
//	public void setCliente(Cliente cliente) {
//		this.cliente = cliente;
//	}

//
//	public Calendar getdata() {
//		return data;
//	}
//
//
//	public void setdata(Calendar data) {
//		this.data = data;
//	}


//	public ArrayList<Servico> getListaDeServico() {
//		return listaDeServico;
//	}


	public void setListaDeServico(ArrayList<Servico> listaDeServico) {
		this.listaDeServico = listaDeServico;
	}

	public void addServico(Servico serv) {
		this.listaDeServico.add(serv);
	}

//	public Calendar getData() {
//		return data;
//	}


//	public void setData(Calendar data) {
//		data = data;
//	}
//			
	
	
	
	
	
	
}
