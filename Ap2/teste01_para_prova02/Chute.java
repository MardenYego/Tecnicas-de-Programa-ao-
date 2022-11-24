package teste01_para_prova02;

public class Chute {
	
	private Botao posicao;
	
	public Chute(int linha,int coluna) {
		posicao=new Botao(linha,coluna);
		
	}
	public int getLinha() {
		return this.posicao.getLinha();
	}
	public int getColuna() {
		return this.posicao.getColuna();
	}
	
}