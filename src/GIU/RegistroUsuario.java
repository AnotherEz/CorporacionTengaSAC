package GIU;

import static Conexion.ConsultasApiReniec.consultarDni;
import static Clases.Cliente.ImprimirDatosC;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.io.IOException;
import Clases.Trabajador;
import Clases.Usuario;
import java.lang.Integer;
import Conexion.ConsultasApiReniec;
import javax.swing.SwingWorker;


public class RegistroUsuario extends javax.swing.JFrame {
    Trabajador usuariocondatosreniec = new Trabajador();
    
    public RegistroUsuario() {
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
        jLabel6 = new javax.swing.JLabel();
        tf_secondLastName = new javax.swing.JTextField();
        tf_firstLastName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_dni = new javax.swing.JTextField();
        tf_nombres = new javax.swing.JTextField();
        btn_guardarUsuario = new javax.swing.JButton();
        cb_cargo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_sueldoBasico = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setText("Sueldo Basico");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        tf_secondLastName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_secondLastName.setBorder(null);
        jPanel1.add(tf_secondLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 160, -1));

        tf_firstLastName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_firstLastName.setBorder(null);
        jPanel1.add(tf_firstLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 160, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setText("Cargo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel8.setText("Apellido Paterno");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

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
                    String cargo= cb_cargo.getSelectedItem().toString();
                    usuariocondatosreniec.setCargo(cargo);
                    try {
                        int sueldoBasico = Integer.parseInt(tf_sueldoBasico.getText());
                        usuariocondatosreniec.setSueldoBasico(sueldoBasico);
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
        jPanel1.add(tf_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 160, -1));

        tf_nombres.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_nombres.setBorder(null);
        jPanel1.add(tf_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 160, -1));

        btn_guardarUsuario.setText("Guardar Usuario");
        btn_guardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, -1));

        cb_cargo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cb_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo Usuario", "Administrador", "Cajero", "Vendedor", "Almacenero" }));
        cb_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_cargoActionPerformed(evt);
            }
        });
        jPanel1.add(cb_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 160, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setText("DNI");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jButton2.setText("Limpiar campos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel10.setText("Nombres");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 20));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel11.setText("Apellido Materno");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        tf_sueldoBasico.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_sueldoBasico.setBorder(null);
        jPanel1.add(tf_sueldoBasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 160, -1));

        jPanel2.setBackground(new java.awt.Color(25, 53, 89));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Registro de Usuario - Sistema de Gestión de Seguridad Electrónica");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel13)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 90));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel12.setText("Todos los campos son obligatorios.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel14.setText("Por favor, complete los siguientes campos para registrar un nuevo usuario en el sistema.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel4.setText("_______________________________________________________");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel5.setText("_______________________________________________________");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel15.setText("_______________________________________________________");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel16.setText("_______________________________________________________");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel17.setText("_______________________________________________________");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dniActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cb_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_cargoActionPerformed

    private void btn_guardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarUsuarioActionPerformed
    tf_dni.setText("");
    tf_nombres.setText("");
    tf_firstLastName.setText("");
    tf_secondLastName.setText("");
    tf_sueldoBasico.setText("");
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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardarUsuario;
    private javax.swing.JComboBox<String> cb_cargo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tf_dni;
    private javax.swing.JTextField tf_firstLastName;
    private javax.swing.JTextField tf_nombres;
    private javax.swing.JTextField tf_secondLastName;
    private javax.swing.JTextField tf_sueldoBasico;
    // End of variables declaration//GEN-END:variables
}
