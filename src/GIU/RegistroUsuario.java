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
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_sueldoBasico = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(690, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        jLabel6.setText("Sueldo Basico");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));
        jPanel1.add(tf_secondLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 160, -1));
        jPanel1.add(tf_firstLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 160, -1));

        jLabel7.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        jLabel7.setText("Cargo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        jLabel8.setText("Apellido Paterno");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

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
        jPanel1.add(tf_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 160, -1));
        jPanel1.add(tf_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 160, -1));

        btn_guardarUsuario.setText("Guardar Usuario");
        btn_guardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        cb_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo Usuario", "Administrador", "Cajero", "Vendedor", "Almacenero" }));
        cb_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_cargoActionPerformed(evt);
            }
        });
        jPanel1.add(cb_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 160, -1));

        jLabel9.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        jLabel9.setText("DNI");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jPanel2.setBackground(new java.awt.Color(17, 142, 191));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 80));

        jButton2.setText("Limpiar campos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jLabel10.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        jLabel10.setText("Nombres");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        jLabel11.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        jLabel11.setText("Apellido Materno");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));
        jPanel1.add(tf_sueldoBasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
