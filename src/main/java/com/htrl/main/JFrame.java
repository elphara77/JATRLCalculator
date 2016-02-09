package com.htrl.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrame extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTextArea textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
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
	public JFrame() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextArea();
		textField.setRows(2);
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton btn7 = new JButton("7");
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		panel.add(btn8);
		
		JButton btnNewButton_7 = new JButton("9");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("+");
		panel.add(btnNewButton_8);
		
		JButton btn4 = new JButton("4");
		panel.add(btn4);
		
		JButton btnNewButton_10 = new JButton("5");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_3 = new JButton("6");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton("-");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_6);
		
		JButton btn1 = new JButton("1");
		panel.add(btn1);
		
		JButton btnNewButton_9 = new JButton("2");
		panel.add(btnNewButton_9);
		
		JButton btnNewButton = new JButton("3");
		panel.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("/");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_4);
		
		JButton btn0 = new JButton("0");
		panel.add(btn0);
		
		JButton btnNewButton_13 = new JButton(".");
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("Enter");
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("X");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_15);
	}

}
