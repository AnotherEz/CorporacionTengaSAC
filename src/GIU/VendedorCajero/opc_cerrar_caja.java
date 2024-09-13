/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GIU.VendedorCajero;

/**
 *
 * @author Eduardo Fernandez
 */
public class opc_cerrar_caja extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public opc_cerrar_caja() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jl_text2 = new javax.swing.JLabel();
        jl_text1 = new javax.swing.JLabel();
        jl_copyrigth = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1150, 660));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_text2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jl_text2.setText("Comencemos un día productivo. ¿Qué tarea deseas realizar?");
        jPanel3.add(jl_text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 101, -1, -1));

        jl_text1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jl_text1.setText("Cerrar Caja");
        jPanel3.add(jl_text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jl_copyrigth.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jl_copyrigth.setText("© 2024  Todos los derechos reservados.");
        jPanel3.add(jl_copyrigth, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jl_copyrigth;
    private javax.swing.JLabel jl_text1;
    private javax.swing.JLabel jl_text2;
    // End of variables declaration//GEN-END:variables
}
