/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.grupp.pkg15;

/**
 *
 * @author augustdelin
 */
// Fälten för AdminAlienInfo.
public class AdminAlienInfo extends javax.swing.JFrame {

    private String användarnamn;

    /**
     * Konstruktorn för AdminAlienInfo.
     */
    public AdminAlienInfo(String användarnamn) {
        initComponents();
        this.användarnamn = användarnamn;
        cbAlienPlatser.setVisible(false);
        cbAlienRaser.setVisible(false);
        cbAlienNamn.setVisible(false);
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
        cbAlienPlatser = new javax.swing.JComboBox<>();
        btnSokPlats = new javax.swing.JButton();
        btnBacka = new javax.swing.JButton();
        btnAvsluta = new javax.swing.JButton();
        btnLoggaUt = new javax.swing.JButton();
        lblInloggadSom = new javax.swing.JLabel();
        btnSokRas = new javax.swing.JButton();
        cbAlienRaser = new javax.swing.JComboBox<>();
        btnSokAlien = new javax.swing.JButton();
        cbAlienNamn = new javax.swing.JComboBox<>();
        btnRegistreraAlien = new javax.swing.JButton();
        btnSökRegDatum = new javax.swing.JButton();
        btnÄndraAlien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreaListaAliens.setEditable(false);
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

        lblInloggadSom.setText("Inloggad som");

        btnSokRas.setText("Sök ras");
        btnSokRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokRasActionPerformed(evt);
            }
        });

        cbAlienRaser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlienRaserActionPerformed(evt);
            }
        });

        btnSokAlien.setText("Sök alien");
        btnSokAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAlienActionPerformed(evt);
            }
        });

        cbAlienNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlienNamnActionPerformed(evt);
            }
        });

        btnRegistreraAlien.setText("Registrera alien");
        btnRegistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAlienActionPerformed(evt);
            }
        });

        btnSökRegDatum.setText("Sök registreringsdatum");
        btnSökRegDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSökRegDatumActionPerformed(evt);
            }
        });

        btnÄndraAlien.setText("Ändra alien information");
        btnÄndraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraAlienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblInloggadSom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoggaUt))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBacka)
                .addGap(375, 375, 375)
                .addComponent(btnAvsluta)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbAlienRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAlienPlatser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSokAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSökRegDatum, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistreraAlien)
                    .addComponent(btnÄndraAlien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSokPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSokRas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInloggadSom)
                    .addComponent(btnLoggaUt))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnSokPlats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSokRas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSokAlien)
                            .addComponent(cbAlienRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAlienPlatser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSökRegDatum)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistreraAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnÄndraAlien)
                        .addGap(165, 165, 165)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBacka)
                    .addComponent(btnAvsluta)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Tryck på knappen för att starta metoden Lista alla aliens på en plats.
    private void cbAlienPlatserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlienPlatserActionPerformed
        AgentMetoder.listaAliensPåPlats(txtAreaListaAliens, cbAlienPlatser);
    }//GEN-LAST:event_cbAlienPlatserActionPerformed
//    Knappen startar metoden för att söka plats för aliens.
    private void btnSokPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokPlatsActionPerformed
        txtAreaListaAliens.setText("");
        cbAlienRaser.setVisible(false);
        cbAlienNamn.setVisible(false);
        cbAlienPlatser.setVisible(true);
        if (cbAlienPlatser.getItemCount() == 0) {

            AgentMetoder.fyllCBPlats(cbAlienPlatser);
        }
    }//GEN-LAST:event_btnSokPlatsActionPerformed
    //    Knappen för att starta metoden Backa.
    private void btnBackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackaActionPerformed
        Navigera.openAdminStartSkärm(användarnamn);
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

    private void btnSokRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokRasActionPerformed
        txtAreaListaAliens.setText("");
        cbAlienPlatser.setVisible(false);
        cbAlienNamn.setVisible(false);
        cbAlienRaser.setVisible(true);
        if (cbAlienRaser.getItemCount() == 0) {
            AgentMetoder.fyllCBras(cbAlienRaser);
        }

    }//GEN-LAST:event_btnSokRasActionPerformed

    private void cbAlienRaserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlienRaserActionPerformed
        AgentMetoder.listaAliensPerRas(txtAreaListaAliens, cbAlienRaser);
    }//GEN-LAST:event_cbAlienRaserActionPerformed

    private void btnSokAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokAlienActionPerformed
        txtAreaListaAliens.setText("");
        cbAlienPlatser.setVisible(false);
        cbAlienRaser.setVisible(false);
        cbAlienNamn.setVisible(true);
        if (cbAlienNamn.getItemCount() == 0) {
            AgentMetoder.fyllCBAlienNamn(cbAlienNamn);
        }
    }//GEN-LAST:event_btnSokAlienActionPerformed

    private void cbAlienNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlienNamnActionPerformed
        AgentMetoder.listaEnskildaAliens(txtAreaListaAliens, cbAlienNamn);
    }//GEN-LAST:event_cbAlienNamnActionPerformed
    // Öppnar fönstret AdminRegistreraAlien när knappen Registrera alien trycks
    private void btnRegistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAlienActionPerformed
        new AdminRegistreraAlien(användarnamn).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistreraAlienActionPerformed
    // Öppnar fönstret AdminAlienRegDatum när knappen Sök registreringsdatum trycks
    private void btnSökRegDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSökRegDatumActionPerformed
        new AdminAlienRegDatum(användarnamn).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSökRegDatumActionPerformed
    // Öppnar fönstret AdminÄndraAlien när knappen Ändra alien information trycks
    private void btnÄndraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraAlienActionPerformed
        new AdminÄndraAlien(användarnamn).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnÄndraAlienActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvsluta;
    private javax.swing.JButton btnBacka;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnRegistreraAlien;
    private javax.swing.JButton btnSokAlien;
    private javax.swing.JButton btnSokPlats;
    private javax.swing.JButton btnSokRas;
    private javax.swing.JButton btnSökRegDatum;
    private javax.swing.JButton btnÄndraAlien;
    private javax.swing.JComboBox<String> cbAlienNamn;
    private javax.swing.JComboBox<String> cbAlienPlatser;
    private javax.swing.JComboBox<String> cbAlienRaser;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblInloggadSom;
    private javax.swing.JTextArea txtAreaListaAliens;
    // End of variables declaration//GEN-END:variables
}
