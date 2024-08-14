package modelos;

import java.util.ArrayList;

public class Jogador_Model {
	private int attk, def, vida, mana;
	private ArrayList<Itens> hud;
	public Jogador_Model(int Attk, int Def, int Vida, int Mana) {
		this.attk=Attk;
		this.def=Def;
		this.mana=Mana;
		this.vida=Vida;
		this.hud = new ArrayList<Itens>();
	}
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
	
}
