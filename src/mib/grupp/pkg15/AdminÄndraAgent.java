/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.grupp.pkg15;

/**
 *
 * @author Linda
 */
//    Fälten för AgentÄndraAgent.
public class AdminÄndraAgent extends javax.swing.JFrame {

    private String användarnamn;

    /**
     * Konstruktorn för AdminÄndraAgent.
     *
     * @param användarnamn
     */
    public AdminÄndraAgent(String användarnamn) {
        initComponents();
        this.användarnamn = användarnamn;
        FyllText.inloggadSomAdmin(lblInloggadSom, användarnamn);
        ComboBoxar.fyllCBAgentNamn(cbAgentNamn);
        ComboBoxar.fyllCBområden(cbOmråden);
        ComboBoxar.fyllAdminStatus(cbAdminstatus);
        ComboBoxar.fyllCBPlats(cbVilketKontor);
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
        btnLoggaut = new javax.swing.JButton();
        btnAvsluta = new javax.swing.JButton();
        lblInloggadSom = new javax.swing.JLabel();
        lblRegistreraAgent = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblRubrikRegd = new javax.swing.JLabel();
        lblRubrikNamn = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lblRubrikLösen = new javax.swing.JLabel();
        txtLösenord = new javax.swing.JPasswordField();
        lblRubrikTelefon = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        cbOmråden = new javax.swing.JComboBox<>();
        btnOmRegistreraAgent = new javax.swing.JButton();
        lblAdminstatus = new javax.swing.JLabel();
        cbAdminstatus = new javax.swing.JComboBox<>();
        lblvisaID = new javax.swing.JLabel();
        lbRubrikID = new javax.swing.JLabel();
        lblAgent = new javax.swing.JLabel();
        cbAgentNamn = new javax.swing.JComboBox<>();
        txtDatum = new javax.swing.JTextField();
        lblVilketKontor = new javax.swing.JLabel();
        cbVilketKontor = new javax.swing.JComboBox<>();
        btnAndraOCStatus = new javax.swing.JButton();
        btnAndraKCStatus = new javax.swing.JButton();
        lblOmråde = new javax.swing.JLabel();
        lblOmrådeRubrik = new javax.swing.JLabel();
        lblOCRubrik = new javax.swing.JLabel();
        lblRubrikKontorschef = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBacka.setText("Föregående sida");
        btnBacka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackaActionPerformed(evt);
            }
        });

        btnLoggaut.setText("Logga ut");
        btnLoggaut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggautActionPerformed(evt);
            }
        });

        btnAvsluta.setText("Avsluta program");
        btnAvsluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvslutaActionPerformed(evt);
            }
        });

        lblInloggadSom.setText("Inloggad som");

        lblRegistreraAgent.setText("Ändra agentinformation");

        lblRubrikRegd.setText("Registreringsdatum");

        lblRubrikNamn.setText("Namn - ange endast en bokstav");

        txtNamn.setColumns(6);

        lblRubrikLösen.setText("Lösenord");

        txtLösenord.setColumns(6);

        lblRubrikTelefon.setText("Telefonnummer");

        txtTelefon.setColumns(6);

        cbOmråden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOmrådenActionPerformed(evt);
            }
        });

        btnOmRegistreraAgent.setText("Slutför omregistrering");
        btnOmRegistreraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOmRegistreraAgentActionPerformed(evt);
            }
        });

        lblAdminstatus.setText("Adminstatus");

        lblvisaID.setText("ett ID");

        lbRubrikID.setText("ID-nummer");

        lblAgent.setText("Välj Agent");

        cbAgentNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAgentNamnActionPerformed(evt);
            }
        });

        txtDatum.setColumns(6);

        lblVilketKontor.setText("Välj kontor");

        btnAndraOCStatus.setText("Gör till områdeschef");
        btnAndraOCStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraOCStatusActionPerformed(evt);
            }
        });

        btnAndraKCStatus.setText("Gör till kontorschef");
        btnAndraKCStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraKCStatusActionPerformed(evt);
            }
        });

        lblOmråde.setText("Område");

        lblOmrådeRubrik.setText("Ange ett område där agenten är verksam.");

        lblOCRubrik.setText("Tryck på knappen för att göra agenten till områdeschef över det valda området.");

        lblRubrikKontorschef.setText("För att göra en agent till kontorschef, vänligen välj ett kontor i rullistan och tryck sedan på knappen.");

        jLabel1.setText("Plats");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRubrikLösen)
                            .addComponent(lblRubrikTelefon)
                            .addComponent(lblRubrikNamn)
                            .addComponent(lblRubrikRegd)
                            .addComponent(lblAgent)
                            .addComponent(lbRubrikID)
                            .addComponent(lblAdminstatus)
                            .addComponent(lblVilketKontor)
                            .addComponent(lblRubrikKontorschef))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblvisaID)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNamn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLösenord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbAdminstatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDatum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                        .addComponent(txtTelefon, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(cbAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(cbOmråden, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(cbVilketKontor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblOmrådeRubrik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAndraOCStatus)
                                .addGap(18, 18, 18)
                                .addComponent(lblOmråde))
                            .addComponent(lblOCRubrik)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAndraKCStatus)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1)))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOmRegistreraAgent)
                        .addGap(549, 549, 549))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgent)
                    .addComponent(cbAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRubrikID)
                    .addComponent(lblvisaID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikRegd)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRubrikLösen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRubrikTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAdminstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdminstatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOmrådeRubrik)
                    .addComponent(lblOCRubrik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbOmråden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraOCStatus))
                .addGap(18, 18, 18)
                .addComponent(lblRubrikKontorschef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVilketKontor)
                    .addComponent(cbVilketKontor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraKCStatus)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnOmRegistreraAgent)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblRegistreraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoggaut)
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBacka)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInloggadSom)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAvsluta)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblInloggadSom)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoggaut)
                    .addComponent(lblRegistreraAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAvsluta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBacka)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Knappen för att starta metoden Logga ut.
    private void btnLoggautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggautActionPerformed
        Navigera.openStartSkärm();
        dispose();
    }//GEN-LAST:event_btnLoggautActionPerformed
    // Knappen för att starta metoden Avsluta program.
    private void btnAvslutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvslutaActionPerformed
        Navigera.avslutaProgram();
    }//GEN-LAST:event_btnAvslutaActionPerformed
    // Knappen för att starta metoden Backa.
    private void btnBackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackaActionPerformed
        new AdminHanteraAgent(användarnamn).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackaActionPerformed
    // Knappen för att omregistrera en agent.
    private void btnOmRegistreraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOmRegistreraAgentActionPerformed
        MetoderUnikaAdmin.ändraAgent(cbAgentNamn, lblvisaID, txtNamn, txtDatum, txtTelefon, txtLösenord, cbAdminstatus, cbOmråden);
    }//GEN-LAST:event_btnOmRegistreraAgentActionPerformed
    // ComboBox för att visa information om en agent.
    private void cbAgentNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAgentNamnActionPerformed
        MetoderUnikaAdmin.visaInformationAgent(cbAgentNamn, lblvisaID, txtNamn, txtDatum, txtTelefon, txtLösenord, cbAdminstatus, cbOmråden);
    }//GEN-LAST:event_cbAgentNamnActionPerformed
    // Knappen för att lägga till kontorschef.
    private void btnAndraKCStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraKCStatusActionPerformed
        MetoderUnikaAdmin.laggTillKontorsChef(cbVilketKontor, cbAgentNamn);

    }//GEN-LAST:event_btnAndraKCStatusActionPerformed
    // Knappen för att lägga till kontorschef.
    private void btnAndraOCStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraOCStatusActionPerformed
        MetoderUnikaAdmin.laggTillOmrådesChef(cbAgentNamn, cbOmråden);


    }//GEN-LAST:event_btnAndraOCStatusActionPerformed
    // ComboBox för att visa områden.
    private void cbOmrådenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOmrådenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOmrådenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraKCStatus;
    private javax.swing.JButton btnAndraOCStatus;
    private javax.swing.JButton btnAvsluta;
    private javax.swing.JButton btnBacka;
    private javax.swing.JButton btnLoggaut;
    private javax.swing.JButton btnOmRegistreraAgent;
    private javax.swing.JComboBox<String> cbAdminstatus;
    private javax.swing.JComboBox<String> cbAgentNamn;
    private javax.swing.JComboBox<String> cbOmråden;
    private javax.swing.JComboBox<String> cbVilketKontor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbRubrikID;
    private javax.swing.JLabel lblAdminstatus;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblInloggadSom;
    private javax.swing.JLabel lblOCRubrik;
    private javax.swing.JLabel lblOmråde;
    private javax.swing.JLabel lblOmrådeRubrik;
    private javax.swing.JLabel lblRegistreraAgent;
    private javax.swing.JLabel lblRubrikKontorschef;
    private javax.swing.JLabel lblRubrikLösen;
    private javax.swing.JLabel lblRubrikNamn;
    private javax.swing.JLabel lblRubrikRegd;
    private javax.swing.JLabel lblRubrikTelefon;
    private javax.swing.JLabel lblVilketKontor;
    private javax.swing.JLabel lblvisaID;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JPasswordField txtLösenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
