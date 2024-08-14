package modelos;

public class Modelo_Item_Avancado_Def extends Modelo_Item_Basico_Def{
	private int dodge;
	
	public Modelo_Item_Avancado_Def(int Def, int RegVida) {
		super(Def, RegVida);
	}
	
	public int getDodge() {return dodge;}
	public void setDodge(int Dodge) {this.dodge=Dodge;}
}
