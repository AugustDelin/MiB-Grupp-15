/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.grupp.pkg15;

import oru.inf.InfDB;

/**
 *
 * @author erike
 */
//Fälten för AlienStartSkärm.
public class AlienStartSkärm extends javax.swing.JFrame {

    private String användarnamn;

    /**
     * Konstruktorn för AlienStartSkärm.
     */
    public AlienStartSkärm(String användarnamn) {
        initComponents();
        this.användarnamn = användarnamn;
        FyllText.välkomstLabel(lblRubrik, användarnamn);
        AlienMetoder.visaMinOC(lblMinOc, användarnamn);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        lblMinOc = new javax.swing.JLabel();
        btnMinSida = new javax.swing.JButton();
        btnLoggaUt = new javax.swing.JButton();
        btnAvsluta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRubrik.setText("Välkommen");

        lblMinOc.setText("Min områdeschef är:");

        btnMinSida.setText("Min Sida");
        btnMinSida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinSidaActionPerformed(evt);
            }
        });

        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        btnAvsluta.setText("Avsluta program");
        btnAvsluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvslutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMinSida)
                            .addComponent(lblMinOc))
                        .addContainerGap(270, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRubrik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLoggaUt))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAvsluta))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblRubrik))
                    .addComponent(btnLoggaUt))
                .addGap(18, 18, 18)
                .addComponent(lblMinOc)
                .addGap(18, 18, 18)
                .addComponent(btnMinSida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(btnAvsluta))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Knappen för att öppna ett nytt fönster med klassen AlienMinSida.
    private void btnMinSidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinSidaActionPerformed
        new AlienMinSida(användarnamn).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMinSidaActionPerformed
    // Knappen för att starta metoden Logga ut.
    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        Navigera.openStartSkärm();
        dispose();
    }//GEN-LAST:event_btnLoggaUtActionPerformed
    // Knappen för att starta metoden Avsluta program.
    private void btnAvslutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvslutaActionPerformed
        Navigera.avslutaProgram();
    }//GEN-LAST:event_btnAvslutaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvsluta;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnMinSida;
    private javax.swing.JLabel lblMinOc;
    private javax.swing.JLabel lblRubrik;
    // End of variables declaration//GEN-END:variables
}
