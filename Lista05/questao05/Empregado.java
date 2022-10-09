package questao05;

public class Empregado {
	
	private int id;
	private String nome;
	private String sobrenome;
	private double salarioMensal;
	boolean[] diasTrabalhados= new boolean[30]; 
	
	
	Empregado(String nome,String sobrenome){
		setNome(nome);
		setSobrenome(sobrenome);
	}
	
	Empregado(int id, String nome,String sobrenome){
		setId(id);
		setNome(nome);
		setSobrenome(sobrenome);
	}
	
	public void preencherDias(String dia){
		
		for(int i=0;i<diasTrabalhados.length;i++) {
			if(dia.equals("sim")) {
				diasTrabalhados[i]=true;
			}else {
				diasTrabalhados[i]=false;
			}
		}
	}	
	
	public int checarDias() {
		
		int contador=0;
		for (boolean b : diasTrabalhados) {
			if(b==true)
				contador++;
		}
		return contador;
	}
	
	public void
	calcularSalario(int dias) {
		
		double auxiliar=0;
		
		if(dias==30) {
			auxiliar=salarioMensal*1/100;
		    salarioMensal+=auxiliar;
		}
		
		if(dias>=25 && dias<=27) {
			auxiliar=salarioMensal*2/100;
			salarioMensal+=auxiliar;
		}
		
		if(dias>=20 && dias<=24) {
			auxiliar=salarioMensal*((30-dias)*3)/100;
			salarioMensal-=auxiliar;
		}
		
		if(dias<20) {
			auxiliar=salarioMensal*20/100;
			salarioMensal-=auxiliar;
		}

	}
	
	
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
		if(!(nome.equals("")))
			this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		if(!(sobrenome.equals("")))
			this.sobrenome = sobrenome;
	}
	public double getSalarioMensal() {
		return salarioMensal;
	}
	public void setSalarioMensal(double salarioMensal) {
		if(salarioMensal>0)
			this.salarioMensal = salarioMensal;
	}
	
}



