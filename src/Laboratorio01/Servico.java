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
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome.length()>=5)
			this.nome = nome;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		if(valor>=0)
			this.valor=valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		if(descricao.length()>=10)
			this.descricao = descricao;
	}
	
	
}
