package Laboratorio01;

public class Cliente {
	
	private int id;
	private String nome;
	private String CPF;
	
	
	public Cliente(String CPF) {
		this.CPF = CPF;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if(id>0)
			this.id = id;
		else
			System.out.println("Número inválido");;
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
	}
	
	public String getCPF() {
		return CPF;
	}

//	public void setCPF(String cPF) {
//		CPF = cPF;
//	}
	
}
