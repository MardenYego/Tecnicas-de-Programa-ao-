package lista02_estruturas_de_repeticao;

public class Questao11 {

	public static void main(String[] args) {
		
		int aux=0;
		
		for(int i=0;i<=3;i++) {
			for(int j=0;j<5;j++) {
				System.out.println(i+"-"+aux);
				aux++;
				if(j==1)
					aux=0;
			}
			aux=0;
		}
	}
}
