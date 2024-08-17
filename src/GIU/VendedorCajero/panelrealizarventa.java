package GIU.VendedorCajero;

import static Conexion.ConsultasApiReniec.consultarDni;
import static Conexion.ConsultasApiReniec.consultarRUC;
import static Clases.Cliente.ImprimirDatosC;
import Clases.Empresa;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.io.IOException;
import Clases.Trabajador;
import Clases.Usuario;
import java.lang.Integer;
import Conexion.ConsultasApiReniec;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.Point;
import javax.swing.SwingWorker;


public class panelrealizarventa extends javax.swing.JFrame {
    Trabajador usuariocondatosreniec = new Trabajador();
    Empresa empresa = new Empresa();
    
    GridBagConstraints gbc = new GridBagConstraints();
    
   // vendedor_menu_pop_1 pop_vendedor_menu=new vendedor_menu_pop_1();
   // vendedor_menu_pop_2 pop_2= new vendedor_menu_pop_2();
    private Point initialClick;
     Dimension expandedSize = new Dimension(262, 660);
     Dimension originalSize= new Dimension(45, 660);
    public panelrealizarventa() {
        initComponents();
    }
    
//Esta clase es para que la consulta se haga en un hilo diferente y se actualicen los textFields sin retraso en la interface de usuario
   private class ConsultarDniWorker extends SwingWorker<Void, Void> {
        private final String dni;
        private final Trabajador usuariocondatosreniec;

        public ConsultarDniWorker(String dni, Trabajador usuariocondatosreniec) {
            this.dni = dni;
            this.usuariocondatosreniec = usuariocondatosreniec;
        }

        protected Void doInBackground() throws Exception {
            ConsultasApiReniec.consultarDni(dni, usuariocondatosreniec);
            return null;
        }

        protected void done() {
            tf_nombres.setText(usuariocondatosreniec.getNombres()+" "+usuariocondatosreniec.getFirstLastName()+" "+ usuariocondatosreniec.getSecondLastName());
            
        }
    }
   
    private class ConsultarRUCWorker extends SwingWorker<Void, Void> {
        private final String RUC;
        private final Empresa empresa;

        public ConsultarRUCWorker(String RUC, Empresa empresa) {
            this.RUC = RUC;
            this.empresa = empresa;
        }

        protected Void doInBackground() throws Exception {
            ConsultasApiReniec.consultarRUC(RUC, empresa);
            return null;
        }

        protected void done() {
            tf_nombres.setText(empresa.getNombre());
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        tf_dni = new javax.swing.JTextField();
        tf_nombres = new javax.swing.JTextField();
        btn_guardarUsuario = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(80, 20));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 700));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_dni.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_dni.setBorder(null);
        tf_dni.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                handleTextChange();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                handleTextChange();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Not needed for plain text components
            }

            private void handleTextChange() {
                if (tf_dni.getText().length() == 8) {
                    // Realiza la acción deseada
                    String DNI = tf_dni.getText();

                    try {

                    }catch (NumberFormatException e) {
                        // Manejo de la excepción: el campo está vacío o no es un número válido
                        // Puedes mostrar un mensaje de error o realizar alguna otra acción aquí

                    }
                    new ConsultarDniWorker(DNI, usuariocondatosreniec).execute();
                    //por alguna razon no deja usar el metodo
                    //informacionTrabajador(usuariocondatosreniec);
                }else if(tf_dni.getText().length() == 11){
                    // Realiza la acción deseada
                    String RUC = tf_dni.getText();

                    try {

                    }catch (NumberFormatException e) {
                        // Manejo de la excepción: el campo está vacío o no es un número válido
                        // Puedes mostrar un mensaje de error o realizar alguna otra acción aquí

                    }
                    new ConsultarRUCWorker(RUC, empresa).execute();
                    //por alguna razon no deja usar el metodo
                    //informacionTrabajador(usuariocondatosreniec);

                }
            }
        });
        tf_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dniActionPerformed(evt);
            }
        });
        tf_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_dniKeyTyped(evt);
            }
        });
        jPanel1.add(tf_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 160, -1));

        tf_nombres.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_nombres.setBorder(null);
        jPanel1.add(tf_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 350, -1));

        btn_guardarUsuario.setText("Guardar Usuario");
        btn_guardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setText("DNI/RUC");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel10.setText("Nombre/Razon Social");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel4.setText("_______________________________________________________________________________________________________________________");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel15.setText("_______________________________________________________");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        jLabel1.setText("Ingrese numero de pedido:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 230, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IdPedido", "DNI / RUC", "Nombre / Razon Social", "Comprobante de pago", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 700, 250));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarUsuarioActionPerformed
        tf_dni.setText("");
        tf_nombres.setText("");
        tf_dni.requestFocus();
        System.out.println("Usuario guardado");
        System.out.println();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarUsuarioActionPerformed

    private void tf_dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_dniKeyTyped

        // TODO add your handling code here:
        char c = evt.getKeyChar();

        // Verificar si el carácter es un dígito
        if (!Character.isDigit(c)) {
            evt.consume();  // Ignorar la entrada no numérica
        }
        
        //Aqui es para vaciar el texto cuando sobrepase los 8 caracteres detectando que es RUC y no un DNI
         if ((tf_dni.getText().length() >= 8 & tf_dni.getText().length() <11) || tf_dni.getText().length()==0) {
            tf_nombres.setText("");
        }
        // Verificar la longitud del texto actual
        if (tf_dni.getText().length() >= 11) {
            evt.consume();  // Ignorar si ya hay 8 caracteres
        }
    }//GEN-LAST:event_tf_dniKeyTyped

    private void tf_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dniActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
      //  PanelMenuPop.remove(pop_vendedor_menu);
        //PanelPopVendedor.setVisible(true);
        //Contenedor_PanelMenuPop.revalidate();
       // Contenedor_PanelMenuPop.repaint();
       //Contenedor_PanelMenuPop.setPreferredSize(originalSize);
    }//GEN-LAST:event_jPanel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(panelrealizarventa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelrealizarventa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelrealizarventa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelrealizarventa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panelrealizarventa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tf_dni;
    private javax.swing.JTextField tf_nombres;
    // End of variables declaration//GEN-END:variables
}
