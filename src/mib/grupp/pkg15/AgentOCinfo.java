/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.grupp.pkg15;

/**
 *
 * @author augustdelin
 */
// Fälten för AgentOCInfo.
public class AgentOCinfo extends javax.swing.JFrame {

    private String användarnamn;

    /**
     * Konstruktorn för AgentOCInfo.
     */
    public AgentOCinfo(String användarnamn) {
        initComponents();
        this.användarnamn = användarnamn;
        FyllText.inloggadSom(lblInloggadSom, användarnamn);

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
        txtAreaListaChefer = new javax.swing.JTextArea();
        btnBacka = new javax.swing.JButton();
        btnAvsluta = new javax.swing.JButton();
        btnLoggaUt = new javax.swing.JButton();
        lblInloggadSom = new javax.swing.JLabel();
        btnVisaOmrådeschefer = new javax.swing.JButton();
        btnVisaKontorschefer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreaListaChefer.setEditable(false);
        txtAreaListaChefer.setColumns(20);
        txtAreaListaChefer.setRows(5);
        jScrollPane2.setViewportView(txtAreaListaChefer);

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

        lblInloggadSom.setText("Inloggad Som");

        btnVisaOmrådeschefer.setText("Visa Områdeschefer");
        btnVisaOmrådeschefer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaOmrådescheferActionPerformed(evt);
            }
        });

        btnVisaKontorschefer.setText("Visa Kontorschefer");
        btnVisaKontorschefer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaKontorscheferActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblInloggadSom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVisaOmrådeschefer)
                        .addContainerGap())
                    .addComponent(btnLoggaUt, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBacka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAvsluta))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVisaKontorschefer)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInloggadSom)
                    .addComponent(btnLoggaUt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVisaKontorschefer)
                .addGap(11, 11, 11)
                .addComponent(btnVisaOmrådeschefer)
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

   //    Knappen för att starta metoden Backa.
    private void btnBackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackaActionPerformed
        Navigera.openAgentStartSkärm(användarnamn);
        dispose();
    }//GEN-LAST:event_btnBackaActionPerformed
    // Knappen för att starta metoden Avsluta program.
    private void btnAvslutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvslutaActionPerformed
        Navigera.avslutaProgram();
    }//GEN-LAST:event_btnAvslutaActionPerformed
    // Knappen för att starta metoden Logga ut.
    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        Navigera.openStartSkärm();
        dispose();
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    private void btnVisaOmrådescheferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaOmrådescheferActionPerformed
       MetoderAgentAdmin.listaAllaOmrådesChefer(txtAreaListaChefer);
    }//GEN-LAST:event_btnVisaOmrådescheferActionPerformed

    private void btnVisaKontorscheferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaKontorscheferActionPerformed
        MetoderAgentAdmin.listaAllaKontorsChefer(txtAreaListaChefer);
    }//GEN-LAST:event_btnVisaKontorscheferActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvsluta;
    private javax.swing.JButton btnBacka;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnVisaKontorschefer;
    private javax.swing.JButton btnVisaOmrådeschefer;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblInloggadSom;
    private javax.swing.JTextArea txtAreaListaChefer;
    // End of variables declaration//GEN-END:variables
}
