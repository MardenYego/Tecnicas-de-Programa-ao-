package questao01;

public class ControleRemoto {
	
	private boolean estado;
	private int volume;
	private int canal;
	
	public ControleRemoto(int canal) {
		this.canal=canal;
	}
	
	public int aumentarVolume() {
		volume++;
		return volume;
	}
	
	public int diminuirVolume() {
		if(volume==0)
			return 0;
		else
			volume--;
		return volume;
	}
	
	public int proximoCanal() {
		canal++;
		return canal;
	}
	
	public int canalAnterior() {
		if(canal==1)
			return 1;
		else
			canal--;
		return canal;
	}
	
	
	//Apenas valores;
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	
	
}
