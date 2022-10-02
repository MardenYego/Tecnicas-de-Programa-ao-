package Laboratorio01;

import java.util.Calendar;



public class Agendamento {
	
	private int id;
	private Calendar data;
	private Cliente cliente;
	private Cabeleireiro cabeleireiro;
//	private int hora;
//	private int minuto;
//	
	
	public Agendamento(Cliente cliente,Cabeleireiro cabeleireiro) {
		this.cliente=cliente;
		this.cabeleireiro=cabeleireiro;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id>0)
		this.id = id;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
//	public int getHora() {
//		return hora;
//	}
//	public void setHora(int hora) {
//		this.hora = hora;
//	}
//	public int getMinuto() {
//		return minuto;
//	}
//	public void setMinuto(int minuto) {
//		this.minuto = minuto;
//	}
//	
	
}
