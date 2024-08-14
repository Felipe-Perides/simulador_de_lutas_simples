package modelos;

public class Modelo_Item_Basico_Attk {
	private int dano, regVida; //Base
	public Modelo_Item_Basico_Attk(int Dano, int RegVida) {
		this.dano=Dano;
		this.regVida=RegVida;
	}
	public int getDano() {return dano;}
	public void setDano(int dano) {this.dano = dano;}
	public int getRegVida() {return regVida;}
	public void setRegVida(int regVida) {this.regVida = regVida;}
	
}
