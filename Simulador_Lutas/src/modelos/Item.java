package modelos;

public class Item {
	private String nome;
	private int bonusAttk, bonusDef, bonusVida, bonusMana, bonusRegVida;
	public Item(String Nome, int BonusAttk, int BonusDef, int BonusVida, int BonusMana, int BonusRegVida) {
		this.bonusAttk=BonusAttk;
		this.bonusDef=BonusDef;
		this.bonusMana=BonusMana;
		this.bonusRegVida=BonusRegVida;
		this.bonusVida=BonusVida;
		this.nome=Nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getBonusAttk() {
		return bonusAttk;
	}
	public void setBonusAttk(int bonusAttk) {
		this.bonusAttk = bonusAttk;
	}
	public int getBonusDef() {
		return bonusDef;
	}
	public void setBonusDef(int bonusDef) {
		this.bonusDef = bonusDef;
	}
	public int getBonusVida() {
		return bonusVida;
	}
	public void setBonusVida(int bonusVida) {
		this.bonusVida = bonusVida;
	}
	public int getBonusMana() {
		return bonusMana;
	}
	public void setBonusMana(int bonusMana) {
		this.bonusMana = bonusMana;
	}
	public int getBonusRegVida() {
		return bonusRegVida;
	}
	public void setBonusRegVida(int bonusRegVida) {
		this.bonusRegVida = bonusRegVida;
	}
	
}
