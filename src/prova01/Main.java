package prova01;

public class Main {

	public Selecao preencherSelecoes() {
		
		Selecao selecao1 = new Selecao("Morfeus");
		
		//goleiro1
		Goleiro goleiro1 = new Goleiro(1,"Pratik Skaggs");
		goleiro1.setVelocidade(5);
		goleiro1.setFlexibilidade(7);
		goleiro1.setAgilidade(8);
		goleiro1.setCoordenacao(9);
		goleiro1.setForca(6);
		goleiro1.setEquilibrio(6);
		
		//goleiro2
		Goleiro goleiro2 = new Goleiro(2,"Uehudah Hack");
		goleiro2.setVelocidade(9);
		goleiro2.setFlexibilidade(6);
		goleiro2.setAgilidade(8);
		goleiro2.setCoordenacao(8);
		goleiro2.setForca(7);
		goleiro2.setEquilibrio(10);
		
		//goleiro3
		Goleiro goleiro3 = new Goleiro(3,"Edison Drye ");
		goleiro3.setVelocidade(5);
		goleiro3.setFlexibilidade(8);
		goleiro3.setAgilidade(5);
		goleiro3.setCoordenacao(8);
		goleiro3.setForca(10);
		goleiro3.setEquilibrio(0);
		
		//goleiro4
		Goleiro goleiro4 = new Goleiro(4,"Ajani Harding ");
		goleiro4.setVelocidade(6);
		goleiro4.setFlexibilidade(6);
		goleiro4.setAgilidade(5);
		goleiro4.setCoordenacao(8);
		goleiro4.setForca(7);
		goleiro4.setEquilibrio(6);
		
		//goleiro5
		Goleiro goleiro5 = new Goleiro(5,"Orazio Hart");
		goleiro5.setVelocidade(5);
		goleiro5.setFlexibilidade(8);
		goleiro5.setAgilidade(7);
		goleiro5.setCoordenacao(9);
		goleiro5.setForca(9);
		goleiro5.setEquilibrio(10);
		
		//Selecao selecao1 = new Selecao("Morfeus");
		
		//adicionar os goleiros
		selecao1.adicionarSelecao(goleiro1);
		selecao1.adicionarSelecao(goleiro2);
		selecao1.adicionarSelecao(goleiro3);
		
		//System.out.println(goleiro1.getAgilidade());
		return selecao1;
	}
	
//	public ArrayList<Goleiro> adicionarGoleiros(Goleiro goleiro ){
//		
//	}
	
	
	
	
	
	public static void main(String[] args) {
		
//		Main main = new Main();
//		Selecao selecao =main.preencherSelecoes();
		
		
		///não funciona 
		//System.out.println(selecao.imprimir());
		
		
		
		
		
		
		
		
		
		//!!!!!testes!!!!!
		//Gol gol = new Gol();
	
		
		
//		gol.preencherGol();
//		gol.preencherTraves();
//		gol.preenncherGavetas();
//		
//		gol.imprimir();
	}

}
