package card21Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class yyy extends JPanel implements ActionListener{
   JButton b1,b2,b3;
   static JLabel l1,l2;
   yyy(){
   l1 = new JLabel("����һ����ʾ��ť�����ĳ���",JLabel.CENTER);
   l2 = new JLabel(" ",JLabel.CENTER);
   b1 = new JButton("��ӭ[w]");
   b1.setMnemonic(KeyEvent.VK_W);// ���ð�ť�Ŀ�ݼ�
   b1.setActionCommand("welcome");
   b2 = new JButton("����[d]");
   b2.setMnemonic(KeyEvent.VK_D);// ���ÿ���ַ�ΪD
   b2.setActionCommand("date");
   b3 = new JButton("�˳�[q]");
   b3.setMnemonic(KeyEvent.VK_Q);// ���ÿ���ַ�ΪQ
   b3.setActionCommand("quit");
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   add(b1);add(b2);add(b3);
  }
  public void actionPerformed(ActionEvent e){
    Calendar c1 = Calendar.getInstance();
    if(e.getActionCommand().equals("welcome"))
       l2.setText("��ӭ����Java���硣");
    else if(e.getActionCommand().equals("date"))
       l2.setText("������"+c1.get(Calendar.YEAR)+
           "��"+(c1.get(Calendar.MONTH)+1)+
           "��" + c1.get(Calendar.DATE) + "��");
    else System.exit(0);
    l2.setHorizontalAlignment(JLabel.CENTER);
    // ��ǩ����ˮƽ����
 }
public static void main(String args[]){
    JFrame frame=new JFrame("ʹ��JButton");
    frame.getContentPane().add(new yyy(),BorderLayout.SOUTH);
    frame.getContentPane().add(l1,BorderLayout.NORTH);
    frame.getContentPane().add(l2,BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
