package prova01;

public class Gol {
	
	private Goleiro goleiro;
	private Chute chute;
	//private Posicao posicao;
	
	int linhas=9,colunas=17;
	Posicao[][] ArrayGol= new Posicao[linhas][colunas]; 

	
	//Posicao posicao1;
	// Dúvida se faço o mapeamento do gol com números ou caracteres / trave:'T',
	//gol:dividido em quadrantes:'1','2','3','4'
	//
	
	//Posicao posicao1;
	
	//Posicao posicao1;
	
	public void preencherGol() {
		Posicao posicao1;
		for (int i=0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				ArrayGol[i][j]=new Posicao();
			}
		}
	}
	
	public void preencherTraves() {
		
		for (int i=0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				//ArrayGol[i][j]=new Posicao();
				if((i==1) && ((j<=15) && (j>=1))) {
					ArrayGol[i][j].setTipo("T");
				}else if(((i<=8) && (i>=1)) && (j==1)) {
					ArrayGol[i][j].setTipo("T");
				}else if(((i<=8) && (i>=1)) && (j==15)) {
					ArrayGol[i][j].setTipo("T");
				}else if((i>=2 && i<=4) && (j>=2 && j<=7)) {
					ArrayGol[i][j].setTipo("1");
				}else if((i>=2 && i<=4) && (j>=8 && j<=14)) {
					ArrayGol[i][j].setTipo("2");
				}else if((i>=5 && i<=8) && (j>=2 && j<=7)) {
					ArrayGol[i][j].setTipo("3");
				}else if((i>=5 && i<=8 ) && (j>=8 && j<=14)) {
					ArrayGol[i][j].setTipo("4");
				}else {
					ArrayGol[i][j].setTipo("F");
				}	
			}
		}
	}
	
	
	
	public void preenncherGavetas() {
		for(int i=0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				if(i==2 && j==2)
					ArrayGol[i][j].setTipo("g");
				if(i==2 && j==14)
					ArrayGol[i][j].setTipo("g");
			}	
		}	
	}
	
	public void imprimir() {
		for(int i=0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				System.out.print(ArrayGol[i][j].getTipo()+" ");
			}
			System.out.println();
		}
	}
	
	
}
