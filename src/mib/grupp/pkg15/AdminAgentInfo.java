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
// Fälten för AdminAgentInfo.
public class AdminAgentInfo extends javax.swing.JFrame {

    private String användarnamn;

    /**
     * Konstruktorn för AdminAgentInfo.
     */
    public AdminAgentInfo(String användarnamn) {
        initComponents();
        this.användarnamn = användarnamn;
        cbAgentNamn.setVisible(false);
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
        txtAreaListaAgenter = new javax.swing.JTextArea();
        btnBacka = new javax.swing.JButton();
        btnAvsluta = new javax.swing.JButton();
        btnLoggaUt = new javax.swing.JButton();
        lblInloggadSom = new javax.swing.JLabel();
        btnSokAgent = new javax.swing.JButton();
        cbAgentNamn = new javax.swing.JComboBox<>();
        btnRegistreraAgent = new javax.swing.JButton();
        btnÄndraAgent = new javax.swing.JButton();
        btnTaBortAgent = new javax.swing.JButton();
        lblFörklaring1 = new javax.swing.JLabel();
        lblFörklaring2 = new javax.swing.JLabel();
        lblFörklaring3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreaListaAgenter.setEditable(false);
        txtAreaListaAgenter.setColumns(20);
        txtAreaListaAgenter.setRows(5);
        jScrollPane2.setViewportView(txtAreaListaAgenter);

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

        btnSokAgent.setText("Sök agent");
        btnSokAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAgentActionPerformed(evt);
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

        btnÄndraAgent.setText("Ändra agent information");
        btnÄndraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraAgentActionPerformed(evt);
            }
        });

        btnTaBortAgent.setText("Ta bort vald agent");
        btnTaBortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAgentActionPerformed(evt);
            }
        });

        lblFörklaring1.setText("För att ta bort en agent ur systemet");

        lblFörklaring2.setText("välj sök agent och markera den agent du vill ta bort");

        lblFörklaring3.setText("och tryck sedan på knappen \"Ta bort agent ur systemet\".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblInloggadSom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoggaUt))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnRegistreraAgent)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnÄndraAgent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addGap(365, 365, 365)
                .addComponent(btnSokAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBacka)
                        .addGap(375, 375, 375)
                        .addComponent(btnAvsluta))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTaBortAgent)
                            .addComponent(lblFörklaring1))
                        .addGap(60, 60, 60)
                        .addComponent(cbAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFörklaring3)
                            .addComponent(lblFörklaring2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInloggadSom)
                    .addComponent(btnLoggaUt))
                .addGap(3, 3, 3)
                .addComponent(btnRegistreraAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnÄndraAgent)
                    .addComponent(btnSokAgent))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTaBortAgent))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFörklaring1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFörklaring2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFörklaring3)
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBacka)
                            .addComponent(btnAvsluta)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
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

   if(cbAgentNamn.getSelectedItem() == null)
   {
       JOptionPane.showMessageDialog(null, "Vänligen välj en agent först!");
   }
   else MetoderUnikaAdmin.taBortAgentUrSystemet(cbAgentNamn);
   
    }//GEN-LAST:event_btnTaBortAgentActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvsluta;
    private javax.swing.JButton btnBacka;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnRegistreraAgent;
    private javax.swing.JButton btnSokAgent;
    private javax.swing.JButton btnTaBortAgent;
    private javax.swing.JButton btnÄndraAgent;
    private javax.swing.JComboBox<String> cbAgentNamn;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFörklaring1;
    private javax.swing.JLabel lblFörklaring2;
    private javax.swing.JLabel lblFörklaring3;
    private javax.swing.JLabel lblInloggadSom;
    private javax.swing.JTextArea txtAreaListaAgenter;
    // End of variables declaration//GEN-END:variables
}
