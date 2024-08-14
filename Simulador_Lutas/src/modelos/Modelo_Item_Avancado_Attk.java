package modelos;

public class Modelo_Item_Avancado_Attk extends Modelo_Item_Basico_Attk {
	private int vamp, sangramento, critico; //Effects
	
	public Modelo_Item_Avancado_Attk(int Dano, int RegVida) {
		super(Dano, RegVida);
		
	}
	
	public int getCritico() {return critico;}
	public void setCritico(int Critico) {this.critico=Critico;}
	public int getVamp() {return vamp;}
	public void setVamp(int vamp) {this.vamp = vamp;}
	public int getSangramento() {return sangramento;}
	public void setSangramento(int sangramento) {this.sangramento = sangramento;}
}
