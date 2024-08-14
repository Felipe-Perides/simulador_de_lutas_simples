package modelos;

public class Itens {
	private Modelo_Item_Basico_Def cotaDeMalha, capaNegatron, escudoDeMadeira, botaDeAgilidade1, essenciaVital;
	private Modelo_Item_Basico_Attk adaga, graveto, martelo, socoIngles, estilingue;
	private Modelo_Item_Intermedio_Def coleteDeEspinhos, mantoAureo, escudoDeMetal, botaDeAgilidade2, pedraRevitalizadora;
	private Modelo_Item_Intermedio_Attk espadaLonga, nunchaku, clava, arco, varinha;
	private Modelo_Item_Avancado_Def armaduraDeEspinhos, lagrimaDeIsabel, escudoMagico, botaDeAgilidade3, pedraFilosofal;
	private Modelo_Item_Avancado_Attk machado, veuDaNoite, katana, pistola, cajado;
	public Itens() {
		this.cotaDeMalha = new Modelo_Item_Basico_Def(6,3); 	//maximo 10
		this.capaNegatron = new Modelo_Item_Basico_Def(6,3); 	//maximo 10
		this.escudoDeMadeira = new Modelo_Item_Basico_Def(7,0); 	//maximo 10
		this.botaDeAgilidade1 = new Modelo_Item_Basico_Def(1,1); 	//maximo 10
		this.essenciaVital = new Modelo_Item_Basico_Def(1,5); 	//maximo 10
		
		this.adaga = new Modelo_Item_Basico_Attk(5,0); 	//maximo 10
		this.graveto = new Modelo_Item_Basico_Attk(2,0); 	//maximo 10
		this.martelo = new Modelo_Item_Basico_Attk(8,0); 	//maximo 10
		this.socoIngles = new Modelo_Item_Basico_Attk(4,0); 	//maximo 10
		this.estilingue = new Modelo_Item_Basico_Attk(5,2);		//maximo 10
		
		this.coleteDeEspinhos = new Modelo_Item_Intermedio_Def(12,6);	//maximo 20
		this.mantoAureo = new Modelo_Item_Intermedio_Def(12,6);		//maximo 20
		this.escudoDeMetal = new Modelo_Item_Intermedio_Def(14,4);	//maximo 20
		this.botaDeAgilidade2 = new Modelo_Item_Intermedio_Def(4,4);	//maximo 20
		this.pedraRevitalizadora = new Modelo_Item_Intermedio_Def(4,18);	//maximo 20
		
		this.espadaLonga = new Modelo_Item_Intermedio_Attk(15,0);	//maximo 20
		this.nunchaku = new Modelo_Item_Intermedio_Attk(14,0);	//maximo 20
		this.clava = new Modelo_Item_Intermedio_Attk(18,0);	//maximo 20
		this.arco = new Modelo_Item_Intermedio_Attk(16,4);	//maximo 20
		this.varinha = new Modelo_Item_Intermedio_Attk(12,0);	//maximo 20
		
		this.armaduraDeEspinhos = new Modelo_Item_Avancado_Def(24,12);	//maximo 30
		this.lagrimaDeIsabel = new Modelo_Item_Avancado_Def(24,12);		//maximo 30
		this.escudoMagico = new Modelo_Item_Avancado_Def(28,8);		//maximo 30
		this.botaDeAgilidade3 = new Modelo_Item_Avancado_Def(8,8);	//maximo 30
		this.pedraFilosofal = new Modelo_Item_Avancado_Def(8,30);	//maximo 30
		
		this.machado = new Modelo_Item_Avancado_Attk(26,0); 	//maximo 30
		this.veuDaNoite = new Modelo_Item_Avancado_Attk(28,0);	//maximo 30
		this.katana = new Modelo_Item_Avancado_Attk(24,0);		//maximo 30
		this.pistola = new Modelo_Item_Avancado_Attk(25,0);		//maximo 30
		this.cajado = new Modelo_Item_Avancado_Attk(20,0);		//maximo 30
	}
	public Modelo_Item_Basico_Def getCotaDeMalha() {
		return cotaDeMalha;
	}
	public void setCotaDeMalha(Modelo_Item_Basico_Def cotaDeMalha) {
		this.cotaDeMalha = cotaDeMalha;
	}
	public Modelo_Item_Basico_Def getCapaNegatron() {
		return capaNegatron;
	}
	public void setCapaNegatron(Modelo_Item_Basico_Def capaNegatron) {
		this.capaNegatron = capaNegatron;
	}
	public Modelo_Item_Basico_Def getEscudoDeMadeira() {
		return escudoDeMadeira;
	}
	public void setEscudoDeMadeira(Modelo_Item_Basico_Def escudoDeMadeira) {
		this.escudoDeMadeira = escudoDeMadeira;
	}
	public Modelo_Item_Basico_Def getBotaDeAgilidade1() {
		return botaDeAgilidade1;
	}
	public void setBotaDeAgilidade1(Modelo_Item_Basico_Def botaDeAgilidade1) {
		this.botaDeAgilidade1 = botaDeAgilidade1;
	}
	public Modelo_Item_Basico_Def getEssenciaVital() {
		return essenciaVital;
	}
	public void setEssenciaVital(Modelo_Item_Basico_Def essenciaVital) {
		this.essenciaVital = essenciaVital;
	}
	public Modelo_Item_Basico_Attk getAdaga() {
		return adaga;
	}
	public void setAdaga(Modelo_Item_Basico_Attk adaga) {
		this.adaga = adaga;
	}
	public Modelo_Item_Basico_Attk getGraveto() {
		return graveto;
	}
	public void setGraveto(Modelo_Item_Basico_Attk graveto) {
		this.graveto = graveto;
	}
	public Modelo_Item_Basico_Attk getMartelo() {
		return martelo;
	}
	public void setMartelo(Modelo_Item_Basico_Attk martelo) {
		this.martelo = martelo;
	}
	public Modelo_Item_Basico_Attk getSocoIngles() {
		return socoIngles;
	}
	public void setSocoIngles(Modelo_Item_Basico_Attk socoIngles) {
		this.socoIngles = socoIngles;
	}
	public Modelo_Item_Basico_Attk getEstilingue() {
		return estilingue;
	}
	public void setEstilingue(Modelo_Item_Basico_Attk estilingue) {
		this.estilingue = estilingue;
	}
	public Modelo_Item_Intermedio_Def getColeteDeEspinhos() {
		return coleteDeEspinhos;
	}
	public void setColeteDeEspinhos(Modelo_Item_Intermedio_Def coleteDeEspinhos) {
		this.coleteDeEspinhos = coleteDeEspinhos;
	}
	public Modelo_Item_Intermedio_Def getMantoAureo() {
		return mantoAureo;
	}
	public void setMantoAureo(Modelo_Item_Intermedio_Def mantoAureo) {
		this.mantoAureo = mantoAureo;
	}
	public Modelo_Item_Intermedio_Def getEscudoDeMetal() {
		return escudoDeMetal;
	}
	public void setEscudoDeMetal(Modelo_Item_Intermedio_Def escudoDeMetal) {
		this.escudoDeMetal = escudoDeMetal;
	}
	public Modelo_Item_Intermedio_Def getBotaDeAgilidade2() {
		return botaDeAgilidade2;
	}
	public void setBotaDeAgilidade2(Modelo_Item_Intermedio_Def botaDeAgilidade2) {
		this.botaDeAgilidade2 = botaDeAgilidade2;
	}
	public Modelo_Item_Intermedio_Def getPedraRevitalizadora() {
		return pedraRevitalizadora;
	}
	public void setPedraRevitalizadora(Modelo_Item_Intermedio_Def pedraRevitalizadora) {
		this.pedraRevitalizadora = pedraRevitalizadora;
	}
	public Modelo_Item_Intermedio_Attk getEspadaLonga() {
		return espadaLonga;
	}
	public void setEspadaLonga(Modelo_Item_Intermedio_Attk espadaLonga) {
		this.espadaLonga = espadaLonga;
	}
	public Modelo_Item_Intermedio_Attk getNunchaku() {
		return nunchaku;
	}
	public void setNunchaku(Modelo_Item_Intermedio_Attk nunchaku) {
		this.nunchaku = nunchaku;
	}
	public Modelo_Item_Intermedio_Attk getClava() {
		return clava;
	}
	public void setClava(Modelo_Item_Intermedio_Attk clava) {
		this.clava = clava;
	}
	public Modelo_Item_Intermedio_Attk getArco() {
		return arco;
	}
	public void setArco(Modelo_Item_Intermedio_Attk arco) {
		this.arco = arco;
	}
	public Modelo_Item_Intermedio_Attk getVarinha() {
		return varinha;
	}
	public void setVarinha(Modelo_Item_Intermedio_Attk varinha) {
		this.varinha = varinha;
	}
	public Modelo_Item_Avancado_Def getArmaduraDeEspinhos() {
		return armaduraDeEspinhos;
	}
	public void setArmaduraDeEspinhos(Modelo_Item_Avancado_Def armaduraDeEspinhos) {
		this.armaduraDeEspinhos = armaduraDeEspinhos;
	}
	public Modelo_Item_Avancado_Def getLagrimaDeIsabel() {
		return lagrimaDeIsabel;
	}
	public void setLagrimaDeIsabel(Modelo_Item_Avancado_Def lagrimaDeIsabel) {
		this.lagrimaDeIsabel = lagrimaDeIsabel;
	}
	public Modelo_Item_Avancado_Def getEscudoMagico() {
		return escudoMagico;
	}
	public void setEscudoMagico(Modelo_Item_Avancado_Def escudoMagico) {
		this.escudoMagico = escudoMagico;
	}
	public Modelo_Item_Avancado_Def getBotaDeAgilidade3() {
		return botaDeAgilidade3;
	}
	public void setBotaDeAgilidade3(Modelo_Item_Avancado_Def botaDeAgilidade3) {
		this.botaDeAgilidade3 = botaDeAgilidade3;
	}
	public Modelo_Item_Avancado_Def getPedraFilosofal() {
		return pedraFilosofal;
	}
	public void setPedraFilosofal(Modelo_Item_Avancado_Def pedraFilosofal) {
		this.pedraFilosofal = pedraFilosofal;
	}
	public Modelo_Item_Avancado_Attk getMachado() {
		return machado;
	}
	public void setMachado(Modelo_Item_Avancado_Attk machado) {
		this.machado = machado;
	}
	public Modelo_Item_Avancado_Attk getVeuDaNoite() {
		return veuDaNoite;
	}
	public void setVeuDaNoite(Modelo_Item_Avancado_Attk veuDaNoite) {
		this.veuDaNoite = veuDaNoite;
	}
	public Modelo_Item_Avancado_Attk getKatana() {
		return katana;
	}
	public void setKatana(Modelo_Item_Avancado_Attk katana) {
		this.katana = katana;
	}
	public Modelo_Item_Avancado_Attk getPistola() {
		return pistola;
	}
	public void setPistola(Modelo_Item_Avancado_Attk pistola) {
		this.pistola = pistola;
	}
	public Modelo_Item_Avancado_Attk getCajado() {
		return cajado;
	}
	public void setCajado(Modelo_Item_Avancado_Attk cajado) {
		this.cajado = cajado;
	}
	
	
}
