/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.grupp.pkg15;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author augustdelin
 */
public class AlienMinSida extends javax.swing.JFrame {
    private String användarnamn;
    private static InfDB idb;

    /**
     * Creates new form AlienMinSida
     */
    public AlienMinSida(String användarnamn) {
        initComponents();
        this.användarnamn = användarnamn;
        lblRubrik.setText(användarnamn);
        idb = Main.getDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBytLösenord = new javax.swing.JButton();
        lblRubrik = new javax.swing.JLabel();
        lblGammaltLösenord = new javax.swing.JLabel();
        lblNyttLösenord = new javax.swing.JLabel();
        pwfGammaltLösenord = new javax.swing.JPasswordField();
        pwfNyttLösenord = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBytLösenord.setText("Byt Lösenord");
        btnBytLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBytLösenordActionPerformed(evt);
            }
        });

        lblRubrik.setText("Min Sida");

        lblGammaltLösenord.setText("Gammal lösenord");

        lblNyttLösenord.setText("Nytt lösenord");

        pwfGammaltLösenord.setText("jPasswordField1");

        pwfNyttLösenord.setText("jPasswordField2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblRubrik))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNyttLösenord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pwfNyttLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGammaltLösenord)
                                .addGap(60, 60, 60)
                                .addComponent(pwfGammaltLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnBytLösenord)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblRubrik)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGammaltLösenord)
                    .addComponent(pwfGammaltLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyttLösenord)
                    .addComponent(pwfNyttLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnBytLösenord)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBytLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBytLösenordActionPerformed
        try {
            boolean resultat = true;
            String lösenord = idb.fetchSingle("Select Losenord from alien where namn ='" + användarnamn + "'");
            if(Validera.kollaLösen(lösenord, pwfGammaltLösenord)){
                String nyttLösenord = pwfNyttLösenord.getText();
                idb.update("UPDATE alien SET lösenord=nyttLösenord where namn ='" + användarnamn +  "'");
            }
        } catch (InfException ex) {
            Logger.getLogger(AlienMinSida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBytLösenordActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBytLösenord;
    private javax.swing.JLabel lblGammaltLösenord;
    private javax.swing.JLabel lblNyttLösenord;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JPasswordField pwfGammaltLösenord;
    private javax.swing.JPasswordField pwfNyttLösenord;
    // End of variables declaration//GEN-END:variables
}
