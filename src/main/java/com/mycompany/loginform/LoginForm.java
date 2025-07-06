/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.loginform;

import com.mycompany.loginform.Codes.login;
import javax.swing.SwingUtilities;

/**
 *
 * @author borag
 */
public class LoginForm {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new login();
            }
        });  
        
    }
}
