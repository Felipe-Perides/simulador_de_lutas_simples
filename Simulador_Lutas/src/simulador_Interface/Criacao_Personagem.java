package simulador_Interface;

import java.awt.EventQueue;
import simulador_Interface.Tela_Inicial;
import simulador_Interface.Batalha;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelos.Jogador_Model;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Criacao_Personagem extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int attk1S,attk2S,def1S,def2S,vida1S,vida2S,pL1S,pL2S, mana1S, mana2S;
	private JLabel jogador1, jogador2, attk1C, attk2C, def1C, def2C, vida1C, vida2C;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Criacao_Personagem frame = new Criacao_Personagem();
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
	
	
	public Criacao_Personagem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		attk1S=0;attk2S=0;def1S=0;def2S=0;vida1S=100;vida2S=100;pL1S=10;pL2S=10;mana1S=100;mana2S=100;
		
		jogador1 = new JLabel("JOGADOR 1");
		jogador1.setBounds(26, 40, 69, 14);
		contentPane.add(jogador1);
		
		jogador2 = new JLabel("JOGADOR 2");
		jogador2.setBounds(451, 40, 69, 14);
		contentPane.add(jogador2);
		
		JLabel attk1 = new JLabel("ATAQUE");
		attk1.setBounds(26, 77, 69, 14);
		contentPane.add(attk1);
		
		JLabel attk2 = new JLabel("ATAQUE");
		attk2.setBounds(451, 77, 69, 14);
		contentPane.add(attk2);
		
		JLabel def1 = new JLabel("DEFESA");
		def1.setBounds(26, 136, 61, 14);
		contentPane.add(def1);
		
		JLabel def2 = new JLabel("DEFESA");
		def2.setBounds(450, 136, 70, 14);
		contentPane.add(def2);
		
		JLabel vida1 = new JLabel("VIDA");
		vida1.setBounds(26, 193, 46, 14);
		contentPane.add(vida1);
		
		JLabel vida2 = new JLabel("VIDA");
		vida2.setBounds(451, 193, 46, 14);
		contentPane.add(vida2);
		
		def1C = new JLabel(String.valueOf(def1S));
		def1C.setBounds(26, 154, 46, 14);
		contentPane.add(def1C);
		
		vida1C = new JLabel(String.valueOf(vida1S));
		vida1C.setBounds(26, 211, 46, 14);
		contentPane.add(vida1C);
		
		attk1C = new JLabel(String.valueOf(attk1S));
		attk1C.setBounds(26, 95, 46, 14);
		contentPane.add(attk1C);
		
		attk2C = new JLabel(String.valueOf(attk2S));
		attk2C.setBounds(451, 95, 46, 14);
		contentPane.add(attk2C);
		
		def2C = new JLabel(String.valueOf(def2S));
		def2C.setBounds(451, 154, 46, 14);
		contentPane.add(def2C);
		
		vida2C = new JLabel(String.valueOf(vida2S));
		vida2C.setBounds(451, 211, 46, 14);
		contentPane.add(vida2C);
		
		JLabel pontosLivres1 = new JLabel("PONTOS LIVRES");
		pontosLivres1.setBounds(26, 300, 114, 14);
		contentPane.add(pontosLivres1);
		
		JLabel pontosLivres2 = new JLabel("PONTOS LIVRES");
		pontosLivres2.setBounds(424, 300, 96, 14);
		contentPane.add(pontosLivres2);
		
		JLabel pontosLivres1C = new JLabel(String.valueOf(pL1S));
		pontosLivres1C.setBounds(26, 316, 46, 14);
		contentPane.add(pontosLivres1C);
		
		JLabel pontosLivres2C = new JLabel(String.valueOf(pL2S));
		pontosLivres2C.setBounds(424, 316, 46, 14);
		contentPane.add(pontosLivres2C);
		
		JButton mais1 = new JButton("+");
		mais1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (pL1S > 0) {
		            attk1S++;
		            pL1S--;
		            attk1C.setText(String.valueOf(attk1S));
		            pontosLivres1C.setText(String.valueOf(pL1S));
		            contentPane.revalidate();
                    contentPane.repaint();
		        }
		    }
		});
		mais1.setBounds(94, 91, 46, 23);
		contentPane.add(mais1);

		JButton menos1 = new JButton("-");
		menos1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (attk1S > 0) {
		            attk1S--;
		            pL1S++;
		            attk1C.setText(String.valueOf(attk1S));
		            pontosLivres1C.setText(String.valueOf(pL1S));
		            contentPane.revalidate();
                    contentPane.repaint();
		        }
		    }
		});
		menos1.setBounds(139, 91, 46, 23);
		contentPane.add(menos1);

		JButton mais3 = new JButton("+");
		mais3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (pL1S > 0) {
		            def1S++;
		            pL1S--;
		            def1C.setText(String.valueOf(def1S));
		            pontosLivres1C.setText(String.valueOf(pL1S));
		            contentPane.revalidate();
                    contentPane.repaint();
		        }
		    }
		});
		mais3.setBounds(94, 150, 46, 23);
		contentPane.add(mais3);

		JButton mais2 = new JButton("+");
		mais2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (pL2S > 0) {
		            attk2S++;
		            pL2S--;
		            attk2C.setText(String.valueOf(attk2S));
		            pontosLivres2C.setText(String.valueOf(pL2S));
		            contentPane.revalidate();
                    contentPane.repaint();
		        }
		    }
		});
		mais2.setBounds(394, 91, 46, 23);
		contentPane.add(mais2);

		JButton mais4 = new JButton("+");
		mais4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (pL2S > 0) {
		            def2S++;
		            pL2S--;
		            def2C.setText(String.valueOf(def2S));
		            pontosLivres2C.setText(String.valueOf(pL2S));
		            contentPane.revalidate();
                    contentPane.repaint();
		        }
		    }
		});
		mais4.setBounds(394, 150, 46, 23);
		contentPane.add(mais4);

		JButton menos2 = new JButton("-");
		menos2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (def1S > 0) {
		            def1S--;
		            pL1S++;
		            def1C.setText(String.valueOf(def1S));
		            pontosLivres1C.setText(String.valueOf(pL1S));
		            contentPane.revalidate();
                    contentPane.repaint();
		        }
		    }
		});
		menos2.setBounds(139, 150, 46, 23);
		contentPane.add(menos2);

		JButton menos3 = new JButton("-");
		menos3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (attk2S > 0) {
		            attk2S--;
		            pL2S++;
		            attk2C.setText(String.valueOf(attk2S));
		            pontosLivres2C.setText(String.valueOf(pL2S));
		            contentPane.revalidate();
                    contentPane.repaint();
		        }
		    }
		});
		menos3.setBounds(349, 91, 46, 23);
		contentPane.add(menos3);

		JButton menos4 = new JButton("-");
		menos4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (def2S > 0) {
		            def2S--;
		            pL2S++;
		            def2C.setText(String.valueOf(def2S));
		            pontosLivres2C.setText(String.valueOf(pL2S));
		            contentPane.revalidate();
                    contentPane.repaint();
		        }
		    }
		});
		menos4.setBounds(348, 150, 46, 23);
		contentPane.add(menos4);
		
		JButton avancar = new JButton("INICIAR BATALHA");
		avancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Batalha telaAvancar = new Batalha(Criacao_Personagem.this);
				telaAvancar.setVisible(true);
				Tela_Inicial telaMain = new Tela_Inicial();
				telaMain.setVisible(false);
			}
		});
		avancar.setBounds(208, 278, 140, 23);
		contentPane.add(avancar);
		
		JButton voltar = new JButton("VOLTAR");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Inicial telaInicial = new Tela_Inicial();
				telaInicial.setVisible(true);
			}
		});
		voltar.setBounds(208, 312, 140, 23);
		contentPane.add(voltar);
		
		JLabel mana1 = new JLabel("MANA");
		mana1.setBounds(26, 247, 46, 14);
		contentPane.add(mana1);
		
		JLabel mana2 = new JLabel("MANA");
		mana2.setBounds(451, 247, 46, 14);
		contentPane.add(mana2);
		
		JLabel manaC1 = new JLabel("100");
		manaC1.setBounds(26, 261, 46, 14);
		contentPane.add(manaC1);
		
		JLabel manaC2 = new JLabel("100");
		manaC2.setBounds(451, 261, 46, 14);
		contentPane.add(manaC2);
		
	}
	public int getAttk1() {
		return attk1S;
	}
	public int getDef1() {
		return def1S;
	}
	public int getAttk2() {
		return attk2S;
	}
	public int getDef2() {
		return def2S;
	}
	public int getVida1() {
		return vida1S;
	}
	public int getVida2() {
		return vida2S;
	}
	public int getMana1() {
		return mana1S;
	}
	public int getMana2() {
		return mana2S;
	}
}
