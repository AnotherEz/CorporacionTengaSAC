package GIU.Admi;
import Clases.Trabajador;
import Conexion.ConsultasDatabase;
import GIU.Login;
import GIU.VendedorCajero.opc_aperturar_caja;
import GIU.VendedorCajero.opc_cerrar_caja;
import GIU.VendedorCajero.opc_consultar_venta;
import GIU.VendedorCajero.opc_flujo_de_caja;
import GIU.VendedorCajero.opc_home;
import GIU.VendedorCajero.opc_venta;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class PanelAdministradorPrincipal extends javax.swing.JFrame {
    private Trabajador usuario=new Trabajador();
    opc_home opc_home;
    private ConsultasDatabase consult=new ConsultasDatabase();
    private final CardLayout cardLayout;
    private Timer slideTimer;
    private boolean isMenuVisible=true;
    private final int panelWidth=282;
    private boolean isAnimating = false;
    opc_venta opc_venta = new opc_venta();
    opc_aperturar_caja opc_aperturar_caja = new opc_aperturar_caja();
    opc_consultar_venta opc_consultar_venta = new opc_consultar_venta();
    opc_cerrar_caja opc_cerrar_caja= new opc_cerrar_caja();
    opc_flujo_de_caja opc_flujo_de_caja=new opc_flujo_de_caja();
    private Point initialClick;
    public PanelAdministradorPrincipal(String user) {
        consult.obtenerDatosPorUsername(user,usuario);
        opc_home = new opc_home(usuario);
        initComponents();

    // Inicializa el CardLayout
    cardLayout = new CardLayout();

    // Asigna el CardLayout al panel
    panel_opcionseleccionada.setLayout(cardLayout);

    // Agrega los paneles al panel_opcionseleccionada
    panel_opcionseleccionada.add(opc_home, "Panel 1");
    panel_opcionseleccionada.add(opc_venta, "Panel 2");
    panel_opcionseleccionada.add(opc_aperturar_caja, "Panel 3");
    panel_opcionseleccionada.add(opc_consultar_venta, "Panel 4");
    panel_opcionseleccionada.add(opc_cerrar_caja, "Panel 5");
    panel_opcionseleccionada.add(opc_flujo_de_caja, "Panel 6");
    
    cambiarPanel("Panel 1");
    }

   
private void cambiarPanel(String nombrePanel) {
        toggleMenu();
        panel_opciones.revalidate();
        panel_opciones.repaint();
        cardLayout.show(panel_opcionseleccionada, nombrePanel);
}
private void toggleMenu() {
    if (isAnimating) {
        // Si ya está animando, reiniciar la animación
        slideTimer.stop();
        isAnimating = false;
    }

    // Configurar los parámetros de animación
    int start = isMenuVisible ? 0 : -panelWidth;
    int end = isMenuVisible ? -panelWidth : 0;
    int step = isMenuVisible ? -10 : 10;

    slideTimer = new Timer(5, new ActionListener() {
        int currentPos = start;

        @Override
        public void actionPerformed(ActionEvent e) {
            currentPos += step;

            // Asegurarse de que no se pase de la posición final
            if ((step > 0 && currentPos >= end) || (step < 0 && currentPos <= end)) {
                currentPos = end; // Colocar el panel exactamente en la posición final
                slideTimer.stop();
                isAnimating = false;
                isMenuVisible = !isMenuVisible;
            }

            // Ajustar el panel en la posición X actual, manteniendo Y constante
            panel_opciones.setBounds(currentPos, panel_opciones.getY(), panelWidth, panel_opciones.getHeight());
        }
    });

    // Iniciar la animación
    isAnimating = true;
    slideTimer.start();
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_superior = new javax.swing.JPanel();
        panel_x = new javax.swing.JPanel();
        jl_BotonX = new javax.swing.JLabel();
        boton_menu = new javax.swing.JLabel();
        panel_opciones = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_gestionar_clientes = new javax.swing.JLabel();
        cargo_user = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btn_home = new javax.swing.JLabel();
        name_user = new javax.swing.JLabel();
        btn_cerrar_sesion = new javax.swing.JLabel();
        panel_opcionseleccionada = new javax.swing.JPanel();

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

        panel_superior.setBackground(new java.awt.Color(17, 141, 192));
        panel_superior.setPreferredSize(new java.awt.Dimension(1150, 40));
        panel_superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_superiorMouseDragged(evt);
            }
        });
        panel_superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_superiorMousePressed(evt);
            }
        });

        panel_x.setBackground(new java.awt.Color(17, 141, 192));
        panel_x.setPreferredSize(new java.awt.Dimension(40, 40));

        jl_BotonX.setFont(new java.awt.Font("Aero Matics", 1, 36)); // NOI18N
        jl_BotonX.setText("X");
        jl_BotonX.setPreferredSize(new java.awt.Dimension(40, 40));
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
                .addComponent(jl_BotonX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_xLayout.setVerticalGroup(
            panel_xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_xLayout.createSequentialGroup()
                .addComponent(jl_BotonX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        boton_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/menu20x20.png"))); // NOI18N
        boton_menu.setPreferredSize(new java.awt.Dimension(45, 40));
        boton_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_menuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_superiorLayout = new javax.swing.GroupLayout(panel_superior);
        panel_superior.setLayout(panel_superiorLayout);
        panel_superiorLayout.setHorizontalGroup(
            panel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_superiorLayout.createSequentialGroup()
                .addComponent(boton_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1065, Short.MAX_VALUE)
                .addComponent(panel_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_superiorLayout.setVerticalGroup(
            panel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_superiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(panel_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel_opciones.setBackground(new java.awt.Color(17, 141, 192));
        panel_opciones.setPreferredSize(new java.awt.Dimension(282, 660));
        panel_opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setDisplayedMnemonic('4');
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/usuario160x160.png"))); // NOI18N
        panel_opciones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        btn_gestionar_clientes.setBackground(new java.awt.Color(17, 141, 192));
        btn_gestionar_clientes.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        btn_gestionar_clientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_gestionar_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/G Usuario 20x20.png"))); // NOI18N
        btn_gestionar_clientes.setText("Gestionar clientes");
        btn_gestionar_clientes.setToolTipText("");
        btn_gestionar_clientes.setAlignmentY(0.0F);
        btn_gestionar_clientes.setMaximumSize(new java.awt.Dimension(43, 20));
        btn_gestionar_clientes.setMinimumSize(new java.awt.Dimension(43, 20));
        btn_gestionar_clientes.setName(""); // NOI18N
        btn_gestionar_clientes.setOpaque(true);
        btn_gestionar_clientes.setPreferredSize(new java.awt.Dimension(262, 43));
        btn_gestionar_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_gestionar_clientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_gestionar_clientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_gestionar_clientesMouseExited(evt);
            }
        });
        panel_opciones.add(btn_gestionar_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        cargo_user.setFont(new java.awt.Font("Source Code Pro Black", 0, 14)); // NOI18N
        cargo_user.setForeground(new java.awt.Color(255, 255, 255));
        cargo_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cargo_user.setText("Cargo: "+usuario.getCargo()
        );
        panel_opciones.add(cargo_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setPreferredSize(new java.awt.Dimension(260, 3));
        panel_opciones.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 262, -1, -1));

        btn_home.setBackground(new java.awt.Color(17, 141, 192));
        btn_home.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        btn_home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/G Usuario 20x20.png"))); // NOI18N
        btn_home.setText("         Home");
        btn_home.setToolTipText("");
        btn_home.setAlignmentY(0.0F);
        btn_home.setMaximumSize(new java.awt.Dimension(43, 20));
        btn_home.setMinimumSize(new java.awt.Dimension(43, 20));
        btn_home.setName(""); // NOI18N
        btn_home.setOpaque(true);
        btn_home.setPreferredSize(new java.awt.Dimension(262, 43));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_homeMouseExited(evt);
            }
        });
        panel_opciones.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        name_user.setFont(new java.awt.Font("Source Code Pro Black", 0, 14)); // NOI18N
        name_user.setForeground(new java.awt.Color(255, 255, 255));
        name_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_user.setText(usuario.getNombreCompleto());
        panel_opciones.add(name_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 260, -1));

        btn_cerrar_sesion.setBackground(new java.awt.Color(17, 141, 192));
        btn_cerrar_sesion.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        btn_cerrar_sesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CerrarSesion_20x20.png"))); // NOI18N
        btn_cerrar_sesion.setText("           Cerrar sesion");
        btn_cerrar_sesion.setMaximumSize(new java.awt.Dimension(43, 20));
        btn_cerrar_sesion.setMinimumSize(new java.awt.Dimension(43, 20));
        btn_cerrar_sesion.setOpaque(true);
        btn_cerrar_sesion.setPreferredSize(new java.awt.Dimension(262, 43));
        btn_cerrar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cerrar_sesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cerrar_sesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cerrar_sesionMouseExited(evt);
            }
        });
        panel_opciones.add(btn_cerrar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        jPanel1.add(panel_opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        panel_opcionseleccionada.setBackground(new java.awt.Color(255, 255, 255));
        panel_opcionseleccionada.setPreferredSize(new java.awt.Dimension(1150, 660));
        panel_opcionseleccionada.setLayout(new java.awt.CardLayout());
        jPanel1.add(panel_opcionseleccionada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panel_superiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_superiorMousePressed
        // TODO add your handling code here:
        initialClick = evt.getPoint();
    }//GEN-LAST:event_panel_superiorMousePressed

    private void panel_superiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_superiorMouseDragged
        int x = getLocation().x;
        int y = getLocation().y;

        // Calcula la nueva posición del JFrame
        int newX = x + evt.getX() - initialClick.x;
        int newY = y + evt.getY() - initialClick.y;

        // Mueve el JFrame a la nueva posición
        setLocation(newX, newY);
    }//GEN-LAST:event_panel_superiorMouseDragged

    private void jl_BotonXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_BotonXMouseExited
        // TODO add your handling code here:
        // TODO add your handling code here:
        panel_x.setBackground(new Color(17,141,192));
        // Cambia el color del texto del JLabel a blanco
        jl_BotonX.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jl_BotonXMouseExited

    private void jl_BotonXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_BotonXMouseEntered
        // TODO add your handling code here:
        // TODO add your handling code here:
        panel_x.setBackground(Color.RED);
        // Cambia el color del texto del JLabel a blanco
        jl_BotonX.setForeground(Color.WHITE);
    }//GEN-LAST:event_jl_BotonXMouseEntered

    private void jl_BotonXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_BotonXMouseClicked

        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jl_BotonXMouseClicked

    private void jl_BotonXFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jl_BotonXFocusGained

    }//GEN-LAST:event_jl_BotonXFocusGained

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void boton_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_menuMouseClicked
        // TODO add your handling code here:
        
        toggleMenu();
        panel_opciones.revalidate();
        panel_opciones.repaint();
    }//GEN-LAST:event_boton_menuMouseClicked

    private void btn_gestionar_clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gestionar_clientesMouseEntered
        // TODO add your handling code here:
        
          btn_gestionar_clientes.setBackground(new Color(6,199,242));
          
         btn_gestionar_clientes.setForeground(Color.WHITE);
        // Cambia el color del texto del JLabel a blanco
        //jl_BotonX.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_gestionar_clientesMouseEntered

    private void btn_gestionar_clientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gestionar_clientesMouseExited
        // TODO add your handling code here:
        
       // btn_flujo_de_caja.setBackground(Color.WHITE);
         btn_gestionar_clientes.setBackground(new Color(17,141,192));
          btn_gestionar_clientes.setForeground(Color.BLACK);
    }//GEN-LAST:event_btn_gestionar_clientesMouseExited

    private void btn_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseEntered
        // TODO add your handling code here:
        
        btn_home.setBackground(new Color(6,199,242));
        btn_home.setForeground(Color.WHITE);  
       
    }//GEN-LAST:event_btn_homeMouseEntered

    private void btn_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseExited
        // TODO add your handling code here:
       
        btn_home.setBackground(new Color(17,141,192));
          btn_home.setForeground(Color.BLACK);        // TODO add your handling code here:
                        
    }//GEN-LAST:event_btn_homeMouseExited

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        // TODO add your handling code here:
        cambiarPanel("Panel 1");
      
    }//GEN-LAST:event_btn_homeMouseClicked

    private void btn_gestionar_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gestionar_clientesMouseClicked
        
    }//GEN-LAST:event_btn_gestionar_clientesMouseClicked

    private void btn_cerrar_sesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionMouseEntered

        btn_cerrar_sesion.setBackground(new Color(6,199,242));

        btn_cerrar_sesion.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cerrar_sesionMouseEntered

    private void btn_cerrar_sesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionMouseExited
        btn_cerrar_sesion.setBackground(new Color(17,141,192));
        btn_cerrar_sesion.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cerrar_sesionMouseExited

    private void btn_cerrar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionMouseClicked
         dispose();
         try {
        System.out.println("Iniciando aplicación...");
        new Login().setVisible(true);
                
    } catch (Exception e) {
        System.err.println("Error al iniciar la aplicación:");
        e.printStackTrace();
    }
    }//GEN-LAST:event_btn_cerrar_sesionMouseClicked



    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boton_menu;
    private javax.swing.JLabel btn_cerrar_sesion;
    private javax.swing.JLabel btn_gestionar_clientes;
    private javax.swing.JLabel btn_home;
    private javax.swing.JLabel cargo_user;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jl_BotonX;
    private javax.swing.JLabel name_user;
    private javax.swing.JPanel panel_opciones;
    private javax.swing.JPanel panel_opcionseleccionada;
    private javax.swing.JPanel panel_superior;
    private javax.swing.JPanel panel_x;
    // End of variables declaration//GEN-END:variables
}
