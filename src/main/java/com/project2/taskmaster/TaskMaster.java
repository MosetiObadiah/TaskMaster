/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.project2.taskmaster;

import javax.swing.UIManager;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author user85
 */
public class TaskMaster {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (NullPointerException | SecurityException e) {
            System.out.println(e.getMessage());
        }
         /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
    }
}
