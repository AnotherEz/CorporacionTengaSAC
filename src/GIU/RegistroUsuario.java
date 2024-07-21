package GIU;

import static Conexion.ConsultasApiReniec.consultarDni;
import static Clases.Cliente.ImprimirDatosC;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.io.IOException;
import Clases.Cliente;
import Conexion.ConsultasApiReniec;
import javax.swing.SwingWorker;


public class RegistroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    public RegistroUsuario() {
        initComponents();
         
    }

   private class ConsultarDniWorker extends SwingWorker<Void, Void> {
        private final String dni;
        private final Cliente clientecreadoconeldni;

        public ConsultarDniWorker(String dni, Cliente clientecreadoconeldni) {
            this.dni = dni;
            this.clientecreadoconeldni = clientecreadoconeldni;
        }

        protected Void doInBackground() throws Exception {
            try {
                ConsultasApiReniec.consultarDni(dni, clientecreadoconeldni);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        protected void done() {
            tf_nombres.setText(clientecreadoconeldni.getNombres());
            tf_firstLastName.setText(clientecreadoconeldni.getFirstLastName());
            tf_secondLastName.setText(clientecreadoconeldni.getSecondLastName());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_secondLastName = new javax.swing.JTextField();
        tf_firstLastName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_dni = new javax.swing.JTextField();
        tf_nombres = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(690, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Source Code Pro", 0, 20)); // NOI18N
        jLabel5.setText("TENGA S.A.C");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        jLabel6.setText("Apellido Materno");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));
        jPanel1.add(tf_secondLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 160, -1));
        jPanel1.add(tf_firstLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 160, -1));

        jLabel7.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        jLabel7.setText("NOMBRES");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        jLabel8.setText("Apellido Paterno");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

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
                    Cliente clientecreadoconeldni = new Cliente();
                    new ConsultarDniWorker(DNI, clientecreadoconeldni).execute();
                }
            }
        });
        tf_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dniActionPerformed(evt);
            }
        });
        jPanel1.add(tf_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 160, -1));
        jPanel1.add(tf_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, -1));

        jButton1.setText("Guardar Usuario");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo Usuario", "Administrador", "Cajero", "Vendedor", "Almacenero" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        jLabel9.setText("DNI");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 80));

        jButton2.setText("Limpiar campos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
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
    // End of variables declaration//GEN-END:variables
}
