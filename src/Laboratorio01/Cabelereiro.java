package Laboratorio01;

public class Cabelereiro {
	
	private int id;
	private String nome;
	private String CPF;
	
	
	public Cabelereiro(String CPF,String nome) {
			this.CPF = CPF;
			this.nome=nome;
	}
	
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
		
		if(auxiliar>=3)
			this.nome = nome;
		else
			System.out.println("Nome inválido");
	}
	
	public String getCPF() {
		return CPF;
	}
	
	
	
	
	
	
	
	
}
