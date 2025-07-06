/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginform.Codes;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author borag
 */
public class login extends JFrame {

    public login() {
        //instace
        JPanel jPanel = new JPanel();
        JTextField jTextField = new JTextField();
        JPasswordField jPasswordField = new JPasswordField();
        JLabel user = new JLabel("username:");
        JLabel pass = new JLabel("password");
        JButton jbutton = new JButton("Login");
        

        //window
        setVisible(true);
        setDefaultCloseOperation(3);
        setBounds(500, 250, 400, 250);

        //space panel
        setContentPane(jPanel);

        //layout
        setLayout(new GridLayout(3, 2));
        jPanel.add(user);
        jPanel.add(jTextField);
        jPanel.add(pass);
        jPanel.add(jPasswordField);
        jPanel.add(jbutton);
        jbutton.setForeground(Color.red);

    }
}
