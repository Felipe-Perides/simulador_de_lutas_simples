package modelos;

public class Modelo_Item_Avancado_Def extends Modelo_Item_Basico_Def{
	private int dodge;
	
	public Modelo_Item_Avancado_Def(int Def, int RegVida, String name) {
		super(Def, RegVida, name);
	}
	
	public int getDodge() {return dodge;}
	public void setDodge(int Dodge) {this.dodge=Dodge;}
}
