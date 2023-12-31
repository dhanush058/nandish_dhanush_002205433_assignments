/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui; 

import javax.swing.JOptionPane;
import model.Product;

/**
 *
 * @author User
 */
public class CreatePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatientJPanel
     */
    Product product;
    public CreatePatientJPanel(Product product) {
        initComponents();
        this.product=product;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPatientName = new javax.swing.JLabel();
        lblPatientid = new javax.swing.JLabel();
        lblPrimaryDoctor = new javax.swing.JLabel();
        lblDateofLastVisit = new javax.swing.JLabel();
        lblNextDateofVisit = new javax.swing.JLabel();
        lblReasonForVisit = new javax.swing.JLabel();
        lblTreatment = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientid = new javax.swing.JTextField();
        txtPrimaryDoctor = new javax.swing.JTextField();
        txtDateOfLastVisit = new javax.swing.JTextField();
        txtDateOfNextVisit = new javax.swing.JTextField();
        txtReasonForVisit = new javax.swing.JTextField();
        txtTreatmentUndergone = new javax.swing.JTextField();
        btnSavePatient = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        lblPatientName.setText("Patient Name:");

        lblPatientid.setText("Patient ID:");

        lblPrimaryDoctor.setText("Primary Doctor:");

        lblDateofLastVisit.setText("Date of Last Visit:");

        lblNextDateofVisit.setText("Date of Next Visit:");

        lblReasonForVisit.setText("Reason for Visit:");

        lblTreatment.setText("Treatment Undergone:");

        txtPatientName.setBackground(new java.awt.Color(0, 204, 204));

        txtPatientid.setBackground(new java.awt.Color(0, 204, 204));
        txtPatientid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientidActionPerformed(evt);
            }
        });

        txtPrimaryDoctor.setBackground(new java.awt.Color(0, 204, 204));
        txtPrimaryDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimaryDoctorActionPerformed(evt);
            }
        });

        txtDateOfLastVisit.setBackground(new java.awt.Color(0, 204, 204));
        txtDateOfLastVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfLastVisitActionPerformed(evt);
            }
        });

        txtDateOfNextVisit.setBackground(new java.awt.Color(0, 204, 204));
        txtDateOfNextVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfNextVisitActionPerformed(evt);
            }
        });

        txtReasonForVisit.setBackground(new java.awt.Color(0, 204, 204));
        txtReasonForVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReasonForVisitActionPerformed(evt);
            }
        });

        txtTreatmentUndergone.setBackground(new java.awt.Color(0, 204, 204));
        txtTreatmentUndergone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTreatmentUndergoneActionPerformed(evt);
            }
        });

        btnSavePatient.setBackground(new java.awt.Color(102, 255, 255));
        btnSavePatient.setText("Save");
        btnSavePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPatientName)
                            .addComponent(lblPatientid)
                            .addComponent(lblPrimaryDoctor)
                            .addComponent(lblDateofLastVisit)
                            .addComponent(lblNextDateofVisit)
                            .addComponent(lblReasonForVisit))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtReasonForVisit, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDateOfNextVisit, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDateOfLastVisit, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrimaryDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientid, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTreatment)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTreatmentUndergone, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSavePatient)
                                .addGap(106, 106, 106)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientName)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientid)
                    .addComponent(txtPatientid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimaryDoctor)
                    .addComponent(txtPrimaryDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateofLastVisit)
                    .addComponent(txtDateOfLastVisit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNextDateofVisit)
                    .addComponent(txtDateOfNextVisit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReasonForVisit)
                    .addComponent(txtReasonForVisit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTreatment)
                    .addComponent(txtTreatmentUndergone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSavePatient)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientidActionPerformed

    private void txtPrimaryDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimaryDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimaryDoctorActionPerformed

    private void txtDateOfLastVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfLastVisitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfLastVisitActionPerformed

    private void txtDateOfNextVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfNextVisitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfNextVisitActionPerformed

    private void txtReasonForVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReasonForVisitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReasonForVisitActionPerformed

    private void txtTreatmentUndergoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTreatmentUndergoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTreatmentUndergoneActionPerformed

    private void btnSavePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePatientActionPerformed
        // TODO add your handling code here:
        product.setPatientname(txtPatientName.getText());
        product.setPatientid(txtPatientid.getText());
        product.setPrimarydoctor(txtPrimaryDoctor.getText());
        product.setDateoflastvisit(txtDateOfLastVisit.getText());
        product.setNextdateofvisit(txtDateOfNextVisit.getText());
        product.setReasonforvisit(txtReasonForVisit.getText());
        product.setTreatmentundergoing(txtTreatmentUndergone.getText());
        JOptionPane.showMessageDialog(this,"Information Saved");
    }//GEN-LAST:event_btnSavePatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSavePatient;
    private javax.swing.JLabel lblDateofLastVisit;
    private javax.swing.JLabel lblNextDateofVisit;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientid;
    private javax.swing.JLabel lblPrimaryDoctor;
    private javax.swing.JLabel lblReasonForVisit;
    private javax.swing.JLabel lblTreatment;
    private javax.swing.JTextField txtDateOfLastVisit;
    private javax.swing.JTextField txtDateOfNextVisit;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientid;
    private javax.swing.JTextField txtPrimaryDoctor;
    private javax.swing.JTextField txtReasonForVisit;
    private javax.swing.JTextField txtTreatmentUndergone;
    // End of variables declaration//GEN-END:variables
}
