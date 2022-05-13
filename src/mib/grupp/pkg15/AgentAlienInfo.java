/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.grupp.pkg15;

/**
 *
 * @author augustdelin
 */
// Fälten för AgentAlienInfo.
public class AgentAlienInfo extends javax.swing.JFrame {

    private String användarnamn;
    

    /**
     * Konstruktorn för AgentAlienInfo.
     */
    public AgentAlienInfo(String användarnamn) {
        initComponents();
        this.användarnamn = användarnamn;
        cbAlienPlatser.setVisible(false);
        cbAlienRaser.setVisible(false);
        FyllText.inloggadSom(lblInloggadSom, användarnamn);
        //AgentMetoder.fyllCBPlats(cbAlienPlats);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaListaAliens = new javax.swing.JTextArea();
        cbAlienPlatser = new javax.swing.JComboBox<>();
        btnSokPlats = new javax.swing.JButton();
        btnBacka = new javax.swing.JButton();
        btnAvsluta = new javax.swing.JButton();
        btnLoggaUt = new javax.swing.JButton();
        lblInloggadSom = new javax.swing.JLabel();
        btnSokRas = new javax.swing.JButton();
        cbAlienRaser = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreaListaAliens.setColumns(20);
        txtAreaListaAliens.setRows(5);
        jScrollPane2.setViewportView(txtAreaListaAliens);

        cbAlienPlatser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlienPlatserActionPerformed(evt);
            }
        });

        btnSokPlats.setText("Sök plats");
        btnSokPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokPlatsActionPerformed(evt);
            }
        });

        btnBacka.setText("Föregående Sida");
        btnBacka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackaActionPerformed(evt);
            }
        });

        btnAvsluta.setText("Avsluta program");
        btnAvsluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvslutaActionPerformed(evt);
            }
        });

        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        lblInloggadSom.setText("jLabel1");

        btnSokRas.setText("Sök ras");
        btnSokRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokRasActionPerformed(evt);
            }
        });

        cbAlienRaser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbAlienRaser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlienRaserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblInloggadSom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbAlienRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAlienPlatser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSokRas)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 371, Short.MAX_VALUE)
                        .addComponent(btnLoggaUt))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBacka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAvsluta))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSokPlats)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInloggadSom)
                    .addComponent(btnLoggaUt))
                .addGap(18, 18, 18)
                .addComponent(btnSokPlats)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAlienPlatser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSokRas)
                    .addComponent(cbAlienRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBacka)
                    .addComponent(btnAvsluta))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Tryck på knappen för att starta metoden Lista alla aliens på en plats.
    private void cbAlienPlatserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlienPlatserActionPerformed
        AgentMetoder.listaAliensPåPlats(txtAreaListaAliens, cbAlienPlatser);
    }//GEN-LAST:event_cbAlienPlatserActionPerformed

    private void btnSokPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokPlatsActionPerformed
        cbAlienRaser.setVisible(false);
        AgentMetoder.fyllCBPlats(cbAlienPlatser);
        cbAlienPlatser.setVisible(true);
    }//GEN-LAST:event_btnSokPlatsActionPerformed

    private void btnBackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackaActionPerformed
        Navigera.openAgentStartSkärm(användarnamn);
        dispose();
    }//GEN-LAST:event_btnBackaActionPerformed

    private void btnAvslutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvslutaActionPerformed
        Navigera.avslutaProgram();
    }//GEN-LAST:event_btnAvslutaActionPerformed

    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        Navigera.openStartSkärm();
        dispose();
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    private void btnSokRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokRasActionPerformed
        cbAlienPlatser.setVisible(false);
        //cbAlienPlatser.removeAllItems();
        cbAlienRaser.setVisible(true);
        AgentMetoder.fyllCBras(cbAlienRaser);

    }//GEN-LAST:event_btnSokRasActionPerformed

    private void cbAlienRaserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlienRaserActionPerformed
        AgentMetoder.listaAliensPerRas(txtAreaListaAliens, cbAlienRaser);
    }//GEN-LAST:event_cbAlienRaserActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvsluta;
    private javax.swing.JButton btnBacka;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnSokPlats;
    private javax.swing.JButton btnSokRas;
    private javax.swing.JComboBox<String> cbAlienPlatser;
    private javax.swing.JComboBox<String> cbAlienRaser;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblInloggadSom;
    private javax.swing.JTextArea txtAreaListaAliens;
    // End of variables declaration//GEN-END:variables
}
