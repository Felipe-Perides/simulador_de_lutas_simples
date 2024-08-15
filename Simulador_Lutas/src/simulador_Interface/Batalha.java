package simulador_Interface;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import simulador_Interface.Criacao_Personagem;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import modelos.Item;
import modelos.Itens;
import modelos.Jogador_Model;

import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JList;

public class Batalha extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane, panel;
	private Criacao_Personagem person;
	private int attk1S,attk2S,def1S,def2S,vida1S,vida2S,mana1S,mana2S,regVida1,regVida2, round = 0;;
	private JTextField textField;
	private JButton proximo;
	private JProgressBar vidaBar1, vidaBar2, manaBar1, manaBar2;
	private Jogador_Model J1, J2;
	private ArrayList<String> itens = new ArrayList<String>();
	private DefaultListModel<String> stringItens1 = new DefaultListModel<>();
	private DefaultListModel<String> stringItens2 = new DefaultListModel<>();
	private JList hud1, hud2;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Criacao_Personagem criacaoPersonagem = new Criacao_Personagem();
					criacaoPersonagem.setVisible(true);
					Batalha frame = new Batalha(criacaoPersonagem);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Batalha(Criacao_Personagem person) {
		this.person=person;
		initComponents();
		panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setFont(new Font("Arial", Font.BOLD, 20));
                g.drawString("Turno: " + round, getWidth() / 2 - 50, 30);
            }
            };
            panel.setBounds(122, 31, 236, 59);
	 	    getContentPane().add(panel);
	 	    
	 	   vidaBar1 = new JProgressBar();
	        vidaBar1.setMaximum(100);
	        vidaBar1.setValue(vida1S);
	        vidaBar1.setStringPainted(true);
	        vidaBar1.setBounds(10, 155, 150, 30);
	        contentPane.add(vidaBar1);

	        vidaBar2 = new JProgressBar();
	        vidaBar2.setMaximum(100);
	        vidaBar2.setValue(vida2S);
	        vidaBar2.setStringPainted(true);
	        vidaBar2.setBounds(376, 155, 150, 30);
	        contentPane.add(vidaBar2);
	 	    
	 	    proximo = new JButton("PRÓXIMO TURNO");
	 	    proximo.addActionListener(new ActionListener() {
	 	    	public void actionPerformed(ActionEvent e) {
	 	    		round++;
	                simularBatalha();
	                panel.repaint();
	                vidaBar1.setValue(vida1S);
	                vidaBar2.setValue(vida2S);
	 	    	}
	 	    });
	 	    proximo.setBounds(177, 263, 154, 23);
	 	    contentPane.add(proximo);
	 	    
	 	    JLabel vida1 = new JLabel("VIDA");
	 	    vida1.setBounds(24, 130, 46, 14);
	 	    contentPane.add(vida1);
	 	    
	 	    JLabel vida2 = new JLabel("VIDA");
	 	    vida2.setBounds(409, 128, 46, 14);
	 	    contentPane.add(vida2);
	 	    
	 	    // Modificar os setVisible para TRUE quando o objeto "varinha" for equipado
	 	    JLabel manaC1 = new JLabel("MANA");
	 	    manaC1.setBounds(24, 196, 46, 20);
	 	    contentPane.add(manaC1);
	 	    manaC1.setVisible(false);
	 	    
	 	    JLabel manaC2 = new JLabel("MANA");
	 	    manaC2.setBounds(408, 196, 46, 20);
	 	    contentPane.add(manaC2);
	 	    manaC2.setVisible(false);
	 	    
	 	    manaBar1 = new JProgressBar();
	        manaBar1.setMaximum(100);
	        manaBar1.setValue(mana1S);
	        manaBar1.setStringPainted(true);
	        manaBar1.setBounds(10, 222, 150, 30);
	        contentPane.add(manaBar1);
	        manaBar1.setVisible(false);
	        
	        manaBar2 = new JProgressBar();
	        manaBar2.setMaximum(100);
	        manaBar2.setValue(mana2S);
	        manaBar2.setStringPainted(true);
	        manaBar2.setBounds(376, 222, 150, 30);
	        contentPane.add(manaBar2);
	 	    manaBar2.setVisible(false);
	        
	 	    hud1 = new JList(stringItens1);
	 	    hud1.setBounds(10, 263, 112, 72);
	 	    contentPane.add(hud1);
	 	    stringItens1.addElement(itens.get(0));
	 	    stringItens1.addElement(itens.get(5));
	 	    stringItens1.addElement(itens.get(14));
	 	    
	 	    hud2 = new JList(stringItens2);
	 	    hud2.setBounds(376, 263, 112, 72);
	 	    contentPane.add(hud2);
	 	   stringItens2.addElement(itens.get(3));
	 	    stringItens2.addElement(itens.get(8));
	 	    stringItens2.addElement(itens.get(12));
	        
	}
	
	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jogador1 = new JLabel("JOGADOR 1");
		jogador1.setBounds(24, 20, 74, 27);
		contentPane.add(jogador1);
		
		JLabel jogador2 = new JLabel("JOGADOR 2");
		jogador2.setBounds(409, 18, 74, 27);
		contentPane.add(jogador2);
		
		JLabel batalha = new JLabel("BATALHA");
		batalha.setBounds(226, 11, 74, 20);
		contentPane.add(batalha);
		
		JLabel ataque1 = new JLabel("ATAQUE");
		ataque1.setBounds(24, 47, 74, 20);
		contentPane.add(ataque1);
		
		JLabel defesa1 = new JLabel("DEFESA");
		defesa1.setBounds(24, 91, 62, 20);
		contentPane.add(defesa1);
		
		JLabel ataque2 = new JLabel("ATAQUE");
		ataque2.setBounds(409, 47, 74, 20);
		contentPane.add(ataque2);
		
		JLabel defesa2 = new JLabel("DEFESA");
		defesa2.setBounds(409, 91, 62, 20);
		contentPane.add(defesa2);
		
		JButton comecar = new JButton("COMEÇAR");
		comecar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comecar.setVisible(false);
				proximo.setVisible(true);
				panel.setVisible(true);
				
			}
		});
		comecar.setBounds(198, 230, 112, 23);
		contentPane.add(comecar);
		
		attk1S=person.getAttk1();attk2S=person.getAttk2();def1S=person.getDef1();def2S=person.getDef2();vida1S=person.getVida1();vida2S=person.getVida2();
		mana1S=person.getMana1();mana2S=person.getMana2();
		
		JLabel atq1 = new JLabel(String.valueOf(attk1S));
		atq1.setBounds(24, 66, 46, 14);
		contentPane.add(atq1);
		
		JLabel def1 = new JLabel(String.valueOf(def1S));
		def1.setBounds(24, 105, 46, 14);
		contentPane.add(def1);
		
		JLabel def2 = new JLabel(String.valueOf(def2S));
		def2.setBounds(409, 105, 46, 14);
		contentPane.add(def2);
		
		JLabel atq2 = new JLabel(String.valueOf(attk2S));
		atq2.setBounds(408, 66, 46, 14);
		contentPane.add(atq2);
		
		textField = new JTextField(" ");
		textField.setBounds(111, 116, 271, 83);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
	}
	public void iniciarItens(Itens itensClass) {
		itensClass.addItem(new Item("cota de malha", 0, 6, 2, 0, 3));
		itensClass.addItem(new Item("capa negatron", 0, 6, 2, 0, 3));
		itensClass.addItem(new Item("escudo de madeira", 0, 7, 0, 0, 0));
		itensClass.addItem(new Item("bota de agilidade 1", 0, 0, 1, 1, 6));
		itensClass.addItem(new Item("essência vital", 0, 0, 6, 0, 8));
		itensClass.addItem(new Item("adaga", 6, 0, 0, 0, 0));
		itensClass.addItem(new Item("graveto", 2, 0, 0, 0, 0));
		itensClass.addItem(new Item("martelo", 9, 0, 0, 0, 0));
		itensClass.addItem(new Item("soco-inglês", 6, 0, 0, 0, 0));
		itensClass.addItem(new Item("estilingue", 7, 0, 0, 0, 0));
		itensClass.addItem(new Item("colete de espinhos", 0, 12, 4, 0, 6));
		itensClass.addItem(new Item("manto aureo", 0, 12, 4, 0, 6));
		itensClass.addItem(new Item("escudo de metal", 0, 14, 0, 0, 0));
		itensClass.addItem(new Item("bota de agilidade 2", 0, 0, 8, 8, 14));
		itensClass.addItem(new Item("pedra revitalizadora", 0, 0, 16, 0, 18));
		itensClass.addItem(new Item("espada longa", 12, 0, 0, 0, 0));
		itensClass.addItem(new Item("nunchaku", 14, 0, 0, 0, 0));
		itensClass.addItem(new Item("clava", 18, 0, 0, 0, 0));
		itensClass.addItem(new Item("arco", 12, 0, 0, 0, 0));
		itensClass.addItem(new Item("varinha", 10, 0, 0, 15, 0));
		itensClass.addItem(new Item("armadura de espinhos", 0, 25, 10, 0, 10));
		itensClass.addItem(new Item("lagrima de Isabel", 0, 25, 10, 0, 10));
		itensClass.addItem(new Item("escudo magico", 0, 30, 0, 0, 0));
		itensClass.addItem(new Item("bota de agilidade 3", 0, 0, 16, 16, 26));
		itensClass.addItem(new Item("pedra filosofal", 0, 0, 30, 0, 30));
		itensClass.addItem(new Item("machado", 28, 0, 0, 0, 0));
		itensClass.addItem(new Item("véu da noite", 30, 0, 0, 15, 0));
		itensClass.addItem(new Item("katana", 27, 0, 0, 0, 0));
		itensClass.addItem(new Item("pistola", 26, 0, 0, 0, 0));
		itensClass.addItem(new Item("cajado", 22, 0, 0, 25, 0));
	}
	private void simularBatalha() {
		//Inicializações
		Itens itensClass = new Itens();
		iniciarItens(itensClass);
		attk1S=person.getAttk1();attk2S=person.getAttk2();def1S=person.getDef1();def2S=person.getDef2();vida1S=person.getVida1();vida2S=person.getVida2();
		mana1S=person.getMana1();mana2S=person.getMana2();regVida1=person.getRegVida1();regVida2=person.getRegVida2();
		J1 = new Jogador_Model(attk1S,def1S,vida1S,mana1S,regVida1);
		J2 = new Jogador_Model(attk2S,def2S,vida2S,mana2S,regVida2);
		
		// Itens - J1
        ListModel<String> itens1 = hud1.getModel();
    	List<Item> itensJ1 = new ArrayList<Item>();
    	
    	for(int i = 0; i<itens1.getSize();i++) {
    		String nomeItem = itens1.getElementAt(i);
    		Item item = itensClass.getItemByName(nomeItem);
    		if(item != null) {
    			itensJ1.add(item);
    		}
    	}
    	J1.aplicarEfeitosDosItens(itensJ1);
    	
    	// Itens - J2
    	ListModel<String> itens2 = hud2.getModel();
    	List<Item> itensJ2 = new ArrayList<Item>();
        
    	for(int i = 0; i<itens2.getSize();i++) {
    		String nomeItem = itens2.getElementAt(i);
    		Item item = itensClass.getItemByName(nomeItem);
    		if(item != null) {
    			itensJ2.add(item);
    		}
    	}
    	J2.aplicarEfeitosDosItens(itensJ2);
    	
		//Batalha em turnos
    	
    	
    	while(J1.getVida() > 0 && J2.getVida() > 0) {
        	batalhaTurnos(J1, J2, round);
        	round++;
        }
		
          
    }
	public void batalhaTurnos(Jogador_Model J1, Jogador_Model J2, int round) {
		int ataq1 = J1.getAttk();
	    int defe1 = J1.getDef();
	    int vida1S = J1.getVida();
	    int mana1S = J1.getMana();
	    int regenVida1 = J1.getRegVida();

	    int ataq2 = J2.getAttk();
	    int defe2 = J2.getDef();
	    int vida2S = J2.getVida();
	    int mana2S = J2.getMana();
	    int regenVida2 = J2.getRegVida();

	    int resto;
	    
	    //Batalhas em turnos
	    if (round % 2 == 0) { // Vez do Jogador 2
	        if (ataq2 < defe1) {
	            defe1 -= ataq2;
	        } else {
	            resto = ataq2 - defe1;
	            vida1S -= resto;
	        }
	    } else { // Vez do Jogador 1
	        if (ataq1 < defe2) {
	            defe2 -= ataq1;
	        } else {
	            resto = ataq1 - defe2;
	            vida2S -= resto;
	        }
	    }
	    
	    J1.setVida(vida1S);
	    J1.setDef(defe1);
	    J2.setVida(vida2S);
	    J2.setDef(defe2);
	    
	    if (vida1S <= 0) {
	        textField.setText("Parabéns Jogador 2! Você venceu!");
	        textField.setVisible(true);
	        proximo.setEnabled(false);
	    } else if (vida2S <= 0) {
	        textField.setText("Parabéns Jogador 1! Você venceu!");
	        textField.setVisible(true);
	        proximo.setEnabled(false);
	    }
	}
}
