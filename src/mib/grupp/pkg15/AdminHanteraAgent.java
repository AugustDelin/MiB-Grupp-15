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
// Fälten för AdminHanteraAgent.
public class AdminHanteraAgent extends javax.swing.JFrame {

    private String användarnamn;

    /**
     * Konstruktorn för AdminAgentInfo.
     */
    public AdminHanteraAgent(String användarnamn) {
        initComponents();
        this.användarnamn = användarnamn;
        cbAgentNamn.setVisible(false);
        FyllText.inloggadSomAdmin(lblInloggadSom, användarnamn);
        cbOmrådeschefer.setVisible(false);
        cbKontorschefer.setVisible(false);
        ComboBoxar.fyllOmrådesChefer(cbOmrådeschefer);
        ComboBoxar.fyllKontorschefer(cbKontorschefer);
        btnTabortKC.setVisible(false);
        btnTabortOC.setVisible(false);
         cbAlienansvar.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBacka = new javax.swing.JButton();
        btnAvsluta = new javax.swing.JButton();
        btnLoggaUt = new javax.swing.JButton();
        lblInloggadSom = new javax.swing.JLabel();
        btnÄndraAgent = new javax.swing.JButton();
        lblFörklaring1 = new javax.swing.JLabel();
        lblFörklaring2 = new javax.swing.JLabel();
        lblFörklaring3 = new javax.swing.JLabel();
        btnTaBortAgent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaListaAgenter = new javax.swing.JTextArea();
        btnSokAgent = new javax.swing.JButton();
        btnSokOC = new javax.swing.JButton();
        cbAgentNamn = new javax.swing.JComboBox<>();
        btnRegistreraAgent = new javax.swing.JButton();
        cbKontorschefer = new javax.swing.JComboBox<>();
        btnVisaKontorschef = new javax.swing.JButton();
        btnTabortOC = new javax.swing.JButton();
        cbOmrådeschefer = new javax.swing.JComboBox<>();
        btnTabortKC = new javax.swing.JButton();
        btnAlienAnsvar = new javax.swing.JButton();
        cbAlienansvar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        btnÄndraAgent.setText("Ändra agentinformation");
        btnÄndraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraAgentActionPerformed(evt);
            }
        });

        lblFörklaring1.setText("För att ta bort en agent ur systemet");

        lblFörklaring2.setText("välj sök agent och markera den agent du vill ta bort");

        lblFörklaring3.setText("och tryck sedan på knappen \"Ta bort agent ur systemet\".");

        btnTaBortAgent.setText("Ta bort vald agent");
        btnTaBortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAgentActionPerformed(evt);
            }
        });

        txtAreaListaAgenter.setEditable(false);
        txtAreaListaAgenter.setColumns(20);
        txtAreaListaAgenter.setRows(5);
        jScrollPane2.setViewportView(txtAreaListaAgenter);

        btnSokAgent.setText("Sök agent");
        btnSokAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAgentActionPerformed(evt);
            }
        });

        btnSokOC.setText("Visa områdeschefer");
        btnSokOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokOCActionPerformed(evt);
            }
        });

        cbAgentNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAgentNamnActionPerformed(evt);
            }
        });

        btnRegistreraAgent.setText("Registrera agent");
        btnRegistreraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAgentActionPerformed(evt);
            }
        });

        btnVisaKontorschef.setText("Visa kontorschefer");
        btnVisaKontorschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaKontorschefActionPerformed(evt);
            }
        });

        btnTabortOC.setText("Ta bort områdeschef");
        btnTabortOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabortOCActionPerformed(evt);
            }
        });

        btnTabortKC.setText("Ta bort kontorschef");
        btnTabortKC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabortKCActionPerformed(evt);
            }
        });

        btnAlienAnsvar.setText("Visa alienansvar");
        btnAlienAnsvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlienAnsvarActionPerformed(evt);
            }
        });

        cbAlienansvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlienansvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnBacka)
                        .addGap(794, 794, 794)
                        .addComponent(btnAvsluta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInloggadSom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLoggaUt))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTaBortAgent)
                                    .addComponent(btnRegistreraAgent)
                                    .addComponent(btnÄndraAgent)
                                    .addComponent(lblFörklaring1)
                                    .addComponent(lblFörklaring2))
                                .addGap(243, 243, 243)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(btnTabortKC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(cbKontorschefer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnTabortOC)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(cbOmrådeschefer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(cbAlienansvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnSokAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSokOC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnVisaKontorschef, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAlienAnsvar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(14, 14, 14))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFörklaring3)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLoggaUt)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblInloggadSom)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnÄndraAgent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistreraAgent)
                        .addGap(4, 4, 4)
                        .addComponent(btnTaBortAgent)
                        .addGap(18, 18, 18)
                        .addComponent(lblFörklaring1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFörklaring2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFörklaring3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbKontorschefer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTabortKC))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbOmrådeschefer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTabortOC))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVisaKontorschef)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSokOC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSokAgent)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlienAnsvar)
                            .addComponent(cbAlienansvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvsluta)
                    .addComponent(btnBacka))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Knappen för att starta metoden Backa.
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

    private void btnSokAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokAgentActionPerformed
        txtAreaListaAgenter.setText("");
        cbAgentNamn.setVisible(true);
        btnTabortOC.setVisible(false);
        btnTabortKC.setVisible(false);
        cbKontorschefer.setVisible(false);
        cbOmrådeschefer.setVisible(false);
         cbAlienansvar.setVisible(false);
        if (cbAgentNamn.getItemCount() == 0) {
            ComboBoxar.fyllCBAgentNamn(cbAgentNamn);
        }
    }//GEN-LAST:event_btnSokAgentActionPerformed

    private void cbAgentNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAgentNamnActionPerformed
        MetoderUnikaAdmin.listaEnskildAgent(txtAreaListaAgenter, cbAgentNamn);
    }//GEN-LAST:event_cbAgentNamnActionPerformed

    private void btnRegistreraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAgentActionPerformed
        new AdminRegistreraAgent(användarnamn).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistreraAgentActionPerformed

