package GIU.VendedorCajero;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class PanelVendedorPrincipal extends javax.swing.JFrame {
    private final CardLayout cardLayout;
    private Timer slideTimer;
    private boolean isMenuVisible=true;
    private final int panelWidth=282;
    private boolean isAnimating = false;
    opc_home opc_home = new opc_home();
    opc_venta opc_venta = new opc_venta();
    private Point initialClick;
    public PanelVendedorPrincipal() {
        initComponents();

    // Inicializa el CardLayout
    cardLayout = new CardLayout();

    // Asigna el CardLayout al panel
    panel_opcionseleccionada.setLayout(cardLayout);

    // Agrega los paneles al panel_opcionseleccionada
    panel_opcionseleccionada.add(opc_home, "Panel 1");
    panel_opcionseleccionada.add(opc_venta, "Panel 2");

    // Establece el panel inicial a mostrar
    cardLayout.show(panel_opcionseleccionada, "Panel 1");
    }
private void cambiarPanel(String nombrePanel) {
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
        btn_flujo_de_caja = new javax.swing.JLabel();
        btn_apertura_de_caja = new javax.swing.JLabel();
        btn_realizar_cierre_de_caja = new javax.swing.JLabel();
        btn_crear_nueva_venta = new javax.swing.JLabel();
        btn_consultar_venta = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btn_home = new javax.swing.JLabel();
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

        jPanel1.add(panel_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));

        panel_opciones.setBackground(new java.awt.Color(17, 141, 192));
        panel_opciones.setPreferredSize(new java.awt.Dimension(282, 660));
        panel_opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setDisplayedMnemonic('4');
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/usuario160x160.png"))); // NOI18N
        panel_opciones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        btn_flujo_de_caja.setBackground(new java.awt.Color(17, 141, 192));
        btn_flujo_de_caja.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        btn_flujo_de_caja.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_flujo_de_caja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/G Usuario 20x20.png"))); // NOI18N
        btn_flujo_de_caja.setText("        Flujo Caja");
        btn_flujo_de_caja.setToolTipText("");
        btn_flujo_de_caja.setAlignmentY(0.0F);
        btn_flujo_de_caja.setMaximumSize(new java.awt.Dimension(43, 20));
        btn_flujo_de_caja.setMinimumSize(new java.awt.Dimension(43, 20));
        btn_flujo_de_caja.setName(""); // NOI18N
        btn_flujo_de_caja.setOpaque(true);
        btn_flujo_de_caja.setPreferredSize(new java.awt.Dimension(262, 43));
        btn_flujo_de_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_flujo_de_cajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_flujo_de_cajaMouseExited(evt);
            }
        });
        panel_opciones.add(btn_flujo_de_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        btn_apertura_de_caja.setBackground(new java.awt.Color(17, 141, 192));
        btn_apertura_de_caja.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        btn_apertura_de_caja.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_apertura_de_caja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/G Cliente 20x20.png"))); // NOI18N
        btn_apertura_de_caja.setText("       Apertura caja");
        btn_apertura_de_caja.setMaximumSize(new java.awt.Dimension(43, 20));
        btn_apertura_de_caja.setMinimumSize(new java.awt.Dimension(43, 20));
        btn_apertura_de_caja.setOpaque(true);
        btn_apertura_de_caja.setPreferredSize(new java.awt.Dimension(262, 43));
        btn_apertura_de_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_apertura_de_cajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_apertura_de_cajaMouseExited(evt);
            }
        });
        panel_opciones.add(btn_apertura_de_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        btn_realizar_cierre_de_caja.setBackground(new java.awt.Color(17, 141, 192));
        btn_realizar_cierre_de_caja.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        btn_realizar_cierre_de_caja.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_realizar_cierre_de_caja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/G Sedes 20x20.png"))); // NOI18N
        btn_realizar_cierre_de_caja.setText("       Realizar cierre de caja");
        btn_realizar_cierre_de_caja.setMaximumSize(new java.awt.Dimension(43, 20));
        btn_realizar_cierre_de_caja.setMinimumSize(new java.awt.Dimension(43, 20));
        btn_realizar_cierre_de_caja.setOpaque(true);
        btn_realizar_cierre_de_caja.setPreferredSize(new java.awt.Dimension(262, 43));
        btn_realizar_cierre_de_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_realizar_cierre_de_cajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_realizar_cierre_de_cajaMouseExited(evt);
            }
        });
        panel_opciones.add(btn_realizar_cierre_de_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        btn_crear_nueva_venta.setBackground(new java.awt.Color(17, 141, 192));
        btn_crear_nueva_venta.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        btn_crear_nueva_venta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_crear_nueva_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/G Proveedores 20x20.png"))); // NOI18N
        btn_crear_nueva_venta.setText("        Crear nueva venta");
        btn_crear_nueva_venta.setMaximumSize(new java.awt.Dimension(43, 20));
        btn_crear_nueva_venta.setMinimumSize(new java.awt.Dimension(43, 20));
        btn_crear_nueva_venta.setOpaque(true);
        btn_crear_nueva_venta.setPreferredSize(new java.awt.Dimension(262, 43));
        btn_crear_nueva_venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crear_nueva_ventaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_crear_nueva_ventaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_crear_nueva_ventaMouseExited(evt);
            }
        });
        panel_opciones.add(btn_crear_nueva_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        btn_consultar_venta.setBackground(new java.awt.Color(17, 141, 192));
        btn_consultar_venta.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        btn_consultar_venta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_consultar_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/G Productos 20x20.png"))); // NOI18N
        btn_consultar_venta.setText("         Consultar venta");
        btn_consultar_venta.setMaximumSize(new java.awt.Dimension(43, 20));
        btn_consultar_venta.setMinimumSize(new java.awt.Dimension(43, 20));
        btn_consultar_venta.setOpaque(true);
        btn_consultar_venta.setPreferredSize(new java.awt.Dimension(262, 43));
        btn_consultar_venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_consultar_ventaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_consultar_ventaMouseExited(evt);
            }
        });
        panel_opciones.add(btn_consultar_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        jLabel14.setFont(new java.awt.Font("Source Code Pro Black", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Lucía Farfán");
        panel_opciones.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, -1));

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

        jPanel1.add(panel_opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        panel_opcionseleccionada.setBackground(new java.awt.Color(255, 255, 255));
        panel_opcionseleccionada.setPreferredSize(new java.awt.Dimension(868, 660));
        panel_opcionseleccionada.setLayout(new java.awt.CardLayout());
        jPanel1.add(panel_opcionseleccionada, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 40, -1, -1));

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
        // TODO add your handling code here:
      //  PanelMenuPop.remove(pop_vendedor_menu);
        //PanelPopVendedor.setVisible(true);
        //Contenedor_PanelMenuPop.revalidate();
       // Contenedor_PanelMenuPop.repaint();
       //Contenedor_PanelMenuPop.setPreferredSize(originalSize);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void boton_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_menuMouseClicked
        // TODO add your handling code here:
        
        toggleMenu();
        
        panel_opciones.revalidate();
        panel_opciones.repaint();
    }//GEN-LAST:event_boton_menuMouseClicked

    private void btn_flujo_de_cajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_flujo_de_cajaMouseEntered
        // TODO add your handling code here:
        
          btn_flujo_de_caja.setBackground(new Color(6,199,242));
          
         btn_flujo_de_caja.setForeground(Color.WHITE);
        // Cambia el color del texto del JLabel a blanco
        //jl_BotonX.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_flujo_de_cajaMouseEntered

    private void btn_flujo_de_cajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_flujo_de_cajaMouseExited
        // TODO add your handling code here:
        
       // btn_flujo_de_caja.setBackground(Color.WHITE);
         btn_flujo_de_caja.setBackground(new Color(17,141,192));
          btn_flujo_de_caja.setForeground(Color.BLACK);
    }//GEN-LAST:event_btn_flujo_de_cajaMouseExited

    private void btn_apertura_de_cajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_apertura_de_cajaMouseEntered

          btn_apertura_de_caja.setBackground(new Color(6,199,242));
          
         btn_apertura_de_caja.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_apertura_de_cajaMouseEntered

    private void btn_realizar_cierre_de_cajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_realizar_cierre_de_cajaMouseEntered

          btn_realizar_cierre_de_caja.setBackground(new Color(6,199,242));
          
         btn_realizar_cierre_de_caja.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_realizar_cierre_de_cajaMouseEntered

    private void btn_crear_nueva_ventaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crear_nueva_ventaMouseEntered

          btn_crear_nueva_venta.setBackground(new Color(6,199,242));
          
         btn_crear_nueva_venta.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_crear_nueva_ventaMouseEntered

    private void btn_consultar_ventaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_consultar_ventaMouseEntered

          btn_consultar_venta.setBackground(new Color(6,199,242));
          
        btn_consultar_venta.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_consultar_ventaMouseEntered

    private void btn_apertura_de_cajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_apertura_de_cajaMouseExited
 btn_apertura_de_caja.setBackground(new Color(17,141,192));
          btn_apertura_de_caja.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_apertura_de_cajaMouseExited

    private void btn_realizar_cierre_de_cajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_realizar_cierre_de_cajaMouseExited
 btn_realizar_cierre_de_caja.setBackground(new Color(17,141,192));
          btn_realizar_cierre_de_caja.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_realizar_cierre_de_cajaMouseExited

    private void btn_crear_nueva_ventaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crear_nueva_ventaMouseExited
 btn_crear_nueva_venta.setBackground(new Color(17,141,192));
          btn_crear_nueva_venta.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_crear_nueva_ventaMouseExited

    private void btn_consultar_ventaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_consultar_ventaMouseExited
 btn_consultar_venta.setBackground(new Color(17,141,192));
          btn_consultar_venta.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_consultar_ventaMouseExited

    private void btn_crear_nueva_ventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crear_nueva_ventaMouseClicked
       
        cambiarPanel("Panel 2");
    }//GEN-LAST:event_btn_crear_nueva_ventaMouseClicked

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
            java.util.logging.Logger.getLogger(PanelVendedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelVendedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelVendedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelVendedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelVendedorPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boton_menu;
    private javax.swing.JLabel btn_apertura_de_caja;
    private javax.swing.JLabel btn_consultar_venta;
    private javax.swing.JLabel btn_crear_nueva_venta;
    private javax.swing.JLabel btn_flujo_de_caja;
    private javax.swing.JLabel btn_home;
    private javax.swing.JLabel btn_realizar_cierre_de_caja;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jl_BotonX;
    private javax.swing.JPanel panel_opciones;
    private javax.swing.JPanel panel_opcionseleccionada;
    private javax.swing.JPanel panel_superior;
    private javax.swing.JPanel panel_x;
    // End of variables declaration//GEN-END:variables
}
