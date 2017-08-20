package br.com.so.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.Label;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame{
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		}catch (Exception e) {
			System.err.println("Erro no NIMBUS");
		}
		new Frame();
	}
	
	public Frame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Aspirador de p\u00F3 V1.0");
		setSize(800, 630);
		getContentPane().setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		
		JPanel pContent = new JPanel();
		pContent.setBackground(Color.BLACK);
		pContent.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(pContent);
		pContent.setLayout(null);
		
		JPanel panel = new PainelSala();
		pContent.add(panel);
		
		JButton btnLigar = new JButton("Ligar");
		btnLigar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnLigar.getText().equals("Ligar")) {
					btnLigar.setText("Desligar");
				}else {
					btnLigar.setText("Ligar");
				}
				Frame.this.repaint();
			}
		});
		btnLigar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnLigar.setBounds(575, 530, 200, 40);
		pContent.add(btnLigar);
		
		
		
		this.setVisible(true);
	}
}
