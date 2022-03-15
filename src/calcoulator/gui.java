/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcoulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Double.parseDouble;
import javax.swing.*;

/**
 *
 * @author Ahmed Abdelnaser
 */
public class gui extends JFrame implements ActionListener{

    JButton b1 = new JButton(" 7 ");
    JButton b2 = new JButton(" 8 ");
    JButton b3 = new JButton(" 9 ");
    JButton b4 = new JButton(" 4 " );
    JButton b5 = new JButton(" 5 ");
    JButton b6 = new JButton(" 6 ");
    JButton b7 = new JButton(" 1 " );
    JButton b8 = new JButton(" 2 ");
    JButton b9 = new JButton(" 3 ");
    JButton b11 = new JButton(" 0 ");
    JButton b12 = new JButton(" . ");
    JButton b13 = new JButton(" C ");
    JButton b14 = new JButton(" = ");
    JButton b15 = new JButton(" + ");
    JButton b16 = new JButton(" - ");
    JButton b17 = new JButton(" * ");
    JButton b18 = new JButton("\uF0E7");
    JButton b19 = new JButton(" / ");
    JButton b22 = new JButton(" % ");
    JButton b23 = new JButton(" \u221A");
    JTextField t=new JTextField();
    JPanel p = new JPanel();
    double FirstPram=0;
    double SecondPram=0;
    double result=0;
    String operation,ans;
    public double convert(String n){
        return parseDouble(n);
    }
    

