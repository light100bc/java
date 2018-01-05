package card21Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;


public class CardTable extends JFrame {
	
	private JPanel contentPane;
	static JLabel l2;
	
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					CardTable frame = new CardTable();
					//frame.getContentPane().add(l2,BorderLayout.CENTER);
					  frame.pack();
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
	
	public CardTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		l2 = new JLabel(" ",JLabel.CENTER);
		JButton btnNewButton = new JButton("New buttonxxx");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				l2.setText("欢迎进入Java世界。");
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				l2.setText("欢迎进入Java世界2。");
			}
		});
		contentPane.setLayout(new MigLayout("", "[174px][215px]", "[193px]"));
		contentPane.add(btnNewButton_1, "cell 0 0,grow");
		contentPane.add(btnNewButton, "cell 1 0,alignx left,aligny bottom");
		contentPane.add(l2, "cell 1 0,alignx left,aligny bottom");
	}




}