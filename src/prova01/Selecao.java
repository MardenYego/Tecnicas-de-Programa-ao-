package prova01;

import java.util.ArrayList;

public class Selecao {
	
	private String nome;
	public ArrayList<Goleiro> ListaDeGoleiros =new ArrayList<Goleiro>();
	
	
	public void adicionarGoleiro(Goleiro goleiro) {
		ListaDeGoleiros.add(goleiro);
	}  
	
	public Selecao(String nome) {
		setNome(nome);	
	}	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
