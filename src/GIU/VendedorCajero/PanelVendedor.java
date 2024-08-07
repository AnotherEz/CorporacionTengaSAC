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


public class PanelVendedor extends javax.swing.JFrame {
    Trabajador usuariocondatosreniec = new Trabajador();
    GridBagConstraints gbc = new GridBagConstraints();
    Empresa empresa = new Empresa();
    vendedor_menu_pop_1 pop_vendedor_menu=new vendedor_menu_pop_1();
    vendedor_menu_pop_2 pop_2= new vendedor_menu_pop_2();
    private Point initialClick;
     Dimension expandedSize = new Dimension(262, 660);
     Dimension originalSize= new Dimension(45, 660);
    public PanelVendedor() {
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
        jPanel2 = new javax.swing.JPanel();
        panel_x = new javax.swing.JPanel();
        jl_BotonX = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        contenedor_menupop = new javax.swing.JPanel();
        boton_menu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(1110, Short.MAX_VALUE)
                .addComponent(panel_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));

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

        contenedor_menupop.setBackground(new java.awt.Color(17, 141, 192));
        contenedor_menupop.setMinimumSize(new java.awt.Dimension(262, 660));
        contenedor_menupop.setPreferredSize(new java.awt.Dimension(45, 660));
        java.awt.GridBagLayout contenedor_menupopLayout = new java.awt.GridBagLayout();
        contenedor_menupopLayout.columnWidths = new int[] {1};
        contenedor_menupopLayout.rowHeights = new int[] {2};
        contenedor_menupopLayout.columnWeights = new double[] {0.5};
        contenedor_menupopLayout.rowWeights = new double[] {1.0};
        contenedor_menupop.setLayout(contenedor_menupopLayout);

        boton_menu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/menu20x20.png"))); // NOI18N
        boton_menu.setPreferredSize(new java.awt.Dimension(36, 36));
        boton_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_menuMouseClicked(evt);
            }
        });
        contenedor_menupop.add(boton_menu, new java.awt.GridBagConstraints());

        jLabel2.setBackground(new java.awt.Color(17, 141, 192));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/G_Usuario 20x20.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setMaximumSize(new java.awt.Dimension(43, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(43, 20));
        jLabel2.setName(""); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(45, 43));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        contenedor_menupop.add(jLabel2, gridBagConstraints);

        jLabel5.setBackground(new java.awt.Color(17, 141, 192));
        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/G_Cliente 20x20.png"))); // NOI18N
        jLabel5.setText("Apertura caja");
        jLabel5.setMaximumSize(new java.awt.Dimension(43, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(43, 20));
        jLabel5.setOpaque(true);
        jLabel5.setPreferredSize(new java.awt.Dimension(45, 43));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        contenedor_menupop.add(jLabel5, gridBagConstraints);

        jLabel6.setBackground(new java.awt.Color(17, 141, 192));
        jLabel6.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/G_Sedes 20x20.png"))); // NOI18N
        jLabel6.setText("Realizar cierre de caja");
        jLabel6.setMaximumSize(new java.awt.Dimension(43, 20));
        jLabel6.setMinimumSize(new java.awt.Dimension(43, 20));
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(45, 43));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        contenedor_menupop.add(jLabel6, gridBagConstraints);

        jLabel7.setBackground(new java.awt.Color(17, 141, 192));
        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/G_Proveedores 20x20.png"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(43, 20));
        jLabel7.setMinimumSize(new java.awt.Dimension(43, 20));
        jLabel7.setOpaque(true);
        jLabel7.setPreferredSize(new java.awt.Dimension(45, 43));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        contenedor_menupop.add(jLabel7, gridBagConstraints);

        jLabel12.setBackground(new java.awt.Color(17, 141, 192));
        jLabel12.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/G_Productos 20x20.png"))); // NOI18N
        jLabel12.setMaximumSize(new java.awt.Dimension(43, 20));
        jLabel12.setMinimumSize(new java.awt.Dimension(43, 20));
        jLabel12.setOpaque(true);
        jLabel12.setPreferredSize(new java.awt.Dimension(45, 43));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        contenedor_menupop.add(jLabel12, gridBagConstraints);

        jLabel8.setBackground(new java.awt.Color(17, 141, 192));
        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/C_Abastecimiento 20x20.png"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(43, 20));
        jLabel8.setMinimumSize(new java.awt.Dimension(43, 20));
        jLabel8.setOpaque(true);
        jLabel8.setPreferredSize(new java.awt.Dimension(45, 43));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        contenedor_menupop.add(jLabel8, gridBagConstraints);

        jLabel13.setBackground(new java.awt.Color(17, 141, 192));
        jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/G_Reporte 20x20.png"))); // NOI18N
        jLabel13.setMaximumSize(new java.awt.Dimension(43, 20));
        jLabel13.setMinimumSize(new java.awt.Dimension(43, 20));
        jLabel13.setOpaque(true);
        jLabel13.setPreferredSize(new java.awt.Dimension(45, 43));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 47, 0);
        contenedor_menupop.add(jLabel13, gridBagConstraints);

        jSeparator3.setForeground(new java.awt.Color(79, 93, 131));
        jSeparator3.setPreferredSize(new java.awt.Dimension(45, 3));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(206, 6, 0, 0);
        contenedor_menupop.add(jSeparator3, gridBagConstraints);

        jPanel1.add(contenedor_menupop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

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

    private void boton_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_menuMouseClicked
        // TODO add your handling code here:
       // contenedor_menupop.add(pop_2);
       // contenedor_menupop.revalidate();
        //contenedor_menupop.repaint();
        //contenedor_menupop.setPreferredSize(originalSize);
        gbc.gridx = 1; // Columna 1
        gbc.gridy = 0; // Fila 0
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        gbc.weighty = 1.0;
        contenedor_menupop.add(pop_2, gbc);

        // Establecer tamaño preferido del contenedor principal
        //Dimension originalSize = new Dimension(400, 200);
        contenedor_menupop.setPreferredSize(originalSize);

        //frame.add(mainPanel);
        //frame.setVisible(true);
    }//GEN-LAST:event_boton_menuMouseClicked

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
            java.util.logging.Logger.getLogger(PanelVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boton_menu;
    private javax.swing.JButton btn_guardarUsuario;
    private javax.swing.JPanel contenedor_menupop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jl_BotonX;
    private javax.swing.JPanel panel_x;
    private javax.swing.JTextField tf_dni;
    private javax.swing.JTextField tf_nombres;
    // End of variables declaration//GEN-END:variables
}
