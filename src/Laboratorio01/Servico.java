package Laboratorio01;

public class Servico {

	private int id;
	private String nome;
	private float valor;
	private String descricao;
	
		
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if(id>0)
			this.id = id;
		else
			System.out.println("Id inválido");
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		int auxiliar=0;
		for(int i=0;i<nome.length();i++) {
			auxiliar++;
		}
		if(auxiliar>=5)
			this.nome = nome;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		if(valor<0)
			System.out.println("valor inválido");
		else
			this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		int auxiliar=0;
		for(int i=0;i<nome.length();i++) {
			auxiliar++;
		}
		if(auxiliar>=10)
			this.descricao = descricao;
	}
	
	
}
