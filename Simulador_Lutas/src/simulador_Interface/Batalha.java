package simulador_Interface;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
import simulador_Interface.Criacao_Personagem;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import modelos.Jogador_Model;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JList;

public class Batalha extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane, panel;
	private Criacao_Personagem person;
	private Random rand = new Random();
	private int roundLucky=rand.nextInt(6)+1, playerLucky=rand.nextInt(2)+1, round;
	private int attk1S,attk2S,def1S,def2S,vida1S,vida2S,mana1S,mana2S;
	private JTextField textField;
	private JButton proximo;
	private JProgressBar vidaBar1, vidaBar2, manaBar1, manaBar2;
	private Jogador_Model J1, J2;
	
	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Batalha(Criacao_Personagem person) {
		this.person=person;
		initComponents();
		round = 0;
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
	        vidaBar1.setBounds(10, 189, 150, 30);
	        contentPane.add(vidaBar1);

	        vidaBar2 = new JProgressBar();
	        vidaBar2.setMaximum(100);
	        vidaBar2.setValue(vida2S);
	        vidaBar2.setStringPainted(true);
	        vidaBar2.setBounds(376, 189, 150, 30);
	        contentPane.add(vidaBar2);
	        
	        manaBar1 = new JProgressBar();
	        manaBar1.setMaximum(100);
	        manaBar1.setValue(mana1S);
	        manaBar1.setStringPainted(true);
	        manaBar1.setBounds(10, 256, 150, 30);
	        contentPane.add(manaBar1);

	        manaBar2 = new JProgressBar();
	        manaBar2.setMaximum(100);
	        manaBar2.setValue(mana2S);
	        manaBar2.setStringPainted(true);
	        manaBar2.setBounds(376, 256, 150, 30);
	        contentPane.add(manaBar2);
	 	    
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
	 	    vida1.setBounds(24, 164, 46, 14);
	 	    contentPane.add(vida1);
	 	    
	 	    JLabel vida2 = new JLabel("VIDA");
	 	    vida2.setBounds(408, 164, 46, 14);
	 	    contentPane.add(vida2);
	 	    
	 	    JLabel manaC1 = new JLabel("MANA");
	 	    manaC1.setBounds(24, 234, 46, 14);
	 	    contentPane.add(manaC1);
	 	    
	 	    JLabel manaC2 = new JLabel("MANA");
	 	    manaC2.setBounds(408, 234, 46, 14);
	 	    contentPane.add(manaC2);
	 	    
	 	    JList list = new JList();
	 	    list.setBounds(10, 297, 76, 53);
	 	    contentPane.add(list);
	 	    proximo.setVisible(false);
	 	    panel.setVisible(false);
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
		defesa1.setBounds(24, 120, 62, 20);
		contentPane.add(defesa1);
		
		JLabel ataque2 = new JLabel("ATAQUE");
		ataque2.setBounds(409, 47, 74, 20);
		contentPane.add(ataque2);
		
		JLabel defesa2 = new JLabel("DEFESA");
		defesa2.setBounds(409, 120, 62, 20);
		contentPane.add(defesa2);
		
		JButton comecar = new JButton("COMEÇAR");
		comecar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comecar.setVisible(false);
				proximo.setVisible(true);
				panel.setVisible(true);
				initBatalha();
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
		def1.setBounds(24, 139, 46, 14);
		contentPane.add(def1);
		
		JLabel def2 = new JLabel(String.valueOf(def2S));
		def2.setBounds(408, 139, 46, 14);
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
	
	public void initBatalha() {
		attk1S=person.getAttk1();attk2S=person.getAttk2();def1S=person.getDef1();def2S=person.getDef2();vida1S=person.getVida1();vida2S=person.getVida2();
		mana1S=person.getMana1();mana2S=person.getMana2();
		J1 = new Jogador_Model(attk1S,def1S,vida1S,mana1S);
		J2 = new Jogador_Model(attk2S,def2S,vida2S,mana2S);
	}
	private void simularBatalha() {
        int ataq1 = attk1S, ataq2 = attk2S, defe1 = def1S, defe2 = def2S, resto;

        if (round % 2 == 0) { // vez do Jogador 2
            if (ataq2 < defe1) {
                defe1 -= ataq2;
            } else {
                resto = ataq2 - defe1;
                vida1S -= resto;
            }
        } else { // vez do Jogador 1
            if (ataq1 < defe2) {
                defe2 -= ataq1;
            } else {
                resto = ataq1 - defe2;
                vida2S -= resto;
            }
        }

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
