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
public class StartSkärm extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Creates new form StartSkärm
     */
    public StartSkärm(InfDB db) {
        initComponents();
        idb = db;
        
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
        pwfStartLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwfStartLoginActionPerformed(evt);
            }
        });

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
       if (Validera.kollaTom(txtStartAnvändarnamn) && Validera.kollaTom(pwfStartLogin) ) {
            try {
                //hämtar användarnamn ifrån loginruta
                String användarnamn = txtStartAnvändarnamn.getText();

                // hämta lösenordet som matchar angivet användarnamn ifrån databasen
                String lösenord = idb.fetchSingle("Select Losenord from agent where namn ='" + användarnamn + "'");
                
                // hämta adminstatus från databasen
                String adminstatus = idb.fetchSingle("Select Adminstrator from agent where namn = '" + användarnamn + "'");

                //jämför inskrivet lösen med det som står skrivet i rutan lösenord
                if (lösenord.equals(pwfStartLogin.getText()) && adminstatus.equals("J")) {
                    //om ovan villkor är true skapas en ny ruta
                    new AdminStartSkärm(användarnamn).setVisible(true);
                    setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Lösenord är felaktigt.");
                }

            } catch (InfException ex) {
                Logger.getLogger(StartSkärm.class.getName()).log(Level.SEVERE, null, ex);

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Användarnamn finns ej.");
            }
        }
    }//GEN-LAST:event_btnLoginAdminActionPerformed

    private void btnLoginAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAlienActionPerformed
        if (Validera.kollaTom(txtStartAnvändarnamn) && Validera.kollaTom(pwfStartLogin)) {
            try {
                //hämtar användarnamn ifrån loginruta
                String användarnamn = txtStartAnvändarnamn.getText();

                // hämta lösenordet som matchar angivet användarnamn ifrån databasen
                String lösenord = idb.fetchSingle("Select Losenord from alien where namn ='" + användarnamn + "'");

                //jämför inskrivet lösen med det som står skrivet i rutan lösenord
                if (lösenord.equals(pwfStartLogin.getText())) {
                    //om ovan villkor är true skapas en ny ruta
                    new AlienStartSkärm(användarnamn).setVisible(true);
                    setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Lösenord är felaktigt.");
                }

            } catch (InfException ex) {
                Logger.getLogger(StartSkärm.class.getName()).log(Level.SEVERE, null, ex);

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Användarnamn finns ej.");
            }
        }
    }//GEN-LAST:event_btnLoginAlienActionPerformed

    private void btnLoginAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAgentActionPerformed
        if (Validera.kollaTom(txtStartAnvändarnamn) && Validera.kollaTom(pwfStartLogin)) {
            try {
                //hämtar användarnamn ifrån loginruta
                String användarnamn = txtStartAnvändarnamn.getText();

                // hämta lösenordet som matchar angivet användarnamn ifrån databasen
                String lösenord = idb.fetchSingle("Select Losenord from agent where namn ='" + användarnamn + "'");

                //jämför inskrivet lösen med det som står skrivet i rutan lösenord
                if (lösenord.equals(pwfStartLogin.getText())) {
                    //om ovan villkor är true skapas en ny ruta
                    new AgentStartSkärm(användarnamn).setVisible(true);
                    setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Lösenord är felaktigt.");
                }

            } catch (InfException ex) {
                Logger.getLogger(StartSkärm.class.getName()).log(Level.SEVERE, null, ex);

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Användarnamn finns ej.");
            }
        }
    }//GEN-LAST:event_btnLoginAgentActionPerformed

    private void pwfStartLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwfStartLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwfStartLoginActionPerformed

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
