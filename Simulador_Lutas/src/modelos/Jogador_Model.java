package modelos;

import java.util.ArrayList;
import java.util.List;

public class Jogador_Model {
	private int attk, def, vida, mana, regVida;
	private ArrayList<Itens> hud;
	public Jogador_Model(int Attk, int Def, int Vida, int Mana, int RegVida) {
		this.attk=Attk;
		this.def=Def;
		this.mana=Mana;
		this.regVida=RegVida;
		this.vida=Vida;
		this.hud = new ArrayList<>();
	}
	public int getRegVida() {return regVida;}
	public void setRegVida(int RegVida) {this.regVida=RegVida;}
	public int getAttk() {
		return attk;
	}
	public void setAttk(int attk) {
		this.attk = attk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	@Override
	public String toString() {
		return "Jogador_Model [attk=" + attk + ", def=" + def + ", vida=" + vida + ", mana=" + mana + "]";
	}
	public void pegarItem(Itens qualquer) {
		hud.add(qualquer);
	}
	public void droparItem(Itens qualquer) {
		hud.remove(qualquer);
	}
	// Método para aplicar os efeitos dos itens
    public void aplicarEfeitosDosItens(List<Item> itens) {
        for (Item item : itens) {
            this.attk += item.getBonusAttk();
            this.def += item.getBonusDef();
            this.vida += item.getBonusVida();
            this.mana += item.getBonusMana();
            this.regVida += item.getBonusRegVida();
        }
    }

}