    public gui() {
        p.setBackground(Color.LIGHT_GRAY);
        this.setLayout(null);
        this.setTitle("Ahmed");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(580,650);
        p.setBounds(0, 0, 580,170);
        p.setLayout(null);
        t.setBounds(0, 0, 580, 170);
        p.add(t);
        b1.setBounds(10, 180, 100, 100);
        b2.setBounds(120, 180, 100, 100);
        b3.setBounds(230, 180, 100, 100);
        b4.setBounds(10, 290, 100, 100);
        b5.setBounds(120, 290, 100, 100);
        b6.setBounds(230, 290, 100, 100);
        b7.setBounds(10, 400, 100,100);
        b8.setBounds(120, 400, 100, 100);
        b9.setBounds(230, 400, 100, 100);
        b11.setBounds(120, 510, 100, 100);
        b12.setBounds(10, 510, 100, 100);
        b13.setBounds(230, 510, 100, 100);
        b14.setBounds(340, 510, 100, 100);
        b15.setBounds(340, 400, 100, 100);
        b16.setBounds(340, 290, 100, 100);
        b17.setBounds(340, 180, 100, 100);
        b18.setBounds(450, 510, 100, 100);
        b19.setBounds(450, 400, 100, 100);
        b22.setBounds(450, 290, 100, 100);
        b23.setBounds(450, 180, 100, 100);
        b1.setBackground(Color.WHITE);
        b11.setBackground(Color.WHITE);
        b12.setBackground(Color.WHITE);
        b13.setBackground(Color.WHITE);
        b14.setBackground(Color.WHITE);
        b15.setBackground(Color.WHITE);
        b16.setBackground(Color.WHITE);
        b17.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);
        b5.setBackground(Color.WHITE);
        b6.setBackground(Color.WHITE);
        b7.setBackground(Color.WHITE);
        b8.setBackground(Color.WHITE);
        b9.setBackground(Color.WHITE);
        b18.setBackground(Color.WHITE);
        b19.setBackground(Color.WHITE);
        b22.setBackground(Color.WHITE);
        b23.setBackground(Color.WHITE);
        b1.setFont(new Font("LOL ",Font.BOLD,35));
        b2.setFont(new Font("LOL ",Font.BOLD,35));
        b3.setFont(new Font("LOL ",Font.BOLD,35));
        b4.setFont(new Font("LOL ",Font.BOLD,35));
        b5.setFont(new Font("LOL ",Font.BOLD,35));
        b6.setFont(new Font("LOL ",Font.BOLD,35));
        b7.setFont(new Font("LOL ",Font.BOLD,35));
        b8.setFont(new Font("LOL ",Font.BOLD,35));
        b9.setFont(new Font("LOL ",Font.BOLD,35));
        b11.setFont(new Font("LOL ",Font.BOLD,35));
        b12.setFont(new Font("LOL ",Font.BOLD,35));
        b13.setFont(new Font("LOL ",Font.BOLD,35));
        b14.setFont(new Font("LOL ",Font.BOLD,35));
        b15.setFont(new Font("LOL ",Font.BOLD,35));
        b16.setFont(new Font("LOL ",Font.BOLD,35));
        b17.setFont(new Font("LOL ",Font.BOLD,35));
        b18.setFont(new Font("LOL ",Font.BOLD,35));
        b19.setFont(new Font("LOL ",Font.BOLD,35));
        b22.setFont(new Font("LOL ",Font.BOLD,35));
        b23.setFont(new Font("LOL ",Font.BOLD,35));
        t.setFont(new Font("LOL ",Font.BOLD,45));
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(b11);
        this.add(b12);
        this.add(b13);
        this.add(b14);
        this.add(b15);
        this.add(b16);
        this.add(b17);
        this.add(b18);
        this.add(b19);
        this.add(b22);
        this.add(b23);
        this.add(p);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1)
            t.setText(t.getText()+ "7");
        if(ae.getSource() == b2)
            t.setText(t.getText()+ "8");
        if(ae.getSource() == b3)
            t.setText(t.getText()+ "9");
        if(ae.getSource() == b4)
            t.setText(t.getText()+ "4");
        if(ae.getSource() == b5)
            t.setText(t.getText()+ "5");
        if(ae.getSource() == b6)
            t.setText(t.getText()+ "6");
        if(ae.getSource() == b7)
            t.setText(t.getText()+ "1");
        if(ae.getSource() == b8)
            t.setText(t.getText()+ "2");
        if(ae.getSource() == b9)
            t.setText(t.getText()+ "3");
        if(ae.getSource() == b11)
            t.setText(t.getText()+ "0");
        if(ae.getSource() == b12)
            t.setText(t.getText()+ ".");
        if(ae.getSource() == b18)
            t.setText(t.getText().substring(0,t.getText().length()-1));
         if(ae.getSource() == b13)
            t.setText("");
        if(ae.getSource() == b15)
        {
            FirstPram=convert(t.getText());
            t.setText("");
            operation="+";
        }
        if(ae.getSource() == b16)
        {
            FirstPram=convert(t.getText());
            t.setText("");
            operation="-";
        }
        if(ae.getSource() == b17)
        {
            FirstPram=convert(t.getText());
            t.setText("");
            operation="*";
        }
        if(ae.getSource() == b19)
        {
            FirstPram=convert(t.getText());
            t.setText("");
            operation="/";
        }    
        if(ae.getSource() == b22)
        {
            FirstPram=convert(t.getText());
            t.setText("");
            operation="%";
        }    
        if(ae.getSource() == b23)
        {
            FirstPram=convert(t.getText());
            result=Math.sqrt(FirstPram);
            ans=Double.toString(result);
            t.setText(ans);
        }
        if(ae.getSource()==b14)
        {
            switch (operation){
                case "+":
                    SecondPram =convert(t.getText());
                    result=SecondPram+FirstPram;
                    ans = Double.toString(result);
                    t.setText(ans);
                    break;
                case "-":
                    SecondPram =convert(t.getText());
                    result=-SecondPram+FirstPram;
                    ans = Double.toString(result);
                    t.setText(ans);
                    break;
                case "*":
                    SecondPram =convert(t.getText());
                    result=SecondPram*FirstPram;
                    ans = Double.toString(result);
                    t.setText(ans);
                    break;
                case "/":
                    SecondPram =convert(t.getText());
                    result=FirstPram/SecondPram;
                    ans = Double.toString(result);
                    t.setText(ans);
                    break;
                case "%":
                    SecondPram =convert(t.getText());
                    result=FirstPram%SecondPram;
                    ans = Double.toString(result);
                    t.setText(ans);
                    break;
                default:
                   break; 
            }
                
                    
        }

    }

}
