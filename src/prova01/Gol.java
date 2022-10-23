package prova01;

public class Gol {
	
	private Selecao selecao;
	private Posicao posicao;
	
	int linhas=9,colunas=17;
	Posicao[][] ArrayGol= new Posicao[linhas][colunas]; 

	
	public Gol(){
		Posicao posicao1;
		for (int i=0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				ArrayGol[i][j]=new Posicao();
			}
		}
	}
	
	
	// Códigos para testes
	public void preencherTraves() {
		
		for (int i=0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
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
		ArrayGol[2][2].setTipo("g");
		ArrayGol[2][14].setTipo("g");
	}
	
	//teste de impressão
	public void imprimir() {
		for(int i=0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				System.out.print(ArrayGol[i][j].getTipo()+" ");
			}
			System.out.println();
		}
	}
}
