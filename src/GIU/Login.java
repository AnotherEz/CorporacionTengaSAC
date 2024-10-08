package GIU;
import Conexion.ConsultasDatabase;
import GIU.Admi.PanelAdministradorPrincipal;
import GIU.Almacenero.PanelAlmaceneroPrincipal;
import GIU.VendedorCajero.PanelVendedorPrincipal;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    private boolean check_box=false;
    ConsultasDatabase consulta=new ConsultasDatabase();
    String Cargo;
    private Point initialClick;
    ConsultasDatabase authService= new ConsultasDatabase();
    
    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBase = new javax.swing.JPanel();
        tf_user = new javax.swing.JTextField();
        jl_copyrigth = new javax.swing.JLabel();
        Icon_Logo_head = new javax.swing.JLabel();
        jl_fondo_panel = new javax.swing.JLabel();
        jl_olvidasteContraseña = new javax.swing.JLabel();
        jl_password = new javax.swing.JLabel();
        jl_user = new javax.swing.JLabel();
        jl_bienvenida_text1 = new javax.swing.JLabel();
        jl_bienvenida_text2 = new javax.swing.JLabel();
        subrayadoTextFields1 = new javax.swing.JLabel();
        subrayadoTextFields2 = new javax.swing.JLabel();
        tf_pass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        panel_x = new javax.swing.JPanel();
        jl_BotonX = new javax.swing.JLabel();
        Texto_autenticacion = new javax.swing.JLabel();
        panel_boton_login = new javax.swing.JPanel();
        jl_boton_login = new javax.swing.JLabel();
        chk_mostrarPass = new javax.swing.JCheckBox();
        jl_bienvenida_text5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(80, 20));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1150, 700));
        setResizable(false);

        PanelBase.setBackground(new java.awt.Color(255, 255, 255));
        PanelBase.setMinimumSize(new java.awt.Dimension(760, 520));
        PanelBase.setPreferredSize(new java.awt.Dimension(1150, 700));
        PanelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_user.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tf_user.setBorder(null);
        tf_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_userFocusLost(evt);
            }
        });
        tf_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_userActionPerformed(evt);
            }
        });
        PanelBase.add(tf_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 230, -1));

        jl_copyrigth.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jl_copyrigth.setText("© 2024  Todos los derechos reservados.");
        PanelBase.add(jl_copyrigth, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, -1, -1));

        Icon_Logo_head.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logotipo_TengaSAC-326X130px.png"))); // NOI18N
        PanelBase.add(Icon_Logo_head, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jl_fondo_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/panel_camera_413x660px.jpg"))); // NOI18N
        jl_fondo_panel.setMaximumSize(new java.awt.Dimension(275, 440));
        jl_fondo_panel.setMinimumSize(new java.awt.Dimension(275, 440));
        PanelBase.add(jl_fondo_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, -1, -1));

        jl_olvidasteContraseña.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jl_olvidasteContraseña.setText("¿Olvidaste tu contraseña?");
        jl_olvidasteContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_olvidasteContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_olvidasteContraseñaMouseExited(evt);
            }
        });
        PanelBase.add(jl_olvidasteContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, -1));

        jl_password.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jl_password.setText("Password");
        PanelBase.add(jl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        jl_user.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jl_user.setText("Usuario");
        PanelBase.add(jl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        jl_bienvenida_text1.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jl_bienvenida_text1.setText("Bienvenido/a al Sistema de Gestión de  Seguridad Electrónica");
        PanelBase.add(jl_bienvenida_text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jl_bienvenida_text2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jl_bienvenida_text2.setText("Por favor, ingrese sus credenciales para acceder a su cuenta. ");
        PanelBase.add(jl_bienvenida_text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        subrayadoTextFields1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        subrayadoTextFields1.setText("_________________________________________________________________________________");
        PanelBase.add(subrayadoTextFields1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        subrayadoTextFields2.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        subrayadoTextFields2.setText("_________________________________________________________________________________");
        PanelBase.add(subrayadoTextFields2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        tf_pass.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tf_pass.setBorder(null);
        tf_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_passFocusLost(evt);
            }
        });
        tf_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_passActionPerformed(evt);
            }
        });
        PanelBase.add(tf_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 230, -1));

        jPanel2.setBackground(new java.awt.Color(17, 141, 192));
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

        panel_x.setBackground(new java.awt.Color(17, 141, 192));
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

        PanelBase.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Texto_autenticacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        PanelBase.add(Texto_autenticacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, -1));

        panel_boton_login.setBackground(new java.awt.Color(17, 141, 192));

        jl_boton_login.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jl_boton_login.setText("          Entrar");
        jl_boton_login.setToolTipText("");
        jl_boton_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_boton_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_boton_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_boton_loginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_boton_loginLayout = new javax.swing.GroupLayout(panel_boton_login);
        panel_boton_login.setLayout(panel_boton_loginLayout);
        panel_boton_loginLayout.setHorizontalGroup(
            panel_boton_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_boton_login, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );
        panel_boton_loginLayout.setVerticalGroup(
            panel_boton_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_boton_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        PanelBase.add(panel_boton_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, -1, 30));

        chk_mostrarPass.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        chk_mostrarPass.setText("Mostrar contraseña");
        chk_mostrarPass.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk_mostrarPassItemStateChanged(evt);
            }
        });
        chk_mostrarPass.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chk_mostrarPassStateChanged(evt);
            }
        });
        chk_mostrarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_mostrarPassActionPerformed(evt);
            }
        });
        PanelBase.add(chk_mostrarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        jl_bienvenida_text5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jl_bienvenida_text5.setText("Su seguridad es nuestra prioridad.");
        PanelBase.add(jl_bienvenida_text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_userActionPerformed

    private void tf_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_passActionPerformed

    private void tf_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_userFocusGained
       
        // Limpia el texto de autenticación
    Texto_autenticacion.setText("");
    // Si el texto es "Ingrese usuario", lo limpiamos y cambiamos el color
    if (tf_user.getText().equals("Ingrese usuario")) {
        tf_user.setText("");
        tf_user.setForeground(Color.BLACK);
    }  
    }//GEN-LAST:event_tf_userFocusGained

    private void tf_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_passFocusGained

    Texto_autenticacion.setText("");
    // Si el texto es "Ingrese contraseña", lo limpiamos y cambiamos el color
    if (new String(tf_pass.getPassword()).equals("Ingrese contraseña")) {
        tf_pass.setText("");
        tf_pass.setForeground(Color.BLACK);
        // Ajustamos el carácter de echo según el estado del checkbox
        if (check_box) {
            tf_pass.setEchoChar((char) 0);
        } else {
            tf_pass.setEchoChar('•');
        }
    }  
    }//GEN-LAST:event_tf_passFocusGained

    private void tf_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_userFocusLost
            // Si el campo está vacío, restablecemos el texto predeterminado y el color
    if (tf_user.getText().isEmpty()) {
        tf_user.setText("Ingrese usuario");
        tf_user.setForeground(Color.GRAY);
    }
    }//GEN-LAST:event_tf_userFocusLost

    private void jl_BotonXFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jl_BotonXFocusGained

    }//GEN-LAST:event_jl_BotonXFocusGained

    private void jl_BotonXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_BotonXMouseClicked
         dispose();
    }//GEN-LAST:event_jl_BotonXMouseClicked

    private void jl_BotonXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_BotonXMouseEntered

        panel_x.setBackground(Color.RED);
        // Cambia el color del texto del JLabel a blanco
        jl_BotonX.setForeground(Color.WHITE);
    }//GEN-LAST:event_jl_BotonXMouseEntered

    private void jl_BotonXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_BotonXMouseExited
       
        panel_x.setBackground(new Color(17,141,192));
        // Cambia el color del texto del JLabel a blanco
        jl_BotonX.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jl_BotonXMouseExited

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = getLocation().x;
        int y = getLocation().y;

        // Calcula la nueva posición del JFrame
        int newX = x + evt.getX() - initialClick.x;
        int newY = y + evt.getY() - initialClick.y;

        // Mueve el JFrame a la nueva posición
        setLocation(newX, newY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
     
        initialClick = evt.getPoint();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jl_olvidasteContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_olvidasteContraseñaMouseEntered

         jl_olvidasteContraseña.setForeground(new Color(6,199,242));
    }//GEN-LAST:event_jl_olvidasteContraseñaMouseEntered

    private void jl_boton_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_boton_loginMouseClicked
                String username = tf_user.getText();
                String password = new String(tf_pass.getPassword());

                if (authService.authenticate(username, password)) {
                    new LoginExitoso().setVisible(true);
      
                    Cargo = consulta.obtenerCargoOcupadoPorUsername(username);
                    
                    switch (Cargo) {
                case "Administrador":
                // Acción para Administrador
                new PanelAdministradorPrincipal(tf_user.getText()).setVisible(true);
                
                 break;
        
                 case "Almacenero":
                // Acción para Cajero
                new PanelAlmaceneroPrincipal(tf_user.getText()).setVisible(true);
                break;
                 case "Vendedor":
                // Acción para Vendedor
                new PanelVendedorPrincipal(tf_user.getText()).setVisible(true);
                 break;
                 default:
                
                      }
                    dispose();
                     
                } else {
                    Texto_autenticacion.setForeground(Color.red);
                    Texto_autenticacion.setText("Usuario o contraseña incorrectos");
                    new LoginFallido().setVisible(true);
                }
                //condicion para segun el rol de usuario se mostrara su panel correspondiente
                     // TODO add your handling code here:
    }//GEN-LAST:event_jl_boton_loginMouseClicked

    private void jl_olvidasteContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_olvidasteContraseñaMouseExited
        // TODO add your handling code here:
        jl_olvidasteContraseña.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jl_olvidasteContraseñaMouseExited

    private void jl_boton_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_boton_loginMouseEntered
        // TODO add your handling code here:
        jl_boton_login.setForeground(Color.WHITE);
        panel_boton_login.setBackground(new Color(6,199,242));
    }//GEN-LAST:event_jl_boton_loginMouseEntered

    private void jl_boton_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_boton_loginMouseExited
        // TODO add your handling code here:
        jl_boton_login.setForeground(new Color(0,0,0));
        panel_boton_login.setBackground(new Color(17,141,192));
    }//GEN-LAST:event_jl_boton_loginMouseExited

    private void tf_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_passFocusLost
       // Si el campo está vacío, restablecemos el texto predeterminado y el color
    if (new String(tf_pass.getPassword()).isEmpty()) {
        tf_pass.setText("Ingrese contraseña");
        tf_pass.setForeground(Color.GRAY);
        
        // Ajustamos el carácter de echo según el estado del checkbox
        if (!check_box) {
            tf_pass.setEchoChar((char) 0);
        }
    }
    }//GEN-LAST:event_tf_passFocusLost

    private void chk_mostrarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_mostrarPassActionPerformed

    }//GEN-LAST:event_chk_mostrarPassActionPerformed

    private void chk_mostrarPassStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chk_mostrarPassStateChanged
     
    }//GEN-LAST:event_chk_mostrarPassStateChanged

    private void chk_mostrarPassItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk_mostrarPassItemStateChanged
         // Verificar si el JCheckBox está seleccionado o no
    if (evt.getStateChange() == ItemEvent.SELECTED) {
        // Acción cuando el JCheckBox está seleccionado
        tf_pass.setEchoChar((char) 0);  // Mostrar el texto del JTextField sin ocultar
        check_box=true;
        
    } else {
        // Acción cuando el JCheckBox no está seleccionado
        tf_pass.setEchoChar('•');  // Ocultar el texto del JTextField con el carácter '•'
        check_box=false;
    }
    }//GEN-LAST:event_chk_mostrarPassItemStateChanged

   public static void main(String[] args) {
    try {
        System.out.println("Iniciando aplicación...");
        new Login().setVisible(true);
                
    } catch (Exception e) {
        System.err.println("Error al iniciar la aplicación:");
        e.printStackTrace();
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icon_Logo_head;
    private javax.swing.JPanel PanelBase;
    private javax.swing.JLabel Texto_autenticacion;
    private javax.swing.JCheckBox chk_mostrarPass;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jl_BotonX;
    private javax.swing.JLabel jl_bienvenida_text1;
    private javax.swing.JLabel jl_bienvenida_text2;
    private javax.swing.JLabel jl_bienvenida_text5;
    private javax.swing.JLabel jl_boton_login;
    private javax.swing.JLabel jl_copyrigth;
    private javax.swing.JLabel jl_fondo_panel;
    private javax.swing.JLabel jl_olvidasteContraseña;
    private javax.swing.JLabel jl_password;
    private javax.swing.JLabel jl_user;
    private javax.swing.JPanel panel_boton_login;
    private javax.swing.JPanel panel_x;
    private javax.swing.JLabel subrayadoTextFields1;
    private javax.swing.JLabel subrayadoTextFields2;
    private javax.swing.JPasswordField tf_pass;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}
