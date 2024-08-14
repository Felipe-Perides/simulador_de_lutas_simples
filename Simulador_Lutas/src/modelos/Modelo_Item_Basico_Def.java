package modelos;

public class Modelo_Item_Basico_Def {
	private int def, regVida;
	private String name;
	public Modelo_Item_Basico_Def(int Def, int RegVida, String Name) {
		this.def=Def;
		this.regVida=RegVida;
		this.name=Name;
	}
	public int getDef() {return def;}
	public void setDef(int def) {this.def = def;}
	public int getRegVida() {return regVida;}
	public void setRegVida(int regVida) {this.regVida = regVida;}
	public String getName() {return name;}
	public void setName(String Name) {this.name=Name;}
	public String toString() {
		return name;
	}
}
