package prova01;

import java.util.Random;

public class Main {

	public void carregarChutes() {
		
		Random aleatorio=new Random();
		
		//Chute chute;
		for(int i=1;i<=30;i++) {
			Chute chute=new Chute(i,aleatorio.nextInt(9)+2);
			chute.adicionarChutes(chute);
		}
	}
	
	
	public void preencherSelecoes(Main main) {
		
		//SELEÇÃO-1
		Selecao selecao1 = new Selecao("Morfeus");
		
		//goleiro1
		Goleiro goleiro1 = new Goleiro(1,"Pratik Skaggs");
		goleiro1.preencherValores(5, 7, 8, 9, 6, 6);		
		
		//goleiro2
		Goleiro goleiro2 = new Goleiro(2,"Uehudah Hack");
		goleiro2.preencherValores(9, 6, 8, 8, 7, 10);		
		
		//goleiro3
		Goleiro goleiro3 = new Goleiro(3,"Edison Drye ");
		goleiro3.preencherValores(5, 8, 5, 8, 10, 7);
		
		//goleiro4
		Goleiro goleiro4 = new Goleiro(4,"Ajani Harding ");
		goleiro4.preencherValores(6, 6, 5, 8, 7, 6);		

		//goleiro5
		Goleiro goleiro5 = new Goleiro(5,"Orazio Hart");
		goleiro5.preencherValores(5, 8, 7, 9, 9, 10);	
		
		//adicionar os goleiros
		selecao1.adicionarGoleiro(goleiro1);
		selecao1.adicionarGoleiro(goleiro2);
		selecao1.adicionarGoleiro(goleiro3);
		selecao1.adicionarGoleiro(goleiro4);
		selecao1.adicionarGoleiro(goleiro5);
		
		main.carregarChutes();
				
	}
	

	public static void main(String[] args) {
		
		Main main = new Main();
		
		main.preencherSelecoes(main);
	
		
	}

}
