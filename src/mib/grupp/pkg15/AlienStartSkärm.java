/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.grupp.pkg15;

import oru.inf.InfDB;

/**
 *
 * @author erike
 */
public class AlienStartSkärm extends javax.swing.JFrame {
    private String användarnamn;

    /**
     * Creates new form AlienStartSkärm
     */
    public AlienStartSkärm(String användarnamn) {
        initComponents();
        this.användarnamn = användarnamn;
        lblRubrik.setText("Välkommen: " + användarnamn);
        AlienMetoder.visaOC(lblMinOc, användarnamn);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        lblMinSida = new javax.swing.JLabel();
        lblMinOc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRubrik.setText("Välkommen");

        lblMinSida.setText("Mina sida");

        lblMinOc.setText("Min områdeschef är:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMinOc)
                    .addComponent(lblMinSida)
                    .addComponent(lblRubrik))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblRubrik)
                .addGap(18, 18, 18)
                .addComponent(lblMinSida)
                .addGap(18, 18, 18)
                .addComponent(lblMinOc)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblMinOc;
    private javax.swing.JLabel lblMinSida;
    private javax.swing.JLabel lblRubrik;
    // End of variables declaration//GEN-END:variables
}