//Öppnar ett nytt fönster för klassen ÄndraAlien.
    private void btnÄndraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraAgentActionPerformed
        new AdminÄndraAgent(användarnamn).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnÄndraAgentActionPerformed
//Trycka knapp, hämta information från kombo-box.
    private void btnTaBortAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAgentActionPerformed

        if (cbAgentNamn.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Vänligen välj en agent först!");
        } else {
            MetoderUnikaAdmin.taBortAgentUrSystemet(cbAgentNamn);
        }

    }//GEN-LAST:event_btnTaBortAgentActionPerformed

    private void btnSokOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokOCActionPerformed
        cbAgentNamn.setVisible(false);
        cbAlienansvar.setVisible(false);
        btnTabortOC.setVisible(true);
        btnTabortKC.setVisible(false);
        cbKontorschefer.setVisible(false);
        cbOmrådeschefer.setVisible(true);
        cbAlienansvar.setVisible(false);
        MetoderAgentAdmin.listaAllaOmrådesChefer(txtAreaListaAgenter);


    }//GEN-LAST:event_btnSokOCActionPerformed

    private void btnVisaKontorschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaKontorschefActionPerformed
        cbAgentNamn.setVisible(false);
        btnTabortOC.setVisible(false);
        btnTabortKC.setVisible(true);
        cbKontorschefer.setVisible(true);
        cbOmrådeschefer.setVisible(false);
        cbAlienansvar.setVisible(false);

        MetoderAgentAdmin.listaAllaKontorsChefer(txtAreaListaAgenter);

    }//GEN-LAST:event_btnVisaKontorschefActionPerformed

    private void btnTabortKCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabortKCActionPerformed
        MetoderUnikaAdmin.taBortKontorsChef(cbKontorschefer);
    }//GEN-LAST:event_btnTabortKCActionPerformed

    private void btnTabortOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabortOCActionPerformed
        MetoderUnikaAdmin.taBortOmrådesChef(cbOmrådeschefer);
    }//GEN-LAST:event_btnTabortOCActionPerformed

    private void btnAlienAnsvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlienAnsvarActionPerformed
        txtAreaListaAgenter.setText("");
        cbAgentNamn.setVisible(false);
        btnTabortOC.setVisible(false);
        btnTabortKC.setVisible(false);
        cbKontorschefer.setVisible(false);
        cbOmrådeschefer.setVisible(false);
        cbAlienansvar.setVisible(true);
        if (cbAlienansvar.getItemCount() == 0) {
            ComboBoxar.fyllCBAgentNamn(cbAlienansvar);
        }
        
        
    }//GEN-LAST:event_btnAlienAnsvarActionPerformed

    private void cbAlienansvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlienansvarActionPerformed
       MetoderUnikaAdmin.visaAgentAnsvar(cbAlienansvar, txtAreaListaAgenter);
    }//GEN-LAST:event_cbAlienansvarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlienAnsvar;
    private javax.swing.JButton btnAvsluta;
    private javax.swing.JButton btnBacka;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnRegistreraAgent;
    private javax.swing.JButton btnSokAgent;
    private javax.swing.JButton btnSokOC;
    private javax.swing.JButton btnTaBortAgent;
    private javax.swing.JButton btnTabortKC;
    private javax.swing.JButton btnTabortOC;
    private javax.swing.JButton btnVisaKontorschef;
    private javax.swing.JButton btnÄndraAgent;
    private javax.swing.JComboBox<String> cbAgentNamn;
    private javax.swing.JComboBox<String> cbAlienansvar;
    private javax.swing.JComboBox<String> cbKontorschefer;
    private javax.swing.JComboBox<String> cbOmrådeschefer;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFörklaring1;
    private javax.swing.JLabel lblFörklaring2;
    private javax.swing.JLabel lblFörklaring3;
    private javax.swing.JLabel lblInloggadSom;
    private javax.swing.JTextArea txtAreaListaAgenter;
    // End of variables declaration//GEN-END:variables
}
