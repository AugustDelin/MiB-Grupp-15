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
//    Fälten för AgentRegistreraAlien.
public class AdminÄndraAgent extends javax.swing.JFrame {

    private String användarnamn;

    /**
     * Konstruktorn för AgentRegistreraAlien.
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
        MetoderUnikaAdmin.listaAllaKontor(cbVilketKontor);
        ComboBoxar.fyllCBJaOchNej(cbOC);
        ComboBoxar.fyllCBJaOchNej(cbKC);
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
        lblOC = new javax.swing.JLabel();
        cbOC = new javax.swing.JComboBox<>();
        lblKC = new javax.swing.JLabel();
        cbKC = new javax.swing.JComboBox<>();
        lblVilketKontor = new javax.swing.JLabel();
        cbVilketKontor = new javax.swing.JComboBox<>();
        btnAndraOCStatus = new javax.swing.JButton();
        btnAndraKCStatus = new javax.swing.JButton();
        lblOmråde = new javax.swing.JLabel();

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

        lblRegistreraAgent.setText("Ändra agentdata");

        lblRubrikRegd.setText("Registreringsdatum");

        lblRubrikNamn.setText("Namn - ange endast en bokstav");

        txtNamn.setColumns(6);

        lblRubrikLösen.setText("Lösenord");

        txtLösenord.setColumns(6);

        lblRubrikTelefon.setText("Telefonnummer");

        txtTelefon.setColumns(6);

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

        lblOC.setText("Är områdeschef");

        lblKC.setText("Är kontorschef");

        cbKC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKCActionPerformed(evt);
            }
        });

        lblVilketKontor.setText("Kontor");

        btnAndraOCStatus.setText("Ändra områdeschefsstatus");
        btnAndraOCStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraOCStatusActionPerformed(evt);
            }
        });

        btnAndraKCStatus.setText("Ändra kontorschefsstatus");
        btnAndraKCStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraKCStatusActionPerformed(evt);
            }
        });

        lblOmråde.setText("Område");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnOmRegistreraAgent))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRubrikLösen)
                    .addComponent(lblRubrikTelefon)
                    .addComponent(lblRubrikNamn)
                    .addComponent(lblRubrikRegd)
                    .addComponent(lblAgent)
                    .addComponent(lbRubrikID)
                    .addComponent(lblAdminstatus)
                    .addComponent(lblOmråde))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblvisaID)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbOmråden, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbAgentNamn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNamn, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtLösenord, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTelefon, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDatum, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbAdminstatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKC)
                                    .addComponent(lblOC))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbKC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAndraOCStatus))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblVilketKontor)
                                .addGap(18, 18, 18)
                                .addComponent(cbVilketKontor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAndraKCStatus)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgent)
                    .addComponent(cbAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOC)
                    .addComponent(cbOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRubrikID)
                    .addComponent(lblvisaID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikRegd)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKC)
                    .addComponent(cbKC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVilketKontor)
                    .addComponent(cbVilketKontor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRubrikLösen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAndraOCStatus)
                            .addComponent(btnAndraKCStatus))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRubrikTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdminstatus)
                    .addComponent(cbAdminstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbOmråden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btnOmRegistreraAgent)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblInloggadSom)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(574, 574, 574)
                                .addComponent(btnBacka))
                            .addComponent(lblRegistreraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAvsluta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLoggaut, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblInloggadSom)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoggaut)
                    .addComponent(lblRegistreraAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvsluta)
                    .addComponent(btnBacka))
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
        new AdminAgentInfo(användarnamn).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackaActionPerformed

    private void btnOmRegistreraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOmRegistreraAgentActionPerformed
        MetoderUnikaAdmin.ändraAgent(cbAgentNamn, lblvisaID, txtNamn, txtDatum, txtTelefon, txtLösenord, cbAdminstatus, cbOmråden);
    }//GEN-LAST:event_btnOmRegistreraAgentActionPerformed

    private void cbAgentNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAgentNamnActionPerformed
        MetoderUnikaAdmin.visaInformationAgent(cbAgentNamn, lblvisaID, txtNamn, txtDatum, txtTelefon, txtLösenord, cbAdminstatus, cbOmråden);
    }//GEN-LAST:event_cbAgentNamnActionPerformed

    private void cbKCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKCActionPerformed
        String valtVärde = GetMetoder.hamtaCbSträng(cbKC);
        if(valtVärde.equals("Ja")) {
        lblVilketKontor.setVisible(true);
        cbVilketKontor.setVisible(true);
        }
        else {
        lblVilketKontor.setVisible(false);
        cbVilketKontor.setVisible(false);
        }
    }//GEN-LAST:event_cbKCActionPerformed

    private void btnAndraKCStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraKCStatusActionPerformed
        MetoderUnikaAdmin.laggTillKontorsChef(cbVilketKontor, cbAgentNamn);
    }//GEN-LAST:event_btnAndraKCStatusActionPerformed

    private void btnAndraOCStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraOCStatusActionPerformed
        
        MetoderUnikaAdmin.laggTillOmrådesChef(cbAgentNamn, cbOmråden, cbOC);
        
    }//GEN-LAST:event_btnAndraOCStatusActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraKCStatus;
    private javax.swing.JButton btnAndraOCStatus;
    private javax.swing.JButton btnAvsluta;
    private javax.swing.JButton btnBacka;
    private javax.swing.JButton btnLoggaut;
    private javax.swing.JButton btnOmRegistreraAgent;
    private javax.swing.JComboBox<String> cbAdminstatus;
    private javax.swing.JComboBox<String> cbAgentNamn;
    private javax.swing.JComboBox<String> cbKC;
    private javax.swing.JComboBox<String> cbOC;
    private javax.swing.JComboBox<String> cbOmråden;
    private javax.swing.JComboBox<String> cbVilketKontor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbRubrikID;
    private javax.swing.JLabel lblAdminstatus;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblInloggadSom;
    private javax.swing.JLabel lblKC;
    private javax.swing.JLabel lblOC;
    private javax.swing.JLabel lblOmråde;
    private javax.swing.JLabel lblRegistreraAgent;
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
