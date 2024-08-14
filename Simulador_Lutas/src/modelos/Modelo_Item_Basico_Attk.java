package modelos;

public class Modelo_Item_Basico_Attk {
	private int dano, regVida; //Base
	private String name;
	public Modelo_Item_Basico_Attk(int Dano, int RegVida, String Name) {
		this.dano=Dano;
		this.regVida=RegVida;
		this.name=Name;
	}
	public int getDano() {return dano;}
	public void setDano(int dano) {this.dano = dano;}
	public int getRegVida() {return regVida;}
	public void setRegVida(int regVida) {this.regVida = regVida;}
	public String getName() {return name;}
	public void setName(String Name) {this.name=Name;}
	public String toString() {
		return name;
	}
}
