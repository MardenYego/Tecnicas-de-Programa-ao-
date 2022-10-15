package prova01;

public class Selecao {
	//private Goleiro goleiro;
	private String nome;
	
	Goleiro goleiro;
	
	public Selecao(String nome) {
		setNome(nome);
		new Goleiro(1,"Pratik Skaggs ");
	}	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
}
