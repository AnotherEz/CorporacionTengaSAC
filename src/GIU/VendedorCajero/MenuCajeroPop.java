/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GIU.VendedorCajero;

import java.awt.Color;

/**
 *
 * @author Eduardo Fernandez
 */
public class MenuCajeroPop extends javax.swing.JPanel {

    /**
     * Creates new form MenuCajeroPop
     */
    public MenuCajeroPop() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panel_btn_consultarVentas = new javax.swing.JPanel();
        btn_consultarVentas = new javax.swing.JLabel();
        panel_btn_cierreCaja = new javax.swing.JPanel();
        btn_cierreCaja = new javax.swing.JLabel();
        panel_btn_nuevaVenta = new javax.swing.JPanel();
        btn_nuevaVenta = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(260, 700));

        jPanel2.setBackground(new java.awt.Color(17, 141, 192));
        jPanel2.setPreferredSize(new java.awt.Dimension(260, 700));

        panel_btn_consultarVentas.setBackground(new java.awt.Color(17, 141, 192));
        panel_btn_consultarVentas.setPreferredSize(new java.awt.Dimension(270, 40));

        btn_consultarVentas.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_consultarVentas.setForeground(new java.awt.Color(255, 255, 255));
        btn_consultarVentas.setText("          Consultar Ventas");
        btn_consultarVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_consultarVentasMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panel_btn_consultarVentasLayout = new javax.swing.GroupLayout(panel_btn_consultarVentas);
        panel_btn_consultarVentas.setLayout(panel_btn_consultarVentasLayout);
        panel_btn_consultarVentasLayout.setHorizontalGroup(
            panel_btn_consultarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_consultarVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        panel_btn_consultarVentasLayout.setVerticalGroup(
            panel_btn_consultarVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_consultarVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_btn_cierreCaja.setBackground(new java.awt.Color(17, 141, 192));
        panel_btn_cierreCaja.setPreferredSize(new java.awt.Dimension(270, 40));

        btn_cierreCaja.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_cierreCaja.setForeground(new java.awt.Color(255, 255, 255));
        btn_cierreCaja.setText("             Cierre de caja");
        btn_cierreCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cierreCajaMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panel_btn_cierreCajaLayout = new javax.swing.GroupLayout(panel_btn_cierreCaja);
        panel_btn_cierreCaja.setLayout(panel_btn_cierreCajaLayout);
        panel_btn_cierreCajaLayout.setHorizontalGroup(
            panel_btn_cierreCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_cierreCaja, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        panel_btn_cierreCajaLayout.setVerticalGroup(
            panel_btn_cierreCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_cierreCaja, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_btn_nuevaVenta.setBackground(new java.awt.Color(17, 141, 192));
        panel_btn_nuevaVenta.setPreferredSize(new java.awt.Dimension(270, 40));

        btn_nuevaVenta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_nuevaVenta.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevaVenta.setText("              Nueva venta");
        btn_nuevaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_nuevaVentaMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panel_btn_nuevaVentaLayout = new javax.swing.GroupLayout(panel_btn_nuevaVenta);
        panel_btn_nuevaVenta.setLayout(panel_btn_nuevaVentaLayout);
        panel_btn_nuevaVentaLayout.setHorizontalGroup(
            panel_btn_nuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_nuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        panel_btn_nuevaVentaLayout.setVerticalGroup(
            panel_btn_nuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_nuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_btn_consultarVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panel_btn_nuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panel_btn_cierreCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(panel_btn_consultarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_btn_nuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_btn_cierreCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consultarVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_consultarVentasMouseEntered
        // TODO add your handling code here:
        btn_consultarVentas.setForeground(Color.WHITE);
        panel_btn_consultarVentas.setBackground(new Color(6,199,242));
    }//GEN-LAST:event_btn_consultarVentasMouseEntered

    private void btn_nuevaVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevaVentaMouseEntered
        // TODO add your handling code here:
         btn_nuevaVenta.setForeground(Color.WHITE);
        panel_btn_nuevaVenta.setBackground(new Color(6,199,242));
    }//GEN-LAST:event_btn_nuevaVentaMouseEntered

    private void btn_cierreCajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cierreCajaMouseEntered
        // TODO add your handling code here:
         btn_cierreCaja.setForeground(Color.WHITE);
        panel_btn_cierreCaja.setBackground(new Color(6,199,242));
    }//GEN-LAST:event_btn_cierreCajaMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_cierreCaja;
    private javax.swing.JLabel btn_consultarVentas;
    private javax.swing.JLabel btn_nuevaVenta;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel_btn_cierreCaja;
    private javax.swing.JPanel panel_btn_consultarVentas;
    private javax.swing.JPanel panel_btn_nuevaVenta;
    // End of variables declaration//GEN-END:variables
}
