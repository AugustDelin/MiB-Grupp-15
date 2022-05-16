/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.grupp.pkg15;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Linda
 */
// Fälten för Startskärm.
public class StartSkärm extends javax.swing.JFrame {

    private static InfDB idb;
    private AgentMetoder AgentM;
    private AlienMetoder AlienM;
    private AdminMetoder AdminM;

    /**
     * Konstruktorn för Startskärm
     */
    public StartSkärm() {
        initComponents();
        idb = Main.getDB();
        AgentM = new AgentMetoder(this);
        AlienM = new AlienMetoder(this);
        AdminM = new AdminMetoder(this);
        txtStartAnvändarnamn.setText("Agent O");
        pwfStartLogin.setText("planka");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoginAgent = new javax.swing.JButton();
        btnLoginAlien = new javax.swing.JButton();
        btnLoginAdmin = new javax.swing.JButton();
        lblStartRubrik = new javax.swing.JLabel();
        pwfStartLogin = new javax.swing.JPasswordField();
        txtStartAnvändarnamn = new javax.swing.JTextField();
        lblStartAnvändarnamn = new javax.swing.JLabel();
        lblStartLösenord = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLoginAgent.setText("Logga in Agent");
        btnLoginAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAgentActionPerformed(evt);
            }
        });

        btnLoginAlien.setText("Logga in som Alien");
        btnLoginAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAlienActionPerformed(evt);
            }
        });

        btnLoginAdmin.setText("Logga in som Admin");
        btnLoginAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAdminActionPerformed(evt);
            }
        });

        lblStartRubrik.setText("Välkommen till MIBs system. Logga in nedan.");

        pwfStartLogin.setColumns(5);

        lblStartAnvändarnamn.setText("Användarnamn");

        lblStartLösenord.setText("Lösenord");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLoginAgent)
                        .addGap(18, 18, 18)
                        .addComponent(btnLoginAlien)
                        .addGap(18, 18, 18)
                        .addComponent(btnLoginAdmin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblStartAnvändarnamn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStartAnvändarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblStartLösenord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pwfStartLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblStartRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStartRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartAnvändarnamn)
                    .addComponent(txtStartAnvändarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartLösenord)
                    .addComponent(pwfStartLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoginAgent)
                    .addComponent(btnLoginAlien)
                    .addComponent(btnLoginAdmin))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAdminActionPerformed
        AdminMetoder.loggainAdmin(txtStartAnvändarnamn, pwfStartLogin);
    }//GEN-LAST:event_btnLoginAdminActionPerformed

    private void btnLoginAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAlienActionPerformed
        AlienMetoder.loggaInAlien(txtStartAnvändarnamn, pwfStartLogin);
    }//GEN-LAST:event_btnLoginAlienActionPerformed

    private void btnLoginAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAgentActionPerformed
        AgentMetoder.loggainAgent(txtStartAnvändarnamn, pwfStartLogin);   
        
    }//GEN-LAST:event_btnLoginAgentActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginAdmin;
    private javax.swing.JButton btnLoginAgent;
    private javax.swing.JButton btnLoginAlien;
    private javax.swing.JLabel lblStartAnvändarnamn;
    private javax.swing.JLabel lblStartLösenord;
    private javax.swing.JLabel lblStartRubrik;
    private javax.swing.JPasswordField pwfStartLogin;
    private javax.swing.JTextField txtStartAnvändarnamn;
    // End of variables declaration//GEN-END:variables
}
