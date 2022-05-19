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
public class AdminAlienRegDatum extends javax.swing.JFrame {

    private String användarnamn;
    

    /**
     * Konstruktorn för AgentAlienInfo.
     */
    public AdminAlienRegDatum(String användarnamn) {
        initComponents();
        this.användarnamn = användarnamn;
        FyllText.inloggadSomAdmin(lblInloggadSom, användarnamn);
        

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
        btnBacka = new javax.swing.JButton();
        btnAvsluta = new javax.swing.JButton();
        btnLoggaUt = new javax.swing.JButton();
        lblInloggadSom = new javax.swing.JLabel();
        txtDatum1 = new javax.swing.JTextField();
        txtDatum2 = new javax.swing.JTextField();
        lblDatum1 = new javax.swing.JLabel();
        lblDatum2 = new javax.swing.JLabel();
        btnSökAliens = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreaListaAliens.setEditable(false);
        txtAreaListaAliens.setColumns(20);
        txtAreaListaAliens.setRows(5);
        jScrollPane2.setViewportView(txtAreaListaAliens);

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

        lblInloggadSom.setText("Inloggad som");

        txtDatum1.setColumns(9);

        txtDatum2.setColumns(9);

        lblDatum1.setText("Från datum:");

        lblDatum2.setText("Till datum:");

        btnSökAliens.setText("Sök aliens");
        btnSökAliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSökAliensActionPerformed(evt);
            }
        });

        jLabel2.setText("Vänligen ange datum i formatet YYYY-MM-DD.");

        jLabel3.setText("Hitta information om aliens som är registrerade mellan valda två datum.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBacka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAvsluta)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblInloggadSom)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDatum1))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDatum2)
                                    .addComponent(lblDatum2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(62, 62, 62)
                                .addComponent(btnSökAliens))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 168, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLoggaUt)
                        .addGap(108, 108, 108))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInloggadSom)
                    .addComponent(btnLoggaUt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDatum2)
                    .addComponent(lblDatum1))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSökAliens))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBacka)
                    .addComponent(btnAvsluta))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   //    Knappen för att starta metoden Backa.
    private void btnBackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackaActionPerformed
        new AdminAlienInfo(användarnamn).setVisible(true);
        dispose(); 
    }//GEN-LAST:event_btnBackaActionPerformed
      // Knappen för att starta metoden Avsluta program.
    private void btnAvslutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvslutaActionPerformed
        Navigera.avslutaProgram();
    }//GEN-LAST:event_btnAvslutaActionPerformed
    // Öppnar Startskärmen när knappen Logga ut trycks
    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        Navigera.openStartSkärm();
        dispose();
    }//GEN-LAST:event_btnLoggaUtActionPerformed
// Knappen för att starta metoden för att söka efter aliens mellan två valda datum.
    private void btnSökAliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSökAliensActionPerformed
        AgentMetoder.getAlienFrånRegDatum(txtDatum1, txtDatum2, txtAreaListaAliens);
        
    }//GEN-LAST:event_btnSökAliensActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvsluta;
    private javax.swing.JButton btnBacka;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnSökAliens;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDatum1;
    private javax.swing.JLabel lblDatum2;
    private javax.swing.JLabel lblInloggadSom;
    private javax.swing.JTextArea txtAreaListaAliens;
    private javax.swing.JTextField txtDatum1;
    private javax.swing.JTextField txtDatum2;
    // End of variables declaration//GEN-END:variables
}