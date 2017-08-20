package br.com.so.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import br.com.so.model.Aspirador;
import br.com.so.model.Sujeira;

public class PainelSala extends JPanel{

	private JLabel lCronometro;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;
	private JPanel panel7;
	private JPanel panel8;
	private JPanel panel9;
	private JPanel panel10;
	private JPanel panel11;
	private JPanel panel12;
	private JPanel panel13;
	private JPanel panel14;
	private JPanel panel15;
	private JPanel panel16;
	private JPanel pBase;
	
	public PainelSala() {
		setBackground(Color.WHITE);
		setSize(550, 600);
		setLayout(null);
		LineBorder borda = new LineBorder(new Color(0, 0, 0));
		
		panel1 = new JPanel();
		panel1.setToolTipText("1");
		panel1.setBounds(25, 150, 100, 100);
		add(panel1);
		
		panel2 = new JPanel();
		panel2.setToolTipText("2");
		panel2.setBounds(125, 150, 100, 100);
		add(panel2);
		
		panel3 = new JPanel();
		panel3.setToolTipText("3");
		panel3.setBounds(225, 150, 100, 100);
		add(panel3);
		
		panel4 = new JPanel();
		panel4.setToolTipText("4");
		panel4.setBounds(325, 150, 100, 100);
		add(panel4);
		
		panel8 = new JPanel();
		panel8.setToolTipText("8");
		panel8.setBounds(325, 250, 100, 100);
		add(panel8);
		
		panel5 = new JPanel();
		panel5.setToolTipText("5");
		panel5.setBounds(25, 250, 100, 100);
		add(panel5);
		
		panel7 = new JPanel();
		panel7.setToolTipText("7");
		panel7.setBounds(225, 250, 100, 100);
		add(panel7);
		
		panel6 = new JPanel();
		panel6.setToolTipText("6");
		panel6.setBounds(125, 250, 100, 100);
		add(panel6);
		
		panel12 = new JPanel();
		panel12.setToolTipText("12");
		panel12.setBounds(325, 350, 100, 100);
		add(panel12);
		
		panel9 = new JPanel();
		panel9.setToolTipText("9");
		panel9.setBounds(25, 350, 100, 100);
		add(panel9);
		
		panel11 = new JPanel();
		panel11.setToolTipText("11");
		panel11.setBounds(225, 350, 100, 100);
		add(panel11);
		
		panel10 = new JPanel();
		panel10.setToolTipText("10");
		panel10.setBounds(125, 350, 100, 100);
		add(panel10);
		
		panel16 = new JPanel();
		panel16.setToolTipText("16");
		panel16.setBounds(325, 450, 100, 100);
		add(panel16);
		
		panel13 = new JPanel();
		panel13.setToolTipText("13");
		panel13.setBounds(25, 450, 100, 100);
		add(panel13);
		
		panel15 = new JPanel();
		panel15.setToolTipText("15");
		panel15.setBounds(225, 450, 100, 100);
		add(panel15);
		
		panel14 = new JPanel();
		panel14.setToolTipText("14");
		panel14.setBounds(125, 450, 100, 100);
		add(panel14);

		panel1.setBorder(borda);
		panel2.setBorder(borda);
		panel3.setBorder(borda);
		panel4.setBorder(borda);
		panel5.setBorder(borda);
		panel6.setBorder(borda);
		panel7.setBorder(borda);
		panel8.setBorder(borda);
		panel9.setBorder(borda);
		panel10.setBorder(borda);
		panel11.setBorder(borda);
		panel12.setBorder(borda);
		panel13.setBorder(borda);
		panel14.setBorder(borda);
		panel15.setBorder(borda);
		panel16.setBorder(borda);
		
		pBase = new JPanel();
		pBase.setToolTipText("Base");
		pBase.setBackground(Color.LIGHT_GRAY);
		pBase.setBorder(borda);
		pBase.setBounds(425, 450, 100, 100);
		add(pBase);
		
		JLabel lblAspirador = new JLabel();
		pBase.add(lblAspirador);
		lblAspirador.setIcon(new ImageIcon((new ImageIcon(PainelSala.class.getResource("/br/com/so/img/aspirador.png"))).getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT)));
		
		lCronometro = new JLabel("00:00:0000");
		lCronometro.setHorizontalAlignment(SwingConstants.CENTER);
		lCronometro.setFont(new Font("Arial", Font.PLAIN, 50));
		lCronometro.setBounds(25, 35, 500, 75);
		add(lCronometro);
		panel1.setLayout(null);
	}
}
