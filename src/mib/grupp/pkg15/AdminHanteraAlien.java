/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.grupp.pkg15;

import javax.swing.JOptionPane;

/**
 *
 * @author augustdelin
 */
// Fälten för AdminHanteraAlien.
public class AdminHanteraAlien extends javax.swing.JFrame {

    private String användarnamn;

    /**
     * Konstruktorn för AdminHanteraAlien.
     */
    public AdminHanteraAlien(String användarnamn) {
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
        btnTaBortAlien = new javax.swing.JButton();
        lblFörklaring1 = new javax.swing.JLabel();
        lblFörklaring2 = new javax.swing.JLabel();
        lblFörklaring3 = new javax.swing.JLabel();

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

        btnTaBortAlien.setText("Ta bort alien ur systemet");
        btnTaBortAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAlienActionPerformed(evt);
            }
        });

        lblFörklaring1.setText("För att ta bort en alien ur systemet");

        lblFörklaring2.setText("välj sök alien och markera den alien du vill ta bort");

        lblFörklaring3.setText("och tryck sedan på knappen \"Ta bort alien ur systemet\".");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAvsluta))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistreraAlien)
                    .addComponent(btnÄndraAlien)
                    .addComponent(btnTaBortAlien)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFörklaring1)
                            .addComponent(lblFörklaring2)
                            .addComponent(lblFörklaring3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSokPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSokRas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(cbAlienRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAlienPlatser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 23, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSokAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSökRegDatum, javax.swing.GroupLayout.Alignment.TRAILING)))))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTaBortAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFörklaring1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFörklaring2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFörklaring3)
                        .addGap(71, 71, 71)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBacka)
                    .addComponent(btnAvsluta)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Tryck på knappen för att starta metoden Lista alla aliens på en plats.
    private void cbAlienPlatserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlienPlatserActionPerformed
        MetoderAgentAdmin.listaAliensPåPlats(txtAreaListaAliens, cbAlienPlatser);
    }//GEN-LAST:event_cbAlienPlatserActionPerformed
//    Knappen startar metoden för att söka plats för aliens.
    private void btnSokPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokPlatsActionPerformed
        txtAreaListaAliens.setText("");
        cbAlienRaser.setVisible(false);
        cbAlienNamn.setVisible(false);
        cbAlienPlatser.setVisible(true);
        if (cbAlienPlatser.getItemCount() == 0) {

            ComboBoxar.fyllCBPlats(cbAlienPlatser);
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
    // Knappen för att söka alienraser på specifika platser.
    private void btnSokRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokRasActionPerformed
        txtAreaListaAliens.setText("");
        cbAlienPlatser.setVisible(false);
        cbAlienNamn.setVisible(false);
        cbAlienRaser.setVisible(true);
        if (cbAlienRaser.getItemCount() == 0) {
            ComboBoxar.fyllCBras(cbAlienRaser);
        }

    }//GEN-LAST:event_btnSokRasActionPerformed
    // ComboBox för att lista alla aliens per ras.
    private void cbAlienRaserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlienRaserActionPerformed
        MetoderAgentAdmin.listaAliensPerRas(txtAreaListaAliens, cbAlienRaser);
    }//GEN-LAST:event_cbAlienRaserActionPerformed
    // Knappen för att söka information om en alien.
    private void btnSokAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokAlienActionPerformed
        txtAreaListaAliens.setText("");
        cbAlienPlatser.setVisible(false);
        cbAlienRaser.setVisible(false);
        cbAlienNamn.setVisible(true);
        if (cbAlienNamn.getItemCount() == 0) {
            ComboBoxar.fyllCBAlienNamn(cbAlienNamn);
        }
    }//GEN-LAST:event_btnSokAlienActionPerformed
    // ComboBox för att lista enskilda aliens.        
    private void cbAlienNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlienNamnActionPerformed
        MetoderAgentAdmin.listaEnskildaAliens(txtAreaListaAliens, cbAlienNamn);
    }//GEN-LAST:event_cbAlienNamnActionPerformed
    // Knappen för att öppna ett nytt fönster för klassen RegistreraAlien.
    private void btnRegistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAlienActionPerformed
        new AdminRegistreraAlien(användarnamn).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistreraAlienActionPerformed
    //Knappen för att öppna ett nytt fönster för klassen SökRegdatum.
    private void btnSökRegDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSökRegDatumActionPerformed
        new AdminAlienRegDatum(användarnamn).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSökRegDatumActionPerformed
    // Knappen för att öppna ett nytt fönster för klassen AgentÄndraAlien.
    private void btnÄndraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraAlienActionPerformed
        new AdminÄndraAlien(användarnamn).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnÄndraAlienActionPerformed
    // Knappen för att ta bort en alien.
    private void btnTaBortAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAlienActionPerformed

        if (cbAlienNamn.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Vänligen välj en alien först!");
        } else {
            MetoderUnikaAdmin.taBortAlienUrSystemet(cbAlienNamn);
        }


    }//GEN-LAST:event_btnTaBortAlienActionPerformed

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
    private javax.swing.JButton btnTaBortAlien;
    private javax.swing.JButton btnÄndraAlien;
    private javax.swing.JComboBox<String> cbAlienNamn;
    private javax.swing.JComboBox<String> cbAlienPlatser;
    private javax.swing.JComboBox<String> cbAlienRaser;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFörklaring1;
    private javax.swing.JLabel lblFörklaring2;
    private javax.swing.JLabel lblFörklaring3;
    private javax.swing.JLabel lblInloggadSom;
    private javax.swing.JTextArea txtAreaListaAliens;
    // End of variables declaration//GEN-END:variables
}
