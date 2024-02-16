/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project2.taskmaster;

import javax.swing.*;

/**
 *
 * @author user85
 */
public class MainFrame extends javax.swing.JFrame {

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        switchPanel(new Login(this));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TaskMaster");
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(750, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 826, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void switchPanel(JPanel panel) {
        getContentPane().removeAll();
        getContentPane().setLayout(new GroupLayout(getContentPane()));

        // horizontal group for the layout
        GroupLayout.SequentialGroup hGroup = ((GroupLayout) getContentPane().getLayout()).createSequentialGroup();
        hGroup.addContainerGap();
        hGroup.addComponent(panel);
        hGroup.addContainerGap();
        ((GroupLayout) getContentPane().getLayout()).setHorizontalGroup(hGroup);

        // vertical group for the layout
        GroupLayout.SequentialGroup vGroup = ((GroupLayout) getContentPane().getLayout()).createSequentialGroup();
        vGroup.addContainerGap();
        vGroup.addComponent(panel);
        vGroup.addContainerGap();
        ((GroupLayout) getContentPane().getLayout()).setVerticalGroup(vGroup);

        // Update the layout
        layout.linkSize(SwingConstants.HORIZONTAL, panel);
        layout.linkSize(SwingConstants.VERTICAL, panel);

        // Repaint the panel
        getContentPane().revalidate();
        getContentPane().repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
