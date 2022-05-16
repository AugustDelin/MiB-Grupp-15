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
//   Fälten för AgentStartSkärm.
public class AgentStartSkärm extends javax.swing.JFrame {

    private String användarnamn;

    /**
     * Konstruktorn för AgentStartSkärm.
     */
    public AgentStartSkärm(String användarnamn) {
        initComponents();
        this.användarnamn = användarnamn;
        FyllText.välkomstLabel(lblRubrik, användarnamn);
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
        btnMinSida = new javax.swing.JButton();
        btnVisaOC = new javax.swing.JButton();
        btnAlienInfo = new javax.swing.JButton();
        btnAgentUtrustning = new javax.swing.JButton();
        lblLoggaut = new javax.swing.JButton();
        lblAvsluta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRubrik.setText("jLabel1");

        btnMinSida.setText("Min Sida");
        btnMinSida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinSidaActionPerformed(evt);
            }
        });

        btnVisaOC.setText("Områdeschefer");
        btnVisaOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaOCActionPerformed(evt);
            }
        });

        btnAlienInfo.setText("Alien Info");
        btnAlienInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlienInfoActionPerformed(evt);
            }
        });

        btnAgentUtrustning.setText("Utrustning");
        btnAgentUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgentUtrustningActionPerformed(evt);
            }
        });

        lblLoggaut.setText("Logga ut");
        lblLoggaut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblLoggautActionPerformed(evt);
            }
        });

        lblAvsluta.setText("Avsluta program");
        lblAvsluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAvslutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAlienInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinSida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVisaOC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgentUtrustning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLoggaut))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAvsluta))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoggaut)
                    .addComponent(lblRubrik))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlienInfo)
                    .addComponent(btnVisaOC))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinSida)
                    .addComponent(btnAgentUtrustning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(lblAvsluta))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Knappen för att logga in på Min Sida.
    private void btnMinSidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinSidaActionPerformed
        Navigera.openAgentMinSida(användarnamn);
    }//GEN-LAST:event_btnMinSidaActionPerformed
    // Knappen för att starta metoden Avsluta program.
    private void lblAvslutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAvslutaActionPerformed
        Navigera.avslutaProgram();
    }//GEN-LAST:event_lblAvslutaActionPerformed
    // Knappen för att starta metoden Logga ut.
    private void lblLoggautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblLoggautActionPerformed
        Navigera.openStartSkärm();
        dispose();
    }//GEN-LAST:event_lblLoggautActionPerformed
    // Knappen för att starta metoden AgentAlienInfo.
    private void btnAlienInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlienInfoActionPerformed
        new AgentAlienInfo(användarnamn).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAlienInfoActionPerformed

    private void btnAgentUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgentUtrustningActionPerformed
        new AgentUtrustning(användarnamn).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgentUtrustningActionPerformed

    private void btnVisaOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaOCActionPerformed
       new AgentOCinfo(användarnamn).setVisible(true);
       dispose();
    }//GEN-LAST:event_btnVisaOCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgentUtrustning;
    private javax.swing.JButton btnAlienInfo;
    private javax.swing.JButton btnMinSida;
    private javax.swing.JButton btnVisaOC;
    private javax.swing.JButton lblAvsluta;
    private javax.swing.JButton lblLoggaut;
    private javax.swing.JLabel lblRubrik;
    // End of variables declaration//GEN-END:variables
}
