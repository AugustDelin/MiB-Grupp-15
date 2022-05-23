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
//    Fälten för AgentÄndraAlien.
public class AgentÄndraAlien extends javax.swing.JFrame {

    private String användarnamn;

    /**
     * Konstruktorn för AgentÄndraAlien.
     *
     * @param användarnamn
     */
    public AgentÄndraAlien(String användarnamn) {
        initComponents();
        this.användarnamn = användarnamn;
        FyllText.inloggadSom(lblInloggadSom, användarnamn);
        lblRasAttribut.setVisible(false);
        txtRasAttribut.setVisible(false);
        //lblvisaID.setText(GetMetoder.getNextAlienID());
        ComboBoxar.fyllCBAlienNamn(cbAlienNamn);
        ComboBoxar.fyllCBPlats(cbPlatser);
        ComboBoxar.fyllCBras(cbRas);
        ComboBoxar.fyllCBAgentNamn(cbAgent);

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
        lblÄndraAlien = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblRubrikRegd = new javax.swing.JLabel();
        lblRubrikNamn = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lblRubrikRas = new javax.swing.JLabel();
        cbRas = new javax.swing.JComboBox<>();
        lblRubrikLösen = new javax.swing.JLabel();
        txtLösenord = new javax.swing.JPasswordField();
        lblRubrikTelefon = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        lblRubrikPlats = new javax.swing.JLabel();
        cbPlatser = new javax.swing.JComboBox<>();
        lblRubrikAgent = new javax.swing.JLabel();
        cbAgent = new javax.swing.JComboBox<>();
        lblRasAttribut = new javax.swing.JLabel();
        txtRasAttribut = new javax.swing.JTextField();
        btnÄndraAlien = new javax.swing.JButton();
        txtDatum = new javax.swing.JTextField();
        lbRubrikID = new javax.swing.JLabel();
        lblvisaID = new javax.swing.JLabel();
        cbAlienNamn = new javax.swing.JComboBox<>();

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

        lblÄndraAlien.setText("Välj Alien:");

        lblRubrikRegd.setText("Registreringsdatum");

        lblRubrikNamn.setText("Namn");

        txtNamn.setColumns(5);
        txtNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamnActionPerformed(evt);
            }
        });

        lblRubrikRas.setText("Ras");

        cbRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRasActionPerformed(evt);
            }
        });

        lblRubrikLösen.setText("Lösenord");

        txtLösenord.setColumns(5);

        lblRubrikTelefon.setText("Telefonnummer");

        txtTelefon.setColumns(5);

        lblRubrikPlats.setText("Plats");

        cbPlatser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPlatserActionPerformed(evt);
            }
        });

        lblRubrikAgent.setText("Ansvarig Agent");

        cbAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAgentActionPerformed(evt);
            }
        });

        lblRasAttribut.setText("Attribut");

        txtRasAttribut.setColumns(5);

        btnÄndraAlien.setText("Ändra data");
        btnÄndraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraAlienActionPerformed(evt);
            }
        });

        txtDatum.setColumns(5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRubrikRegd)
                            .addComponent(lblRubrikNamn)
                            .addComponent(lblRubrikRas)
                            .addComponent(lblRubrikLösen)
                            .addComponent(lblRubrikTelefon)
                            .addComponent(lblRubrikPlats)
                            .addComponent(lblRubrikAgent))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblRasAttribut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRasAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPlatser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnÄndraAlien)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikRegd)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikRas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRasAttribut)
                    .addComponent(txtRasAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikLösen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPlatser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnÄndraAlien)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        lbRubrikID.setText("ID-nummer");

        lblvisaID.setText("ett ID");

        cbAlienNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlienNamnActionPerformed(evt);
            }
        });

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
                            .addComponent(btnBacka)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblÄndraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 509, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAvsluta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLoggaut, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbRubrikID)
                                .addGap(51, 51, 51)
                                .addComponent(lblvisaID))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 277, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblInloggadSom)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoggaut)
                    .addComponent(lblÄndraAlien)
                    .addComponent(cbAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRubrikID)
                    .addComponent(lblvisaID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvsluta)
                    .addComponent(btnBacka))
                .addGap(14, 14, 14))
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
    //    Knappen för att starta metoden Backa.
    private void btnBackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackaActionPerformed
        new AgentAlienInfo(användarnamn).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackaActionPerformed

    private void btnÄndraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraAlienActionPerformed
        MetoderAgentAdmin.ändraAlien(cbAlienNamn, lblvisaID, txtDatum, txtNamn, cbRas, txtLösenord, txtTelefon, cbPlatser, cbAgent, txtRasAttribut);
    }//GEN-LAST:event_btnÄndraAlienActionPerformed

    private void cbRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRasActionPerformed
        ComboBoxar.CBvaldAlienRas(cbRas, lblRasAttribut, txtRasAttribut);
//        String valdRas = Validera.hamtaCbSträng(cbRas);
//        if (valdRas.equals("Boglodite")) {
//            lblRasAttribut.setText("Antal boogies");
//            lblRasAttribut.setVisible(true);
//            txtRasAttribut.setVisible(true);
//            txtRasAttribut.setText("");
//        }
//        if (valdRas.equals("Squid")) {
//            lblRasAttribut.setText("Antal armar");
//            lblRasAttribut.setVisible(true);
//            txtRasAttribut.setVisible(true);
//            txtRasAttribut.setText("");
//        }
//        if (valdRas.equals("Worm")) {
//            txtRasAttribut.setText("1");
//            lblRasAttribut.setVisible(false);
//            txtRasAttribut.setVisible(false);
//        }
    }//GEN-LAST:event_cbRasActionPerformed

    private void cbAlienNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlienNamnActionPerformed
        MetoderAgentAdmin.visaInformationAlien(cbAlienNamn, lblvisaID,txtDatum,txtNamn, cbRas, txtLösenord, txtTelefon, cbPlatser, cbAgent, txtRasAttribut);
    }//GEN-LAST:event_cbAlienNamnActionPerformed

    private void txtNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamnActionPerformed

    private void cbPlatserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPlatserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPlatserActionPerformed

    private void cbAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAgentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvsluta;
    private javax.swing.JButton btnBacka;
    private javax.swing.JButton btnLoggaut;
    private javax.swing.JButton btnÄndraAlien;
    private javax.swing.JComboBox<String> cbAgent;
    private javax.swing.JComboBox<String> cbAlienNamn;
    private javax.swing.JComboBox<String> cbPlatser;
    private javax.swing.JComboBox<String> cbRas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbRubrikID;
    private javax.swing.JLabel lblInloggadSom;
    private javax.swing.JLabel lblRasAttribut;
    private javax.swing.JLabel lblRubrikAgent;
    private javax.swing.JLabel lblRubrikLösen;
    private javax.swing.JLabel lblRubrikNamn;
    private javax.swing.JLabel lblRubrikPlats;
    private javax.swing.JLabel lblRubrikRas;
    private javax.swing.JLabel lblRubrikRegd;
    private javax.swing.JLabel lblRubrikTelefon;
    private javax.swing.JLabel lblvisaID;
    private javax.swing.JLabel lblÄndraAlien;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JPasswordField txtLösenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtRasAttribut;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
