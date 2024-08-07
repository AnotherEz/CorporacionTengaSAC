package GIU.Almacenero;

import static Conexion.ConsultasApiReniec.consultarDni;
import static Clases.Cliente.ImprimirDatosC;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.io.IOException;
import Clases.Trabajador;
import Clases.Usuario;
import java.lang.Integer;
import Conexion.ConsultasApiReniec;
import java.awt.Color;
import java.awt.Point;
import javax.swing.SwingWorker;


public class PanelAlmacenero extends javax.swing.JFrame {
    Trabajador usuariocondatosreniec = new Trabajador();
    private Point initialClick;
    public PanelAlmacenero() {
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
            tf_nombres.setText(usuariocondatosreniec.getNombres());
            tf_firstLastName.setText(usuariocondatosreniec.getFirstLastName());
            tf_secondLastName.setText(usuariocondatosreniec.getSecondLastName());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tf_secondLastName = new javax.swing.JTextField();
        tf_firstLastName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_dni = new javax.swing.JTextField();
        tf_nombres = new javax.swing.JTextField();
        btn_guardarUsuario = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panel_x = new javax.swing.JPanel();
        jl_BotonX = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(80, 20));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_secondLastName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_secondLastName.setBorder(null);
        jPanel1.add(tf_secondLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 160, -1));

        tf_firstLastName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_firstLastName.setBorder(null);
        jPanel1.add(tf_firstLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 160, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel8.setText("Apellido Paterno");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));

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
        jPanel1.add(tf_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 160, -1));

        btn_guardarUsuario.setText("Guardar Usuario");
        btn_guardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setText("DNI");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel10.setText("Nombres");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, 20));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel11.setText("Apellido Materno");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, -1));

        jPanel2.setBackground(new java.awt.Color(25, 53, 89));
        jPanel2.setPreferredSize(new java.awt.Dimension(1150, 40));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        panel_x.setBackground(new java.awt.Color(25, 53, 89));
        panel_x.setPreferredSize(new java.awt.Dimension(40, 40));

        jl_BotonX.setFont(new java.awt.Font("Aero Matics", 1, 36)); // NOI18N
        jl_BotonX.setText("X");
        jl_BotonX.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jl_BotonXFocusGained(evt);
            }
        });
        jl_BotonX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_BotonXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_BotonXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_BotonXMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_xLayout = new javax.swing.GroupLayout(panel_x);
        panel_x.setLayout(panel_xLayout);
        panel_xLayout.setHorizontalGroup(
            panel_xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_xLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_BotonX)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        panel_xLayout.setVerticalGroup(
            panel_xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_xLayout.createSequentialGroup()
                .addComponent(jl_BotonX)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 1110, Short.MAX_VALUE)
                .addComponent(panel_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel4.setText("_______________________________________________________");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel15.setText("_______________________________________________________");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel16.setText("_______________________________________________________");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel17.setText("_______________________________________________________");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, -1, -1));

        jLabel1.setText("Ingrese numero de pedido:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 230, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 700, 190));

        jPanel3.setBackground(new java.awt.Color(25, 53, 89));
        jPanel3.setPreferredSize(new java.awt.Dimension(40, 700));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_menu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(659, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dniActionPerformed

    private void btn_guardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarUsuarioActionPerformed
    tf_dni.setText("");
    tf_nombres.setText("");
    tf_firstLastName.setText("");
    tf_secondLastName.setText("");
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
    
    // Verificar la longitud del texto actual
    if (tf_dni.getText().length() >= 8) {
        evt.consume();  // Ignorar si ya hay 8 caracteres
    }
    }//GEN-LAST:event_tf_dniKeyTyped

    private void jl_BotonXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_BotonXMouseClicked
        
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jl_BotonXMouseClicked

    private void jl_BotonXFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jl_BotonXFocusGained
       
    }//GEN-LAST:event_jl_BotonXFocusGained

    private void jl_BotonXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_BotonXMouseEntered
        // TODO add your handling code here:
         // TODO add your handling code here:
        panel_x.setBackground(Color.RED);
                // Cambia el color del texto del JLabel a blanco
        jl_BotonX.setForeground(Color.WHITE);
    }//GEN-LAST:event_jl_BotonXMouseEntered

    private void jl_BotonXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_BotonXMouseExited
        // TODO add your handling code here:
         // TODO add your handling code here:
        panel_x.setBackground(new Color(25,53,89));
                // Cambia el color del texto del JLabel a blanco
        jl_BotonX.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jl_BotonXMouseExited

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
         initialClick = evt.getPoint();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
                int x = getLocation().x;
                int y = getLocation().y;

                // Calcula la nueva posición del JFrame
                int newX = x + evt.getX() - initialClick.x;
                int newY = y + evt.getY() - initialClick.y;

                // Mueve el JFrame a la nueva posición
                setLocation(newX, newY);  
    }//GEN-LAST:event_jPanel2MouseDragged

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
            java.util.logging.Logger.getLogger(PanelAlmacenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAlmacenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAlmacenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAlmacenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new PanelAlmacenero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jl_BotonX;
    private javax.swing.JPanel panel_x;
    private javax.swing.JTextField tf_dni;
    private javax.swing.JTextField tf_firstLastName;
    private javax.swing.JTextField tf_nombres;
    private javax.swing.JTextField tf_secondLastName;
    // End of variables declaration//GEN-END:variables
}
