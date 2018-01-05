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
   l1 = new JLabel("这是一个演示按钮动作的程序",JLabel.CENTER);
   l2 = new JLabel(" ",JLabel.CENTER);
   b1 = new JButton("欢迎[w]");
   b1.setMnemonic(KeyEvent.VK_W);// 设置按钮的快捷键
   b1.setActionCommand("welcome");
   b2 = new JButton("日期[d]");
   b2.setMnemonic(KeyEvent.VK_D);// 设置快捷字符为D
   b2.setActionCommand("date");
   b3 = new JButton("退出[q]");
   b3.setMnemonic(KeyEvent.VK_Q);// 设置快捷字符为Q
   b3.setActionCommand("quit");
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   add(b1);add(b2);add(b3);
  }
  public void actionPerformed(ActionEvent e){
    Calendar c1 = Calendar.getInstance();
    if(e.getActionCommand().equals("welcome"))
       l2.setText("欢迎进入Java世界。");
    else if(e.getActionCommand().equals("date"))
       l2.setText("今天是"+c1.get(Calendar.YEAR)+
           "年"+(c1.get(Calendar.MONTH)+1)+
           "月" + c1.get(Calendar.DATE) + "日");
    else System.exit(0);
    l2.setHorizontalAlignment(JLabel.CENTER);
    // 标签文字水平居中
 }
public static void main(String args[]){
    JFrame frame=new JFrame("使用JButton");
    frame.getContentPane().add(new yyy(),BorderLayout.SOUTH);
    frame.getContentPane().add(l1,BorderLayout.NORTH);
    frame.getContentPane().add(l2,BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
