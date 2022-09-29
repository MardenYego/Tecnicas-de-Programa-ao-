package Laboratorio01;

import java.util.ArrayList;
import java.util.Calendar;

public class Atendimento {
	
	private Cliente cliente;
	private Calendar data;
	private ArrayList<Servico>listadeServico = new ArrayList<Servico>();
	
	
	Calendar calendar = Calendar.getInstance();


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Calendar getdata() {
		return data;
	}


	public void setdata(Calendar data) {
		this.data = data;
	}


	public ArrayList<Servico> getListadeServico() {
		return listadeServico;
	}


	public void setListadeServico(ArrayList<Servico> listadeServico) {
		this.listadeServico = listadeServico;
	}


	public Calendar getData() {
		return data;
	}


	public void setData(Calendar data) {
		data = data;
	}
			
	
	
	
	
	
	
}
