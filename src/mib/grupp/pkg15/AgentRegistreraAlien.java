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
public class AgentRegistreraAlien extends javax.swing.JFrame {

    private String användarnamn;

    /**
     * Konstruktorn för AgentRegistreraAlien.
     *
     * @param användarnamn
     */
    public AgentRegistreraAlien(String användarnamn) {
        initComponents();
        this.användarnamn = användarnamn;
        FyllText.inloggadSom(lblInloggadSom, användarnamn);
        lblDagensDatum.setText(DatumHanterare.getDagensDatum());
        lblRasAttribut.setVisible(false);
        txtRasAttribut.setVisible(false);
        lblvisaID.setText(GetMetoder.getNextAlienID());
        ComboBoxar.fyllCBPlats(cbPlatser);
        ComboBoxar.fyllCBras(cbRaser);
        ComboBoxar.fyllCBAgentNamn(cbAgenter);

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
        lblRegistreraAlien = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblRubrikRegd = new javax.swing.JLabel();
        lblDagensDatum = new javax.swing.JLabel();
        lblRubrikNamn = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lblRubrikRas = new javax.swing.JLabel();
        cbRaser = new javax.swing.JComboBox<>();
        lblRubrikLösen = new javax.swing.JLabel();
        txtLösenord = new javax.swing.JPasswordField();
        lblRubrikTelefon = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        lblRubrikPlats = new javax.swing.JLabel();
        cbPlatser = new javax.swing.JComboBox<>();
        lblRubrikAgent = new javax.swing.JLabel();
        cbAgenter = new javax.swing.JComboBox<>();
        lblRasAttribut = new javax.swing.JLabel();
        txtRasAttribut = new javax.swing.JTextField();
        btnRegistreraAlien = new javax.swing.JButton();
        lbRubrikID = new javax.swing.JLabel();
        lblvisaID = new javax.swing.JLabel();

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

        lblRegistreraAlien.setText("Registrera alien");

        lblRubrikRegd.setText("Registreringsdatum");

        lblDagensDatum.setText("Dagens datum");

        lblRubrikNamn.setText("Namn");

        txtNamn.setColumns(5);

        lblRubrikRas.setText("Ras");

        cbRaser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRaserActionPerformed(evt);
            }
        });

        lblRubrikLösen.setText("Lösenord");

        txtLösenord.setColumns(5);

        lblRubrikTelefon.setText("Telefonnummer");

        txtTelefon.setColumns(5);

        lblRubrikPlats.setText("Plats");

        lblRubrikAgent.setText("Ansvarig Agent");

        lblRasAttribut.setText("Attribut");

        txtRasAttribut.setColumns(5);

        btnRegistreraAlien.setText("Slutför registrering");
        btnRegistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAlienActionPerformed(evt);
            }
        });

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
                            .addComponent(cbAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPlatser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblRasAttribut)
                                .addGap(18, 18, 18)
                                .addComponent(txtRasAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDagensDatum)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnRegistreraAlien)))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikRegd)
                    .addComponent(lblDagensDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikRas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(cbAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistreraAlien)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        lbRubrikID.setText("ID-nummer");

        lblvisaID.setText("ett ID");

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
                            .addComponent(lblRegistreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(0, 105, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblInloggadSom)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoggaut)
                    .addComponent(lblRegistreraAlien))
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

    private void btnRegistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAlienActionPerformed
        AgentMetoder.nyRegistreraAlien(lblvisaID, lblDagensDatum, txtNamn, cbRaser, txtLösenord, txtTelefon, cbPlatser, cbAgenter, txtRasAttribut);


    }//GEN-LAST:event_btnRegistreraAlienActionPerformed

    private void cbRaserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRaserActionPerformed
        String valdRas = Validera.hamtaCbSträng(cbRaser);
        if (valdRas.equals("Boglodite")) {
            lblRasAttribut.setText("Antal boogies");
            lblRasAttribut.setVisible(true);
            txtRasAttribut.setVisible(true);
        }
        if (valdRas.equals("Squid")) {
            lblRasAttribut.setText("Antal armar");
            lblRasAttribut.setVisible(true);
            txtRasAttribut.setVisible(true);
        }
        if (valdRas.equals("Worm")) {
            txtRasAttribut.setText("0");
            lblRasAttribut.setVisible(false);
            txtRasAttribut.setVisible(false);
        }
    }//GEN-LAST:event_cbRaserActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvsluta;
    private javax.swing.JButton btnBacka;
    private javax.swing.JButton btnLoggaut;
    private javax.swing.JButton btnRegistreraAlien;
    private javax.swing.JComboBox<String> cbAgenter;
    private javax.swing.JComboBox<String> cbPlatser;
    private javax.swing.JComboBox<String> cbRaser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbRubrikID;
    private javax.swing.JLabel lblDagensDatum;
    private javax.swing.JLabel lblInloggadSom;
    private javax.swing.JLabel lblRasAttribut;
    private javax.swing.JLabel lblRegistreraAlien;
    private javax.swing.JLabel lblRubrikAgent;
    private javax.swing.JLabel lblRubrikLösen;
    private javax.swing.JLabel lblRubrikNamn;
    private javax.swing.JLabel lblRubrikPlats;
    private javax.swing.JLabel lblRubrikRas;
    private javax.swing.JLabel lblRubrikRegd;
    private javax.swing.JLabel lblRubrikTelefon;
    private javax.swing.JLabel lblvisaID;
    private javax.swing.JPasswordField txtLösenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtRasAttribut;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
