package prova01;

public class TesteMatriz {

	public static void main(String[] args) {
		int linhas=8;
		int colunas=10;
		String[][] matriz= new String[linhas][colunas];
		for(int i=0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				matriz[i][j]="*";
			}
		}
	
		
		for(int i=0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}

		
		System.out.println("================================================================");
		int aux=0;
		for(int j=0;j<6;j++) {
			for(int i=7;i>=5 && aux<14;i--) {
				matriz[i][j]="+";
				aux++;
			}
		}

		for(int i=0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
