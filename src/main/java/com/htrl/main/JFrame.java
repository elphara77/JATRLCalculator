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
		
		ActionListener btnListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = ((JButton)e.getSource()).getText();
				String old = textField.getText();
				textField.setText(old+name);
			}
		};
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(btnListener);
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(btnListener);
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(btnListener);
		panel.add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(btnListener);
		panel.add(btnPlus);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(btnListener);
		panel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(btnListener);
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(btnListener);
		panel.add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(btnListener);
		panel.add(btnMinus);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(btnListener);
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(btnListener);
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(btnListener);
		panel.add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(btnListener);
		panel.add(btnDiv);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(btnListener);
		panel.add(btn0);
		
		JButton btnDot = new JButton(".");
		panel.add(btnDot);
		
		JButton btnEnter = new JButton("Enter");
		panel.add(btnEnter);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnX);
	}

}
