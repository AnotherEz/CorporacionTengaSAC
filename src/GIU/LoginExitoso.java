package GIU;
import java.awt.Color;
import java.awt.Point;


public class LoginExitoso extends javax.swing.JFrame {
        private Point initialClick;
        
    public LoginExitoso() {
        initComponents();
         
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panel_x = new javax.swing.JPanel();
        jl_BotonX = new javax.swing.JLabel();
        jl_text1 = new javax.swing.JLabel();
        jp_aceptar = new javax.swing.JPanel();
        btn_aceptar = new javax.swing.JLabel();
        jl_text4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(370, 240));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(panel_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        jl_text1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jl_text1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check_correct.jpg"))); // NOI18N
        jPanel1.add(jl_text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 160, 100));

        jp_aceptar.setBackground(new java.awt.Color(17, 141, 192));

        btn_aceptar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btn_aceptar.setForeground(new java.awt.Color(255, 255, 255));
        btn_aceptar.setText("    Aceptar");
        btn_aceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_aceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_aceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_aceptarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jp_aceptarLayout = new javax.swing.GroupLayout(jp_aceptar);
        jp_aceptar.setLayout(jp_aceptarLayout);
        jp_aceptarLayout.setHorizontalGroup(
            jp_aceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jp_aceptarLayout.setVerticalGroup(
            jp_aceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jp_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 110, 30));

        jl_text4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jl_text4.setText("Inicio de sesión exitoso");
        jPanel1.add(jl_text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        panel_x.setBackground(new Color(17,141,192));
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

    private void btn_aceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aceptarMouseEntered
        btn_aceptar.setForeground(Color.WHITE);
        jp_aceptar.setBackground(new Color(6,199,242));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_aceptarMouseEntered

    private void btn_aceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aceptarMouseExited
 // TODO add your handling code here:
        btn_aceptar.setForeground(new Color(0,0,0));
        jp_aceptar.setBackground(new Color(17,141,192));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_aceptarMouseExited

    private void btn_aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aceptarMouseClicked
     dispose();     
    }//GEN-LAST:event_btn_aceptarMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_aceptar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jl_BotonX;
    private javax.swing.JLabel jl_text1;
    private javax.swing.JLabel jl_text4;
    private javax.swing.JPanel jp_aceptar;
    private javax.swing.JPanel panel_x;
    // End of variables declaration//GEN-END:variables
}
