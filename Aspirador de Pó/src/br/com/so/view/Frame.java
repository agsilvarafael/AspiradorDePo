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
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.JRadioButton;

public class Frame extends JFrame{
	
	public static void main(String[] args) {
		new Frame();
	}
	
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Aspirador de p\u00F3 V1.0");
		setSize(800, 630);
		getContentPane().setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		setResizable(false);
		
		JPanel pContent = new JPanel();
		pContent.setBackground(Color.WHITE);
		pContent.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(pContent);
		pContent.setLayout(null);
		
		JPanel panel = new PainelSala();
		panel.setLocation(0, 0);;
		pContent.add(panel);
		
		
		
		this.setVisible(true);
	}
}
