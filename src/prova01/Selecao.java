package prova01;

import java.util.ArrayList;


public class Selecao {
	
	//private Goleiro goleiro;
	private String nome;
	private ArrayList<Goleiro> ListaDeGoleiros =new ArrayList<Goleiro>();
	

	public void adicionarSelecao(Goleiro goleiro) {
		ListaDeGoleiros.add(goleiro);
	}  
	
	public Selecao(String nome) {
		setNome(nome);
//		Goleiro goleiro1 =new Goleiro(1,"Pratik Skaggs ");
	}	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	//teste para impressão
	public String imprimir(){
		String saida = "";
		
		saida+="----------------------------------";
		saida+="\n******* goleiro *******";
		//saida+="\n id: "+ this.goleiro.getId();
		//saida+="\n Nome: "+this.goleiro.getNome();
		//saida+="\n agilidade :"+this.goleiro.getAgilidade();
		
	
		
//		saida+="\n\n******* Servicos ******* ";
//		for(Servico servico: listaDeServico) {
//			saida+="\n id: "+servico.getId();
//			saida+="\n Nome: "+servico.getNome();
//			saida+="\n Descrição: "+servico.getDescricao();
//			saida+="\n Valor: "+servico.getValor();
//		}
		
		saida+="-----------------------------------";
	
		return saida;
	//}
	}	
	
}
