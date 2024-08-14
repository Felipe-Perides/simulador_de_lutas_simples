package modelos;

public class Modelo_Item_Basico_Def {
	private int def, regVida;
	public Modelo_Item_Basico_Def(int Def, int RegVida) {
		this.def=Def;
		this.regVida=RegVida;
	}
	public int getDef() {return def;}
	public void setDef(int def) {this.def = def;}
	public int getRegVida() {return regVida;}
	public void setRegVida(int regVida) {this.regVida = regVida;}
	
}
