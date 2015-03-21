package com.jti.phase_1;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

//import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
//import org.jdesktop.swingx.combobox.*;

public class UI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		QueryDb.populateItemNames();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("JumpToIt!!");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ActionListener actionListenerComboBox = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
								
			}
			
		};
		
		JComboBox comboBox = new JComboBox(new Object[] { "Ester", "Jordi",
		        "Jordina", "Jorge", "Sergi" });
		comboBox.setForeground(UIManager.getColor("controlText"));
		comboBox.setBackground(UIManager.getColor("menuPressedItemF"));
		comboBox.setFont(new Font("HP Simplified", Font.PLAIN, 14));
		//AutoCompleteDecorator.decorate(comboBox);
		comboBox.addActionListener(actionListenerComboBox);
		comboBox.setBounds(122, 41, 652, 30);
		frame.getContentPane().add(comboBox);
		
		JLabel lblSearchForA = new JLabel("Search for a link : ");
		lblSearchForA.setForeground(SystemColor.textHighlight);
		lblSearchForA.setFont(new Font("HP Simplified", Font.BOLD, 14));
		lblSearchForA.setBounds(10, 44, 107, 20);
		frame.getContentPane().add(lblSearchForA);
		
		textField = new JTextField();
		textField.setBackground(UIManager.getColor("inactiveCaption"));
		textField.setEditable(false);
		textField.setBounds(120, 117, 654, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblYourLink = new JLabel("Your link :");
		lblYourLink.setForeground(SystemColor.textHighlight);
		lblYourLink.setFont(new Font("HP Simplified", Font.BOLD, 14));
		lblYourLink.setBounds(10, 125, 95, 14);
		frame.getContentPane().add(lblYourLink);
		
		JButton btnCopyToClipboard = new JButton("Copy To Clipboard");
		btnCopyToClipboard.setToolTipText("Click to copy the link to clipboard");
		btnCopyToClipboard.setBackground(SystemColor.textHighlight);
		btnCopyToClipboard.setForeground(SystemColor.textHighlightText);
		btnCopyToClipboard.setFont(new Font("HP Simplified", Font.BOLD, 15));
		btnCopyToClipboard.setBounds(446, 268, 200, 50);
		frame.getContentPane().add(btnCopyToClipboard);
		
		JButton btnAccessTheLink = new JButton("Jump To It!!");
		btnAccessTheLink.setToolTipText("Click to access the link");
		btnAccessTheLink.setBackground(SystemColor.textHighlight);
		btnAccessTheLink.setForeground(SystemColor.textHighlightText);
		btnAccessTheLink.setFont(new Font("HP Simplified", Font.BOLD, 15));
		btnAccessTheLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAccessTheLink.setBounds(174, 268, 200, 50);
		frame.getContentPane().add(btnAccessTheLink);
		
		
	}
}
